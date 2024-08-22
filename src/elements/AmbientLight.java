package elements;
import com.sun.tools.classfile.ConstantPool.CONSTANT_NameAndType_info;

import primitives.Color;

/**
 * class to AmbientLight - the basic light in the scene
 * An ambient light source represents a fixed-intensity
 * and fixedcolor light source that affects all objects in the scene equally.
 * 
 * @author ora namati 211517776
 */
public class AmbientLight extends Light
{
	private Color Ia; //the color
	private double Ka; //מקדם ההנחתה

	
	/**
	 * constructor that save the intensity=Ia*Ka
	 * 
	 * @param Ia Color value
	 * @param Ka double value
	 */
	public AmbientLight(Color Ia,double Ka ) 
	{
		super(Ia.scale(Ka));
		
	}

	/**
	 * A default constructor
	 * this c-tor put the defalt color - black to the ambition light
	 */
	public AmbientLight() 
	{
		super(Color.BLACK);
	}


}
