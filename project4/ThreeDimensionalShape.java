
/**
 * This is threeDimensionalShape class which points towards the other classes in hierarchy.
 * it gives surface area and volume to those classes.
 * 
 * @author Pratik Patel
 * @version 1 Date: 04/27/2014
 */

abstract class ThreeDimensionalShape extends Shape{
 
    /**
     * This method gets the surface area.
     * @returns the value 0.
     */
    public double getSurfaceArea()
    {
        return 0 ;
    }
    
    
    /**
     * This method gets the volume.
     * @returns the value 0.
     */
    public double getVolume()
    {
        return 0;
    }
    
}
