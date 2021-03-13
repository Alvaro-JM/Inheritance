
import java.io.PrintWriter;

/**
 * The Sphere class is a ThreeDimensionalShape 
 * it represente its radius.
 * 
 * @author Pratik Patel
 * @version 1 Date: 04/27/2014
 */

public class Sphere extends ThreeDimensionalShape{
    //instance variable radius.
    double radius ;

    public Sphere() {
    }
    
    
    /**
     * The constructor define radius. 
     */
    public Sphere(double radius) 
    {
        this.radius = radius;
    }
    
    
    /**
     * The constructor which calls the constructor defined above. 
     */
    public Sphere(Sphere sp)
    {
        this.radius = sp.radius;
    }

    
     /**
     * It gets the value of radius.
     * @return the value of radius.
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * It sets the value of radius.
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * This is an overridden method which gets the surface area.
     */
    @Override
    public double getSurfaceArea() 
    {
        
        return 4 * Math.PI * this.radius * this.radius;
        
    }

    
    /**
     * This is an overridden method which gets the volume.
     */
    @Override
    public double getVolume() 
    {
        return (4 * Math.PI * this.radius * this.radius * this.radius ) / 3;
    }

    
    /**
     * This is a printwriteout overridden method which prints the Sphere object.
     */
    @Override
    public void print(PrintWriter out)
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
   
    
}
