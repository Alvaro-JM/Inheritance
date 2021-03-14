/**
 * This is twoDimensionalShape class which points towards the other classes in hierarchy.
 * it gives perimeter and area of the each shapes.
 * 
 * @author Pratik Patel
 * @version 1 Date: 04/27/2014
 */
abstract  class TwoDimensionalShape extends Shape{
      
   /**
     * This method gets the perimeter.
     * 
     */ 
   abstract public double getPerimeter();
    
   /**
     * This method gets the area.
     * 
     */
   abstract public double getArea();

}
