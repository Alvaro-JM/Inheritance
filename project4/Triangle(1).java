
import java.io.PrintWriter;

/**
 * This is a Triangle class which is TwoDimention shape.
 * It represents three corner points which are point objects.
 * 
 * @author Pratik Patel
 * @version 1  Date: 04/27/2014
 */

class Triangle extends TwoDimensionalShape {

    //instance variables point1, point2 and point3
    private Point point1, point2, point3;

    public Triangle() {
    }

    
    /**
     * The default constructor which takes points and define them. 
     */
    public Triangle(Point pt1, Point py2, Point py3) 
    {
        this.point1 = pt1;
        this.point2 = py2;
        this.point3 = py3;
    }

    
    
    /**
     * This constructor is same as define above. 
     */
    public Triangle(Triangle t) 
    {
        this.point1 = t.point1;
        this.point2 = t.point2;
        this.point3 = t.point3;
    }

    
    
    /**
     * It gets the value of point1.
     * @return the value of point1.
     */
    public Point getPoint1() 
    {
        return point1;
    }

    /**
     * It sets the value of point1.
     */
    public void setPoint1(Point point1) 
    {
        this.point1 = point1;
    }

    
    /**
     * It gets the value of point2.
     * @return the value of point2.
     */
    public Point getPoint2() 
    {
        return point2;
    }

    
    /**
     * It sets the value of point2.
     */
    public void setPoint2(Point point2) 
    {
        this.point2 = point2;
    }

    
    
    /**
     * It gets the value of point3.
     * @return the value of point3.
     */
    public Point getPoint3()
    {
        return point3;
    }

    /**
     * It sets the value of point3.
     */
    public void setPoint3(Point point3) 
    {
        this.point3 = point3;
    }

    
    /**
     * This is a printwriteout overridden method which prints the Triangle object.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Traiangle Data => "+ "\r\n");
        out.write("\n Point 1 = " + this.point1.getX() + " , " + this.point1.getY()+ "\r\n");
        out.write("\n Point 2 = " + this.point2.getX() + " , " + this.point2.getY()+ "\r\n");
        out.write("\n Point 3 = " + this.point3.getX() + " , " + this.point3.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");   
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n\n\n");;
    }

    
    /**
     * This is an overridden method which gets the area.
     */
    @Override
    public double getArea() 
    {

        double area;
        double perimeter = this.getPerimeter()/2;

        double a = this.point1.getX() + this.point1.getY();
        double b = this.point2.getX() + this.point2.getY();
        double c = this.point3.getX() + this.point3.getY();

        area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

    /**
     * This is an overridden method which gets the Perimeter.
     */
    @Override
    public double getPerimeter() 
    {

        double sum =  0 ;
        sum +=  this.point1.getX() + this.point1.getY();
        sum += this.point2.getX() + this.point2.getY();
        sum += this.point3.getX() + this.point3.getY();
        return sum;

      
        
    }
}
