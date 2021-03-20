

import java.io.PrintWriter;

/**
 * Clase para figura cono. Clase para crear figura cono a partir del radio de la
 * base y de la altura del cono.
 *
 * @author Pratik Patel - Álvaro Jiménez.
 * @version 2 Date: 22/03/2021
 */
public class Cone extends ThreeDimensionalShape {

    double radius;
    double height;

    /**
     * Constructor parametrizado. Recibe un radio y una altura para crear un
     * cono.
     *
     * @param radius radio de la base.
     * @param height altura del cono.
     */
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Constructor clon. Recibe un cono para crear un cono con los mismos
     * valores.
     *
     * @param con cono.
     */
    public Cone(Cone con) {
        this.radius = con.radius;
        this.height = con.height;
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
     * Establece el valor del radio de la base.
     *
     * @param radius radio de la base.
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
        //Obtenemos la generatriz
        double slantHeight = Math.sqrt(Math.pow(this.radius, 2) + Math.pow(this.height, 2));
        //Obtenemos el área lateral con la generatriz
        double lateralArea = Math.PI * this.radius * slantHeight;
        //Obtenemos el área de la base
        double baseArea = Math.PI * Math.pow(this.radius, 2);

        return lateralArea + baseArea;
    }

    /**
     * Obtiene el valor del volumen.
     *
     * @return el valor del volumen.
     */
    @Override
    public double getVolume() {
        return (Math.PI * Math.pow(this.radius, 2) * this.height) / 3;
    }

    /**
     * Imprime los atributos y valores del cono. Imprime los atributos y
     * resultados de los metodos del objeto en un archivo dado como parámetro.
     *
     * @param out salida del método.
     */
    @Override
    public void print(PrintWriter out) {
        out.write("\n Radius  = " + this.getRadius() + "\r\n");
        out.write("\n Height  = " + this.getHeight() + "\r\n");
        out.write("\n  Surface  Area = " + this.getVolume() + "\r\n");
        out.write("\n  Volume  = " + this.getSurfaceArea() + "\r\n");
        out.write("\n\n\n");
    }

}
