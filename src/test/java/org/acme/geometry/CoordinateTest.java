package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		// TODO
		Coordinate c = new Coordinate();
		Assert.assertTrue(c.isEmpty());
		
	}
	@Test
	public void testConstructor(){
		// TODO
		Coordinate c = new Coordinate(2.0,3.0);
		Assert.assertEquals(2.0, c.getX(), EPSILON);
		Assert.assertEquals(3.0, c.getY(), EPSILON);
		Assert.assertEquals(false, c.isEmpty());
	}
}
