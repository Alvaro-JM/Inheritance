import java.io.PrintWriter;

/**
 * This is a Cone class which is a ThreeDimensionalShape.
 * It representes the radius and height.
 * 
 * @author Pratik Patel
 * @version 1  Date: 04/27/2014
 * 
 */
 class Cone extends ThreeDimensionalShape{
    //instance variable radius and height.
    double radius;
    double height;

    public Cone() {
    }

    /**
     * The default constructor which takes radius and height. 
     */
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
     
    /**
     * This constructor is also carries radius and height.
     */ 
    public Cone(Cone con) {
         this.radius = con.radius;
         this.height = con.height;
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
    	double slantHeight = Math.sqrt(Math.pow(this.radius, 2) + Math.pow(this.height, 2));
    	double lateralArea = Math.PI * this.radius * slantHeight;
    	double baseArea = Math.PI * Math.pow(this.radius, 2);
    	return lateralArea + baseArea;        
    }
  
    /**
     * This is an overridden method which gets the volume.
     */
    @Override
    public double getVolume() {
        return (Math.PI * Math.pow(this.radius, 2) * this.height) / 3; 
    }

    /**
     * This is a printwriteout overridden method which prints the Cone object.
     */
    @Override
    public void print(PrintWriter out) {
        super.print(out);
        out.write("\n Radius  = " + this.getRadius()+ "\r\n");
        out.write("\n Height  = " + this.getHeight()+ "\r\n");
        out.write("\n  Surface  Area = " + this.getVolume() + "\r\n");
        out.write("\n  Volume  = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n\n\n");
    }
     
}
