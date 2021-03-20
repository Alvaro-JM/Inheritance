
import java.io.PrintWriter;

/**
 * Clase para figura rectángulo. Clase para crear figura rectángulo a partir del
 * largo y del ancho.
 *
 * @author Pratik Patel - Álvaro Jiménez
 * @version 2 Date: 22/03/2021
 */
public class Rectangle extends TwoDimensionalShape {

    double length;
    double width;

    /**
     * Constructor parametrizado. Recibe un largo y un ancho para crear un
     * rectángulo.
     *
     * @param length largo del rectángulo.
     * @param width ancho del rectángulo.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Constructor clon. Recibe un rectángulo para crear un rectángulo con los
     * mismos valores.
     *
     * @param rect rectángulo.
     */
    public Rectangle(Rectangle rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

    /**
     * Obtiene el valor del largo.
     *
     * @return el valor del largo
     */
    public double getLength() {
        return length;
    }

    /**
     * Establece el valor del largo
     *
     * @param length largo del rectángulo.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Obtiene el valor del ancho.
     *
     * @return el valor del ancho.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Establece el valor del ancho.
     *
     * @param width ancho del rectángulo.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Obtiene el valor del área.
     *
     * @return el valor del área
     */
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * Obtiene el valor del perímetro.
     *
     * @return el valor del perímetro.
     */
    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    /**
     * Comprueba si el rectángulo es un cuadrado. Comprueba si el ancho y el
     * largo son iguales.
     *
     * @return true en casop de ser cuadrado, false en caso de no serlo.
     */
    public boolean isSquare() {
        return this.length == this.width;
    }

    /**
     * Imprime los atributos y valores del rectángulo. Imprime los atributos y
     * resultados de los metodos del objeto en un archivo dado como parámetro.
     *
     * @param out salida del método.
     */
    @Override
    public void print(PrintWriter out) {
        out.write("\n Area = " + this.getArea() + "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter() + "\r\n");
        out.write("\n Is Square? = " + this.isSquare() + "\r\n");;
        out.write("\n\n\n");
    }

}
