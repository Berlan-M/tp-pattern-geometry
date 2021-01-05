package org.acme.geometry;

import java.util.List;

public abstract class AbstractGeometry implements Geometry{
	
	private List<GeometryListener> listerners;
	
	public String asText() {
		
		WktVisitor visitor = new WktVisitor();
		accept(visitor);
		return visitor.getResult();
	}
	
	public Envelope getEnvelope() {
		EnvelopeBuilder builder = new EnvelopeBuilder();
		accept(builder);
		return builder.build();
	}
	
	public abstract Geometry clone();
	
	public void addListener(GeometryListener listener) {
		this.listerners.add(listener);
	}
	
	protected void triggerChange() {
		for (GeometryListener listener : listerners) {
			listener.onChange(this);
		}
	}

}
