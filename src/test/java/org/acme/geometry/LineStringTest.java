package org.acme.geometry;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		// TODO
		LineString l = new LineString();
		Assert.assertEquals(0, l.getNumPoints(), EPSILON);
	}
	@Test
	public void testConstructor(){
		// TODO
		List<Point> points = new ArrayList<Point>();
		points.add(new Point());
		points.add(new Point(new Coordinate(5.0, 4.0)));
		
		LineString l = new LineString(points);
		Assert.assertEquals(2, l.getNumPoints());
		
		Assert.assertEquals(false, l.getPointN(0).isEmpty());
		Assert.assertEquals(false, l.isEmpty());
		
		Assert.assertEquals(5.0, l.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, l.getPointN(1).getCoordinate().getY(), EPSILON);
	}
	@Test
	public void testGetType(){
		// TODO
		LineString l = new LineString();
		Assert.assertEquals("LineString", l.getType());
	}
	@Test
	public void testTranslate(){
		// TODO
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(new Coordinate(3.0, 4.0)));
		
		LineString l = new LineString(points);
		
		l.translate(1.0, 1.0);
		
		Assert.assertEquals(false, l.isEmpty());
		Assert.assertEquals(4.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(5.0, l.getPointN(0).getCoordinate().getY(), EPSILON);
	}
	@Test
	public void testClone(){
		// TODO
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(new Coordinate(3.0, 4.0)));
		
		LineString l = new LineString(points);
		Geometry copy = l.clone();
		
		copy.translate(1.0, 1.0);
		
		Assert.assertEquals(3.0, l.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, l.getPointN(0).getCoordinate().getY(), EPSILON);
	}
	public void getEnvelope(){
		// TODO
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(new Coordinate(3.0, 4.0)));
		points.add(new Point(new Coordinate(5.0, 6.0)));
		LineString l = new LineString(points);
		
		Envelope e = l.getEnvelope();
		Assert.assertEquals(6.0, e.getTop().getX(), EPSILON);
		Assert.assertEquals(7.0, e.getTop().getY(), EPSILON);
		Assert.assertEquals(2.0, e.getBotom().getX(), EPSILON);
		Assert.assertEquals(3.0, e.getBotom().getY(), EPSILON);
		
	}
}
