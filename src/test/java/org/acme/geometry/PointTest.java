package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		
		Point p = new Point();
		Assert.assertEquals(false, p.isEmpty());
	}
	@Test
	public void testConstructor(){
		// TODO
		Point p = new Point(new Coordinate(2.0,3.0));
		Assert.assertEquals(2.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(3.0, p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testGetType(){
		// TODO
		Point p = new Point();
		Assert.assertEquals("Point", p.getType());
	}
	
	@Test
	public void testTranslate(){
		
		Point p = new Point(new Coordinate(2.0, 3.0));
		p.translate(1.0, 2.0);
		Assert.assertEquals(3.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(5.0, p.getCoordinate().getY(), EPSILON);
	}
	@Test
	public void testClone(){
		// TODO
		Point p = new Point(new Coordinate(3.0, 4.0));
		Geometry copy =  p.clone();
		copy.translate(1.0, 1.0);
		
		Assert.assertSame(p.getType(),copy.getType());
		
	}
	@Test
	public void getEnvelope(){
		// TODO
		Point p = new Point(new Coordinate(3.0, 4.0));
		Envelope e = p.getEnvelope();
		Assert.assertEquals(4.0, e.getTop().getX(), EPSILON);
		Assert.assertEquals(5.0, e.getTop().getY(), EPSILON);
		Assert.assertEquals(2.0, e.getBotom().getX(), EPSILON);
		Assert.assertEquals(3.0, e.getTop().getX(), EPSILON);
		
	}
	
	
	
	
	
	
	
	
	
	
}
