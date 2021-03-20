package pacalcompany.formas_herencia;

/**
 * Clase abstracta para figuras de dos dimensiones. Es la clase padre de las que
 * heredan las figuras de dos dimensiones. Implementa el perímetro y el área.
 *
 * @author Pratik Patel - Álvaro Jiménez
 * @version 2 Date: 22/03/2021
 */
public abstract class TwoDimensionalShape extends Shape {

    /**
     * Obtiene el perímetro.
     *
     * @return el valor del perímetro.
     */
    abstract public double getPerimeter();

    /**
     * Obtiene el área.
     *
     * @return el valor del área
     */
    abstract public double getArea();

}
