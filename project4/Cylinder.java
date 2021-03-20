package pacalcompany.formas_herencia;

import java.io.PrintWriter;

/**
 * Clase para figura cilindro. Clase para crear figura cilindro a partir del
 * radio de las bases y de la altura del cilindro.
 *
 * @author Pratik Patel - Álvaro Jiménez.
 * @version 2 Date: 22/03/2021
 */
public class Cylinder extends ThreeDimensionalShape {

    double radius, height;

    /**
     * Constructor parametrizado. Recibe un radio y una altura para crear un
     * cilindro.
     *
     * @param radius radio de la base.
     * @param height altura del cilindro.
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Constructor clon. Recibe un cilindro para crear un cilindro con los
     * mismos valores.
     *
     * @param cyl cilindro.
     */
    public Cylinder(Cylinder cyl) {
        this.radius = cyl.radius;
        this.height = cyl.height;
    }

    /**
     * Obtiene el valor del radio de la base.
     *
     * @return el valor del radio de la base.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Establece el valor del radio de las bases.
     *
     * @param radius radio de las bases.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Obtiene el valor de la altura.
     *
     * @return el valor de la altura.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Establece el valor de la altura.
     *
     * @param height el valor de la altura.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Obtiene el valor del área superficial.
     *
     * @return el valor del área superficial.
     */
    @Override
    public double getSurfaceArea() {
        //Obtenemos el área de una base
        double baseArea = Math.PI * Math.pow(this.radius, 2);
        //Obtenemos el área lateral
        double lateralArea = 2 * Math.PI * this.radius * this.height;
        //el área total son dos bases más el área lateral
        return (2 * baseArea) + lateralArea;
    }

    /**
     * Obtiene el valor del volumen.
     *
     * @return el valor del volumen.
     */
    @Override
    public double getVolume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }

    /**
     * Imprime los atributos y valores del cilindro. Imprime los atributos y
     * resultados de los metodos del objeto en un archivo dado como parámetro.
     *
     * @param out salida del método.
     */
    @Override
    public void print(PrintWriter out) {
        out.write("\n Radius = " + this.getRadius() + "\r\n");
        out.write("\n Height = " + this.getHeight() + "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea() + "\r\n");;
        out.write("\n Volume = " + this.getVolume() + "\r\n");
        out.write("\n\n\n");
    }

}
