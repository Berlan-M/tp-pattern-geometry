package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LogGeomVisitorTest {
	
	@Test
	public void testVisitPoint() {
		
		ByteArrayOutputStream bst = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(bst);
		
		LogGeometryVisitor visitor = new LogGeometryVisitor(out);
		Geometry geometry = new Point(new Coordinate(5.0, 4.0));
		geometry.accept(visitor);
		
		String result = bst.toString();
		String visit = "I am a point with x=5.0 et y=4.0";
		
		Assert.assertEquals(visit, result);

	}
	
	@Test
	public void testVisitLineString() {

        ByteArrayOutputStream bs = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(bs);
		
		List<Point> points = new ArrayList<Point>();
        points.add(new Point(new Coordinate(2.0, 3.0)));
        points.add(new Point(new Coordinate(1.0, 4.0)));
        Geometry geometry = new LineString(points);	
		LogGeometryVisitor visitor = new LogGeometryVisitor(out);
		geometry.accept(visitor);

		String visit = "Je suis une polyligne définie par 2 point(s)";
		String result = bs.toString();
		
		Assert.assertEquals(visit, result);

	}
	

}