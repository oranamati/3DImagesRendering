
package elements;

import primitives.Color;
import primitives.Point3D;
import primitives.Vector;

/**
 * interface to LightSource
 * 
 *@author ora namati 211517776
 */
public interface LightSource 
{
	/**
	 * A function that return the intensity at a point
	 * 
	 * 
	 * @param p Point3D value
	 * @return intensity color in this point
	 */
	public Color getIntensity(Point3D p) throws IllegalArgumentException;
	
	
	/**
	 * A function that return the  vector L of the lighting direction at a point
	 * 
	 * 
	 * @param p Point3D value
	 * @return the lighting direction on a point
	 */
	public Vector getL(Point3D p) throws IllegalArgumentException;
	
	/**
	 * A function that return the distance between 2 points
	 * 
	 * 
	 * @param point Point3D value
	 * @return double value for the distance
	 * */
	double getDistance(Point3D point);
}
