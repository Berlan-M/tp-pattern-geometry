package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;


public class EnvelopBuilderTest {
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		
		EnvelopeBuilder eb = new EnvelopeBuilder();
		Assert.assertEquals(0, eb.getCoordExtremites().size());
	}
	@Test
	public void testInsert(){
		
		EnvelopeBuilder eb = new EnvelopeBuilder();
		eb.insert(new Coordinate(4.0,3.0));
		Assert.assertEquals(1, eb.getCoordExtremites().size());
		
	}
	@Test
	public void testBuild(){
		
		EnvelopeBuilder eb = new EnvelopeBuilder();
		eb.insert(new Coordinate(4.0,3.0));
		eb.insert(new Coordinate(1.0,2.0));
		Envelope result = eb.build();
		
		Assert.assertEquals(1.0, result.getXmin(), EPSILON);
		Assert.assertEquals(2.0, result.getYmin(), EPSILON);
		Assert.assertEquals(4.0, result.getXmax(), EPSILON);
		Assert.assertEquals(3.0, result.getYmax(), EPSILON);
		
		
		
	}
	

}
