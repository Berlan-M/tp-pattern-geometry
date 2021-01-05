package org.acme.geometry;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class WktWriterTest {
	
	
	@Test
	public void testWritePointGeom() {
		Geometry g = new Point(new Coordinate(5.0,5.0));
		WktWriter writer = new WktWriter();
		Assert.assertEquals("Point(5.0 5.0)", writer.write(g));
	}
	
	
	@Test
	public void testWriteLineStringGeom() {
		List<Point> points = new ArrayList<Point>();
        points.add(new Point(new Coordinate(2.0, 4.0)));
        points.add(new Point(new Coordinate(1.0, 2.0)));
        Geometry g = new LineString(points);
		WktWriter writer = new WktWriter();
		
		Assert.assertEquals("LINESTRING(2.0 4.0,1.0 2.0)", writer.write(g));
	}
	
}