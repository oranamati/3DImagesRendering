package geometries;
import java.util.ArrayList;
import java.util.List;
import static primitives.Util.*;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;
/**
 * Class for Sphere in geometries package
 * 
 * @author ora namati 211517776
 */
public class Sphere extends Geometry
{
	//The filed of this class are point of center and radius
	private Point3D center;
	private double radius;
	
	/**
	 * Constructor that receives point to the center and double to the radius
	 * 
	 * @author ora namati 211517776
	 * @param p Point3D
	 * @param r double
	 * */
	public Sphere(Point3D p, double r)
	{
		center = p;
		radius = r;
	}

	/**
	 * A getter function for the field center
	 * 
	 * @return Point3D value for center
	 * */
	public Point3D getCenter() 
	{
		return center;
	}

	/**
	 * A getter function for the field radius
	 * 
	 * @return double value for radius
	 * */
	public double getRadius() 
	{
		return radius;
	}

	
	/************************************************************************/
	
	@Override
	public String toString() 
	{
		return "Sphere: center=" + center + ", radius=" + radius;
	}

	@Override
	public Vector getNormal(Point3D point) throws IllegalArgumentException
	{	
		return point.subtract(getCenter()).normalize();
	}

	
//	@Override
//	public List<GeoPoint> findGeoIntersections(Ray ray) throws IllegalArgumentException 
//	{
//		
//		if (ray.getP0().equals(center)) // if the begin of the ray in the center, the point, is on the radius
//			return List.of(new GeoPoint(this,ray.getPoint(radius)));
//		//List<Point3D> rayPoints = new ArrayList<Point3D>();
//		Vector u = center.subtract(ray.getP0());
//		double tM = alignZero(ray.getDir().dotProduct(u));
//		double d = alignZero(Math.sqrt(u.length()*u.length()- tM * tM));
//		double tH = alignZero(Math.sqrt(radius*radius - d*d));
//		double t1 = alignZero(tM+tH);
//		double t2 = alignZero(tM-tH);
//		
//		
//		if (d > radius)
//			return null; // there are no instructions
//
//		
//		if (t1 <=0 && t2<=0)
//			return null;
//		
//		if (t1 > 0 && t2 >0)
//			return List.of(new GeoPoint(this,ray.getPoint(t1)),new GeoPoint(this,ray.getPoint(t2)));
//		if (t1 > 0)
//		{
//			return List.of(new GeoPoint(this,ray.getPoint(t1)));
//		}
//
//		else
//			return List.of(new GeoPoint(this,ray.getPoint(t2)));
//	}

	@Override
	protected void findMinMaxParticular() 
	{
		minX = center.getX() - radius;
		maxX = center.getX() + radius;
		minY = center.getY() - radius;
		maxY = center.getY() + radius;
		minZ = center.getZ() - radius;
		maxZ = center.getZ() + radius;
		
//
//	        maxX = minX + 2 * radius;
//	        maxY = minY + 2 * radius;
//	        maxZ = minZ + 2 * radius;

	   
	}

	@Override
	public List<GeoPoint> findGeoIntersectionsParticular(Ray ray) 
	{
		if (ray.getP0().equals(center)) // if the begin of the ray in the center, the point, is on the radius
			return List.of(new GeoPoint(this,ray.getPoint(radius)));
		//List<Point3D> rayPoints = new ArrayList<Point3D>();
		Vector u = center.subtract(ray.getP0());
		double tM = alignZero(ray.getDir().dotProduct(u));
		double d = alignZero(Math.sqrt(u.length()*u.length()- tM * tM));
		double tH = alignZero(Math.sqrt(radius*radius - d*d));
		double t1 = alignZero(tM+tH);
		double t2 = alignZero(tM-tH);
		
		
		if (d > radius)
			return null; // there are no instructions

		
		if (t1 <=0 && t2<=0)
			return null;
		
		if (t1 > 0 && t2 >0)
			return List.of(new GeoPoint(this,ray.getPoint(t1)),new GeoPoint(this,ray.getPoint(t2)));
		if (t1 > 0)
		{
			return List.of(new GeoPoint(this,ray.getPoint(t1)));
		}

		else
			return List.of(new GeoPoint(this,ray.getPoint(t2)));
	
	}

	@Override
	public Point3D getPositionPoint() {
		return center;
	}


}
