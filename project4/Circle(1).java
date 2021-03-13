
import java.io.PrintWriter;
/**
 * This is a circle class which is representing radius and center of circle. 
 * The center is a Point object.
 * 
 * @author  Pratik Patel
 * @version 1 Date: 04/27/2014
 */

public class Circle  extends TwoDimensionalShape{
    //instance variables radius and center
    private double  radius ;
    private Point center;

    /**
     * The default constructor which takes doubles and point initializes the radius and center. 
     */
    public Circle( Point center,double radius) 
    {
        this.radius = radius;
        this.center = center;
    }
    
    
    /**
     * This constructor is same as define above. 
     */
    public Circle(Circle circle)
    {
        this.radius = circle.radius;
        this.center = circle.center;
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
     * It gets the value of center.
     * @return the value of center.
     */
    public Point getCenter() 
    {
        return center;
    }

    
    
    /**
     * It sets the value of center.
     */
    public void setCenter(Point center) 
    {
        this.center = center;
    }

    
    
    /**
     * This is a printwriteout overridden method which prints the circle object.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Cirle: "+ "\r\n");
        out.print("\n Center = " + this.center.getX() + " " + this.center.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Radious = " + this.getRadius()+ "\r\n");;
        out.write("\n\n\n");
    }

    
    /**
     * This is an overridden method which gets the area.
     */
    @Override
    public double getArea() 
    {
        return Math.PI * this.radius * this.radius ;
    }

    
    /**
     * This is an overridden method which gets the radius.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    
    
    
}

    

