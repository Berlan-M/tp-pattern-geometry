package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometrycachedEnvelopeTest {
	public static final double EPSILON = 1.0e-15;

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
	@Test
	public void testTranslate() {
		Geometry g = new Point(new Coordinate(3.0, 3.0));
		g = new GeometryWithcachedEnvelope(g);
		Envelope a = g.getEnvelope();
		g.translate(1.0, 3.0);
		Envelope b = g.getEnvelope();
		Assert.assertNotEquals(a.getXmax(), b.getXmax(), EPSILON);
	}
	
	@Test
	public void testClone() {
		Geometry geom = new Point(new Coordinate(4.0, 3.0));
		geom = new GeometryWithcachedEnvelope(geom);
		Envelope e = geom.getEnvelope();
		Geometry copy = geom.clone();
		Envelope eb = copy.getEnvelope();
		Assert.assertEquals(e.getXmax(), eb.getXmax(), EPSILON);
	}
	
	@Test
	public void testAccept() {
		GeometryVisitor builder = new EnvelopeBuilder();
		Geometry geom = new Point(new Coordinate(3.0, 7.0));
		geom = new GeometryWithcachedEnvelope(geom);
		geom.accept(builder);
		Assert.assertEquals(3.0, geom.getEnvelope().getXmin(), EPSILON);
	}
	
}
