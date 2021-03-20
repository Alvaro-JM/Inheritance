
import java.io.PrintWriter;

/**
 * Clase para crear un punto. Un punto está representado por sus dos coordenadas
 * cartesianas (x,y).
 *
 * @author Pratik Patel - Álvaro Jiménez
 * @version 2 Date: 22/03/2021
 */
public class Point {

    private double x;
    private double y;

    /**
     * Constructor por defecto. Crea un punto en el origen de coordenadas.
     */
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Constructor parametrizado. Crea el punto con las coordenadas recibidas.
     *
     * @param x coordenada x.
     * @param y coordenada y.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor clon. Recibe un punto para crear un punto con las mismas
     * coordenadas.
     *
     * @param pnt punto.
     */
    public Point(Point pnt) {
        this.x = pnt.x;
        this.y = pnt.y;
    }

    /**
     * Obtiene el valor de la coordenada x.
     *
     * @return el valor de la coordenada x.
     */
    public double getX() {
        return x;
    }

    /**
     * Establece el valor de la coordenada x.
     *
     * @param x coordenada x.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Obtiene el valor de la coordenada y.
     *
     * @return el valor de la coordenada y.
     */
    public double getY() {
        return y;
    }

    /**
     * Establece el valor de la coordenada y.
     *
     * @param y coordenada y.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Obtiene la distancia entre este punto y otro punto dado como parámetro.
     *
     * @param p punto.
     * @return distancia al punto.
     */
    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    /**
     * Imprime los atributos y valores del punto. Imprime los atributos del
     * objeto en un archivo dado como parámetro.
     *
     * @param out salida del método.
     */
    public void print(PrintWriter out) {
        out.write("\n Point Data => ");
        out.write("\nPrint Data = x = " + x + " y = " + y);
        out.write("\n\n\n");;
    }

}
