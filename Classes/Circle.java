
import java.io.PrintWriter;

/**
 * Clase para figura círculo. Clase para crear figura círculo a partir del
 * centro (de clase Punto) y el radio.
 *
 * @author Pratik Patel - Álvaro Jiménez
 * @version 2 Date: 22/03/2021
 */
public class Circle extends TwoDimensionalShape {

    private double radius;
    private Point center;

    /**
     * Constructor parametrizado. Recibe un centro y un radio para crear un
     * círculo.
     *
     * @param center centro del círculo.
     * @param radius radio del círculo.
     */
    public Circle(Point center, double radius) {
        this.radius = radius;
        this.center = center;
    }

    /**
     * Constructor clon. Recibe un círculo para crear un círculo con los mismos
     * valores.
     *
     * @param circle circulo.
     */
    public Circle(Circle circle) {
        this.radius = circle.radius;
        this.center = circle.center;
    }

    /**
     * Obtiene el valor del radio.
     *
     * @return el valor del radio.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Establece el valor del radio.
     *
     * @param radius radio del círculo.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Obtiene el valor del centro.
     *
     * @return el valor del centro.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Establece el valor del centro.
     *
     * @param center centro del círculo.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Obtiene el valor del área.
     *
     * @return el valor del área
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Obtiene el valor del perímetro.
     *
     * @return el valor del perímetro.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    /**
     * Imprime los atributos y valores del círculo. Imprime los atributos y
     * resultados de los metodos del objeto en un archivo dado como parámetro.
     *
     * @param out salida del método.
     */
    @Override
    public void print(PrintWriter out) {
        out.write("\n Cirle: " + "\r\n");
        out.print("\n Center = " + this.center.getX() + " " + this.center.getY() + "\r\n");
        out.write("\n Area = " + this.getArea() + "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter() + "\r\n");
        out.write("\n Radius = " + this.getRadius() + "\r\n");;
        out.write("\n\n\n");
    }

}
