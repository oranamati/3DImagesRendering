package elements;
import primitives.Color;


/**
 * class for light - abstract class
 * 
 * @author ora namati 211517776
 */
 abstract class Light 
 {

	protected Color intensity;
	
	
	/**
	 * constructor for light
	 * 
	 * @author ora namati 211517776
	 * @return the intensity
	 */
	protected Light(Color intensity)
	{
		this.intensity=intensity;
	}
 
	/**
	 * getter to intensity
	 * 
	 * 
	 * @return intensity Color 
	 * */
	public Color getIntensity() 
	{
		return intensity;
	}

}
