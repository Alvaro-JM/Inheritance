import java.io.PrintWriter;

/**
 * This is a Cylinder class which is a ThreeDimensionalShape.
 * it is represented by its radius and height.
 * 
 * @author Pratik Patel
 * @version 1 Date: 04/27/2014
 */
class Cylinder extends ThreeDimensionalShape{
    //instance variable radius and height 
    double radius , height;

    public Cylinder() {
    }

    /**
     * This is a default constructor which takes radius and height. 
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * This constructor is also carries radius and height.
     */
    public Cylinder(Cylinder cyl) {
        this.radius = cyl.radius;
        this.height = cyl.height;
    }

    /**
     * It gets the value of radius.
     * @return the value of radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * It sets the value of height.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * It gets the value of height.
     * @return the value of height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * It sets the value of height.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * This is an overridden method which gets the surface area.
     */
    @Override
    public double getSurfaceArea() {
        double baseArea = Math.PI * Math.pow(this.radius, 2);
        double lateralArea = 2 * Math.PI * this.radius * this.height;
        return (2 * baseArea) + lateralArea;
    }

    /**
     * This is an overridden method which gets the volume.
     */
    @Override
    public double getVolume() {
        return  Math.PI * Math.pow(this.radius, 2) * this.height;
    }

    /**
     * This is a printwriteout overridden method which prints the Cylinder object.
     */
    @Override
    public void print(PrintWriter out) {
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Height = " + this.getHeight()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");;
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");  
    }
    
}
