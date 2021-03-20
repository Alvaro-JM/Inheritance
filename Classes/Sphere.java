
import java.io.PrintWriter;

/**
 * Clase para figura esfera. Clase para crear figura esfera a partir del radio.
 *
 * @author Pratik Patel - Álvaro Jiménez.
 * @version 2 Date: 22/03/2021
 */
public class Sphere extends ThreeDimensionalShape {

    double radius;

    /**
     * Constructor parametrizado. Recibe el radio para crear una esfera.
     *
     * @param radius radio de la esfera.
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor clon.Recibe una esfera para crear una esfera con los mismos
     * valores.
     *
     * @param sp esfera.
     */
    public Sphere(Sphere sp) {
        this.radius = sp.radius;
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
     * @param radius valor del radio.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Obtiene el valor del área superficial.
     *
     * @return el valor del área superficial.
     */
    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Obtiene el valor del volumen.
     *
     * @return el valor del volumen.
     */
    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(this.radius, 3)) / 3;
    }

    /**
     * Imprime los atributos y valores de la esfera. Imprime los atributos y
     * resultados de los metodos del objeto en un archivo dado como parámetro.
     *
     * @param out salida del método.
     */
    @Override
    public void print(PrintWriter out) {
        out.write("\n Radius = " + this.getRadius() + "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea() + "\r\n");
        out.write("\n Volume = " + this.getVolume() + "\r\n");
        out.write("\n\n\n");
    }

}
