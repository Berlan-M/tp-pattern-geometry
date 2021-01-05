package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometrycachedEnvelopeTest {

	@Test
	public void testGetEnvelope() {
		Geometry geom = new Point(new Coordinate(4.0, 5.0));
		
		geom= new GeometryWithcachedEnvelope(geom);
		
		Envelope e = geom.getEnvelope();
		
		Envelope eb = geom.getEnvelope();
		
		Assert.assertSame(e, eb);
	}
	
	@Test
	public void testGetType() {
		Geometry geom = new Point(new Coordinate(3.0, 9.0));
		
		geom  = new GeometryWithcachedEnvelope(geom);
		
		Assert.assertEquals("Point", geom.getType());
	}
	
	
	
}
