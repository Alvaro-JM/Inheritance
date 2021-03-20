package pacalcompany.formas_herencia;

import java.io.PrintWriter;

/**
 * Clase para figura triángulo. Clase para crear figura triángulo a partir de
 * tres puntos (de clase Punto).
 *
 * @author Pratik Patel - Álvaro Jiménez
 * @version 2 Date: 22/03/2021
 */
public class Triangle extends TwoDimensionalShape {

    private Point point1, point2, point3;

    /**
     * Constructor parametrizado. Recibe tres puntos para crear un triángulo.
     *
     * @param pt1 punto 1.
     * @param pt2 punto 2.
     * @param pt3 punto 3.
     */
    public Triangle(Point pt1, Point pt2, Point pt3) {
        this.point1 = pt1;
        this.point2 = pt2;
        this.point3 = pt3;
    }

    /**
     * This constructor is same as define above.
     */
    /**
     * Constructor clon. Recibe un triángulo para crear un triángulo con los
     * mismos valores.
     *
     * @param t triángulo.
     */
    public Triangle(Triangle t) {
        this.point1 = t.point1;
        this.point2 = t.point2;
        this.point3 = t.point3;
    }

    /**
     * Obtiene el valor del punto 1.
     *
     * @return el valor del punto 1.
     */
    public Point getPoint1() {
        return point1;
    }

    /**
     * Establece el valor del punto 1.
     *
     * @param point1 punto 1.
     */
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    /**
     * Obtiene el valor del punto 2.
     *
     * @return el valor del punto 2.
     */
    public Point getPoint2() {
        return point2;
    }

    /**
     * Establece el valor del punto 2.
     *
     * @param point2 punto 2.
     */
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    /**
     * Obtiene el valor del punto 3.
     *
     * @return el valor del punto 3.
     */
    public Point getPoint3() {
        return point3;
    }

    /**
     * Establece el valor del punto 3.
     *
     * @param point3 punto 3.
     */
    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    /**
     * Obtiene el valor del área.
     *
     * @return el valor del área
     */
    @Override
    public double getArea() {
        double semiperimeter = this.getPerimeter() / 2;

        double a = this.point1.getX() + this.point1.getY();
        double b = this.point2.getX() + this.point2.getY();
        double c = this.point3.getX() + this.point3.getY();

        return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b)
                * (semiperimeter - c));
    }

    /**
     * Obtiene el valor del perímetro.
     *
     * @return el valor del perímetro.
     */
    @Override
    public double getPerimeter() {
        double sum = 0;
        sum += this.point1.getX() + this.point1.getY();
        sum += this.point2.getX() + this.point2.getY();
        sum += this.point3.getX() + this.point3.getY();
        return sum;
    }

    /**
     * Imprime los atributos y valores del triángulo. Imprime los atributos y
     * resultados de los metodos del objeto en un archivo dado como parámetro.
     *
     * @param out salida del método.
     */
    @Override
    public void print(PrintWriter out) {
        out.write("\n Triangle Data => " + "\r\n");
        out.write("\n Point 1 = " + this.point1.getX() + " , " + this.point1.getY() + "\r\n");
        out.write("\n Point 2 = " + this.point2.getX() + " , " + this.point2.getY() + "\r\n");
        out.write("\n Point 3 = " + this.point3.getX() + " , " + this.point3.getY() + "\r\n");
        out.write("\n Area = " + this.getArea() + "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter() + "\r\n");
        out.write("\n\n\n");;
    }

}
