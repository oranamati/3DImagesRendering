
package scene;

import java.util.LinkedList;
import java.util.List;

import elements.AmbientLight;
import elements.LightSource;
import geometries.Geometries;
import primitives.Color;

/**
 * class Scene for PDS
 * 
 * @author ora namati 211517776
 */
public class Scene 
{
	public String name;
	public Color background = Color.BLACK;
	public AmbientLight ambientLight = new AmbientLight();
	public Geometries geometries;
	public List<LightSource>lights=new LinkedList<LightSource>() ;
	



	/**
	 * constructor 
	 * 
	 * @author ora namati 211517776
	 * @param name
	 * */
	public Scene(String name)
	{
		geometries = new Geometries();
	}
	

	
	/**
	 * setter function to lights  and return this for builder pattern
	 * 
	 * @param lights the lights to set
	 */
	public Scene setLights(List<LightSource> lights) 
	{
		this.lights = lights;
		return this;
	}

	
	/**
	 * setter function to background, and return this for builder pattern
	 * 
	 * @param background the background to set
	 */
	public Scene setBackground(Color background) 
	{
		this.background = background;
		return this;
	}
	

	/**
	 * setter function to ambientLight, and return this for builder pattern
	 * 
	 * @param ambientLight the ambientLight to set
	 */
	public Scene setAmbientLight(AmbientLight ambientLight) 
	{
		this.ambientLight = ambientLight;
		return this;
		
	}
	

	/**
	 * setter function to geometries, and return this for builder pattern
	 * 
	 * @param geometries the geometries to set
	 */
	public Scene setGeometries(Geometries geometries) 
	{
		this.geometries = geometries;
		return this;
	}
	

}
