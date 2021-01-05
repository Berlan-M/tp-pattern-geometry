package org.acme.geometry;

public class GeometryWithcachedEnvelope implements Geometry, GeometryListener {
	private Geometry original;
	private Envelope cachedEnvelope;
	
	public GeometryWithcachedEnvelope(Geometry original) {
		this.original = original;
	}
	
	public Geometry getOriginal() {
		return this.original;
	}
	public Envelope getCachedEnvelope () {
		return this.cachedEnvelope;
	}
	@Override
	public String getType() {
		
		return this.original.getType();
	}
	@Override
	public boolean isEmpty() {
		
		return this.original.isEmpty();
	}
	@Override
	public void translate(double dx, double dy) {
		
		this.original.translate(dx, dy);
		
	}
	@Override
	public Geometry clone() {
		
		return this.original.clone();
	}
	@Override
	public Envelope getEnvelope() {
		
		return this.cachedEnvelope;
	}
	@Override
	public void accept(GeometryVisitor visitor) {
		
		this.original.accept(visitor);
		
	}

	@Override
	public String asText() {
		return this.original.asText();
	}

	@Override
	public void addListener(GeometryListener listerner) {
		this.original.addListener(listerner);
	}
	
	@Override
	public void onChange(Geometry geometry) {
		this.cachedEnvelope = null;
	}
	
}
