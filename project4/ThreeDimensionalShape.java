package pacalcompany.formas_herencia;

/**
 * Clase abstracta para figuras de tres dimensiones. Es la clase padre de las
 * que heredan las figuras de tres dimensiones. Implementa el área de la
 * superficie y el volumen de la figura..
 *
 * @author Pratik Patel - Álvaro Jiménez
 * @version 2 Date: 22/03/2021
 */
public abstract class ThreeDimensionalShape extends Shape {
    
    /**
     * Obtiene el área de la superficie.
     *
     * @return el área de la superficie.
     */
    abstract public double getSurfaceArea();

    /**
     * Obtiene el volumen de la figura.
     *
     * @return el volumen de la figura.
     */
    abstract public double getVolume();

}
