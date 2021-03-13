
import java.io.PrintWriter;
/**
 * The rectangle class represent the lenght and width. 
 * 
 * @author Pratik Patel
 * @version 1   Date: 04/27/2014
 */

 class Rectangle  extends TwoDimensionalShape{

     //instance variables length and width. both are doubles.
     double length;  
     double width;   
     
    public Rectangle() {
    }

    
    /**
     * The default constructor which takes two doubles and initializes the length and width. 
     */
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
     
     
    /**
     * This constructor is same as define above. 
     */
    public Rectangle(Rectangle rect)
    {
        this.length = rect.length;
        this.width = rect.width;
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
     * It sets the value of height.
     */
    public void setHeight(double length) 
    {
        this.length = length;
    }
    
    

    /**
     * It gets the value of width.
     * @return the value of width.
     */
    public double getWidth() 
    {
        return width;
    }

    
    /**
     * It sets the value of width.
     */
    public void setWidth(double width) 
    {
        this.width = width;
    }
    

    
    /**
     * This is a printwriteout overridden method which prints the Rectangle object.
     */
    @Override
    public void print(PrintWriter out) 
    {
       
        super.print(out);
        out.write("\n Area = " + this.getArea()+ "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Is Square? = " + this.isSquare()+ "\r\n");;
        out.write("\n\n\n");
        
    }

    
    
    /**
     * This is an overridden method which gets the area.
     */
    @Override
    public double getArea() 
    {
        return this.length * this.width;
    }
    
    

    /**
     * This is an overridden method which gets the Perimeter.
     */
    @Override
    public double getPerimeter() 
    {
        return 2 * (this.length + this.width);
    }
    
    
    
    /**
     * This is isSquare method which returns true or false value according to the length and width.
     */
    public boolean  isSquare()
    {
        if(this.length == this.width)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     
}
