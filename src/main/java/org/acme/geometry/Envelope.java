package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class Envelope {
	private Coordinate botomleft;
	private Coordinate topRight;
	
	public Envelope() {
		this.botomleft = new Coordinate();
		this.topRight = new Coordinate();
	}
	public Envelope(Coordinate botom, Coordinate top) {
		this.botomleft = botom;
		this.topRight = top;
	}
	
	public boolean isEmpty() {
		List<Coordinate> coords = new ArrayList<Coordinate>();
		coords.add(this.botomleft);
		coords.add(this.topRight);
		
		for (Coordinate c : coords) {
			if (c.isEmpty()) {
				return true;
			}
		}
		return false;
		
	}
	
	public Coordinate getBotom() {
		return this.botomleft;
	}
	
	public Coordinate getTop() {
		return this.topRight;
	}
	public double getXmin() {
		return this.botomleft.getX();
	}
	public double getYmin() {
		return this.botomleft.getY();
	}
	public double getXmax() {
		return this.topRight.getX();
	}
	public double getYmax() {
		return this.topRight.getY();
	}
	
	
	
	
	
	
	
}
