package geometries;
import primitives.Vector;
import primitives.Color;
import primitives.Material;
import primitives.Point3D;

/**
 * abstract class Geometry for all the geometries that have normal
 * 
 * @author ora namati 211517776
 * */
public abstract class Geometry extends Borderable
{
	
	private Material material=new Material();
	protected  Color emission = Color.BLACK;
	
	/**
	 * A function that return the normal of the geometry
	 * 
	 * @author ora namati 211517776
	 * @param point
	 * @return Vector value
	 * */
	public abstract Vector getNormal(Point3D point) throws IllegalArgumentException; // function get normal


	/**
	 * getter function for the color filed in geometry class
	 * 
	 * @author ora namati 211517776
	 * @return emission Color value
	 * */
	public Color getEmission() 
	{
		return emission;
	}
	
	/**
	 * getter function for the Material filed in geometry class
	 * 
	 * @author ora namati 211517776
	 * @return the material
	 */
	public Material getMaterial() 
	{
		return material;
	}

	/**
	 * setter function for the Material filed 
	 * 
	 * @author ora namati 211517776
	 * @param material the material to set
	 * @return the object - builder
	 */
	public Geometry setMaterial(Material material) 
	{
		this.material = material;
		return this;
	}

	/**
	 * setter function for the color filed and return this- geometry class
	 * 
	 * @author ora namati 211517776
	 * @return the geometry-this
	 * */
	public Geometry setEmission(Color emission) 
	{
		this.emission = emission;
		return this;
	}
	public abstract Point3D getPositionPoint();
}
