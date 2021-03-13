
import java.io.PrintWriter;

/**
 * This is a cube class which is a ThreeDimensionalShape 
 * it is represented by its side length.
 * 
 * @author Pratik Patel
 * @version 1  Date: 04/27/2014
 */

 class Cube extends ThreeDimensionalShape{
    //instance variable length which is double.
     double length;

    public Cube() {
    }

    
    /**
     * The default constructor which defines a length. 
     */
    public Cube(double length) 
    {
        this.length = length;
    }
     
     
    /**
     * This constructor is pointing to the above constructor. 
     */
    public Cube(Cube cube)
    {
         this.length = cube.length;
    }

   
    /**
     * It gets the value of length.
     * @return the value of length.
     */
    public double getLength() 
    {
        return length;
    }

    
    /**
     * It sets the value of length.
     */
    public void setSideLength(double length) 
    {
        this.length = length;
    }

    
    
    /**
     * This is an overridden method which gets the surface area.
     */
    @Override
    public double getSurfaceArea() 
    {
        return 6 * this.length * this.length;
    }

    
    
    /**
     * This is an overridden method which gets the volume.
     */
    @Override
    public double getVolume() 
    {
        return this.length * this.length * this.length;
    }

    
    /**
     * This is a printwriteout overridden method which prints the Cube object.
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Side  Length = " + this.getLength()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");;
        out.write("\n\n\n");
        
    }
     
     
}
