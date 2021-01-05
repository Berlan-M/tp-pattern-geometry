package org.acme.geometry;

import java.util.ArrayList;

public class WktWriter {
	
	
	
	public WktWriter() {
		
	}
	
	public String write(Geometry geometry) {
		String typeGeom = geometry.getType().toUpperCase();
		String coords = "";
		
		if ( geometry instanceof Point ){
		    Point point = (Point)geometry;
		    
		    return "Point("+point.getCoordinate().getX()+" "+point.getCoordinate().getY()+")";
		}
		else if (geometry instanceof LineString) {
			LineString lineString = (LineString)geometry;
        
				for (int i=0; i<lineString.getNumPoints() ; i++){
					if (i < lineString.getNumPoints() && i != 0){
						coords += ",";
					}
					coords += Double.toString(lineString.getPointN(i).getCoordinate().getX());
					coords += " " + Double.toString(lineString.getPointN(i).getCoordinate().getY());
				}
			   
		}
      
		else {
          throw new RuntimeException("geometry type not supported");
		}

		return typeGeom + "(" + coords + ")";
	};
	
}
