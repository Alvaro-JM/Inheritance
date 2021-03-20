package pacalcompany.formas_herencia;

import java.io.PrintWriter;

/**
 * Clase para figura cubo. Clase para crear figura cubo a partir del largo del
 * lado.
 *
 * @author Pratik Patel - Álvaro Jiménez.
 * @version 2 Date: 22/03/2021
 */
public class Cube extends ThreeDimensionalShape {

    double length;

    /**
     * Constructor parametrizado. Recibe el largo del lado para crear un cubo.
     *
     * @param length largo del lado del cubo.
     */
    public Cube(double length) {
        this.length = length;
    }

    /**
     * Constructor clon. Recibe un cubo para crear un cubo con los mismos
     * valores.
     *
     * @param cube cubo.
     */
    public Cube(Cube cube) {
        this.length = cube.length;
    }

    /**
     * Obtiene el valor del largo.
     *
     * @return el valor del largo del lado.
     */
    public double getLength() {
        return length;
    }

    /**
     * Establece el valor del largo del lado.
     *
     * @param length largo del lado.
     */
    public void setSideLength(double length) {
        this.length = length;
    }

    /**
     * Obtiene el valor del área superficial.
     *
     * @return el valor del área superficial.
     */
    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(this.length, 2);
    }

    /**
     * Obtiene el valor del volumen.
     *
     * @return el valor del volumen.
     */
    @Override
    public double getVolume() {
        return Math.pow(this.length, 3);
    }

    /**
     * Imprime los atributos y valores del cubo. Imprime los atributos y
     * resultados de los metodos del objeto en un archivo dado como parámetro.
     *
     * @param out salida del método.
     */
    @Override
    public void print(PrintWriter out) {
        out.write("\n Side  Length = " + this.getLength() + "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea() + "\r\n");
        out.write("\n Volume = " + this.getVolume() + "\r\n");;
        out.write("\n\n\n");
    }

}
