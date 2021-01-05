package org.acme.geometry;

public class Point implements Geometry {
	private Coordinate coordinate;


public Point () {
	this.coordinate = new Coordinate();
}

public Point (Coordinate coordinate) {
	this.coordinate = coordinate;
}

public Coordinate getCoordinate () {
	return coordinate;
}

@Override
public String getType() {
	
	return "Point";
}
@Override
public boolean isEmpty() {
	return this.coordinate.isEmpty();
}
@Override
public void translate(double dx, double dy) {
	this.coordinate  = new Coordinate(this.coordinate.getX() + dx, this.coordinate.getY() + dy );
	
}
@Override
public Geometry clone() {
	return new Point (this.coordinate);
}

@Override
public Envelope getEnvelope() {
	
	Envelope e = new Envelope(new Coordinate(this.coordinate.getX() - 1.0,this.coordinate.getY() - 1.0),new Coordinate(this.coordinate.getX() + 1.0,this.coordinate.getY() + 1.0));
	
	return e;
}
@Override
public void accept(GeometryVisitor visitor) {
	visitor.visit(this);
}





}