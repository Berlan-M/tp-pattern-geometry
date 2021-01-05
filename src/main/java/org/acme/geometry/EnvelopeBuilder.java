package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class EnvelopeBuilder {
	//Coordonnees des extremites
	private List<Coordinate> CoordExtremites = new ArrayList<Coordinate>();
	
	public EnvelopeBuilder() {
		this.CoordExtremites = new ArrayList<Coordinate>();
		
	}
	public EnvelopeBuilder(List<Coordinate> CoordExtremites) {
		this.CoordExtremites = CoordExtremites;
		
	}
	public List<Coordinate> getCoordExtremites(){
		return this.CoordExtremites;
	}
	
	public void insert (Coordinate coordinate) {
		// Chaque coordonnees inseree est ajoutee a la liste des coordonnees des extremites
		this.CoordExtremites.add(coordinate);
	}
	
	public Envelope build() {

		// liste des abscisses
		List<Double> x =  new ArrayList<Double>();
		//liste des ordonnees
		List<Double> y =  new ArrayList<Double>();
		
		for (Coordinate c : this.CoordExtremites) {	
			x.add(c.getX());
		}
		for (Coordinate c : this.CoordExtremites) {
					y.add(c.getY());
		}
		
		Coordinate futurBotom = new Coordinate(Collections.min(x),Collections.min(y));
		Coordinate futurtop = new Coordinate(Collections.max(x),Collections.max(y));
		
		Envelope e = new Envelope(futurBotom,futurtop); 
		
		return e;
	} 
	
}
