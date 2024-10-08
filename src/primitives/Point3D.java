
package primitives;


/**
 * class for point3d in primitives package
 * 
 * @author ora namati 211517776
 */


public class Point3D
{
	//The fields of this class are 3 coordinates
	final Coordinate x;
	final Coordinate y;
	final Coordinate z;
	
	/**
	 * A constant that represents the zero point
	 * */
	public static final Point3D ZERO= new Point3D(0,0,0);

	
	/**
	 * Constructor that receives 3 double numbers and make from them 3 coordinates
	 * 
	 * @param a double
	 * @param b double
	 * @param c double
	 * */
	public Point3D(double a, double b, double c)
	{
		x = new Coordinate(a);
		y = new Coordinate(b);
		z = new Coordinate(c);
	}
	
	/**
	 * A function that receives a vector and adds it to the point of the class
	 * 
	 
	 * @param v Vector value
	 * @return new Point3D that is the result
	 * */
	public Point3D add(Vector v)
	{
		double myX=x.coord+v.head.x.coord;
		double myY=y.coord+v.head.y.coord;
		double myZ=z.coord+v.head.z.coord;
		return new Point3D(myX, myY, myZ);		
	}
	
	/**
	 * A function that subtracts point from the existing point, the result is basically a new vector
	 * 
	 
	 * @param p Point3D value
	 * @throws Exception 
	 * */
	public Vector subtract(Point3D p) throws IllegalArgumentException
	{
		return new Vector(x.coord-p.x.coord, y.coord-p.y.coord, z.coord-p.z.coord);
		
	}

	/**
	 * A function that return the distanceSquared between two vectors
	 * 
	 * @param p Point3D value
	 * @return double value rot distance squared
	 * */
	public double distanceSquared(Point3D p)
	{
		return (x.coord-p.x.coord)*(x.coord-p.x.coord)+(y.coord-p.y.coord)*(y.coord-p.y.coord)+(z.coord-p.z.coord)*(z.coord-p.z.coord);
	}
	
	/**
	 * A function that return the distance between two vectors
	 * 
	 * @param p Point3D value
	 * @return double value rot distance 
	 * */
	public double distance(Point3D p)
	{
		return Math.sqrt(distanceSquared(p));
	}
	
	/**
	 * getter to filed x - his coordinate
	 * 
	 * @return double for the coordinate
	 * */
	public double getX() 
	{
		return x.coord;
	}

	/**
	 * getter to filed y - his coordinate
	 * 
	 * @return double for the coordinate
	 * */
	public double getY() 
	{
		return y.coord;
	}

	/**
	 * getter to filed z - his coordinate
	 * 
	 * @return double for the coordinate
	 * */
	public double getZ() 
	{
		return z.coord;
	}
	
	/*********************************************************************/
	
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Point3D)) return false;
		Point3D other = (Point3D)obj;
		return this.x.equals(other.x) && this.y.equals(other.y)&& this.z.equals(other.z);
	}
	
	@Override
	public String toString() 
	{
		return "Point: ("+ x + ","+ y+"," + z+")";
	}

	
	
	


}
