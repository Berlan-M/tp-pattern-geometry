package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {
	public static final double EPSILON = 1.0e-15;
	@Test
	public void testDefaultConstructor(){
		
		Envelope e = new Envelope();
		Assert.assertEquals(false, e.isEmpty());
	}
	@Test
	public void testConstructor(){
		// TODO
		Envelope e = new Envelope(new Coordinate(2.0,3.0),new Coordinate(5.0,7.0));
		Assert.assertEquals(2.0, e.getBotom().getX(), EPSILON);
		Assert.assertEquals(3.0, e.getBotom().getY(), EPSILON);
		Assert.assertEquals(5.0, e.getTop().getX(), EPSILON);
		Assert.assertEquals(7.0, e.getTop().getY(), EPSILON);
	}
	@Test
	public void testGetBotom(){
		// TODO
		Envelope e = new Envelope(new Coordinate(2.0,3.0),new Coordinate(5.0,7.0));
		Assert.assertEquals(2.0, e.getBotom().getX(), EPSILON);
		Assert.assertEquals(3.0, e.getBotom().getY(), EPSILON);
		
	}
	@Test
	public void testGetTop(){
		// TODO
		Envelope e = new Envelope(new Coordinate(2.0,3.0),new Coordinate(5.0,7.0));
		Assert.assertEquals(5.0, e.getTop().getX(), EPSILON);
		Assert.assertEquals(7.0, e.getTop().getY(), EPSILON);
		
	}
	public void testXmin(){
		// TODO
		Envelope e = new Envelope(new Coordinate(2.0,3.0),new Coordinate(5.0,7.0));
		Assert.assertEquals(2.0, e.getXmin(), EPSILON);
		
	}
	public void testYmin(){
		// TODO
		Envelope e = new Envelope(new Coordinate(2.0,3.0),new Coordinate(5.0,7.0));
		Assert.assertEquals(3.0, e.getYmin(), EPSILON);
		
	}
	public void testXmax(){
		// TODO
		Envelope e = new Envelope(new Coordinate(2.0,3.0),new Coordinate(5.0,7.0));
		Assert.assertEquals(5.0, e.getXmax(), EPSILON);
		
	}
	public void testYmax(){
		// TODO
		Envelope e = new Envelope(new Coordinate(2.0,3.0),new Coordinate(5.0,7.0));
		Assert.assertEquals(7.0, e.getYmax(), EPSILON);
		
	}
	
}
