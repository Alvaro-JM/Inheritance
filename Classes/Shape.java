
import java.io.PrintWriter;

/**
 * Clase abstracta figura. Es la clase padre de la que heredan las demás.
 *
 * @author Pratik Patel - Álvaro Jiménez
 * @version 2 Date: 22/03/2021
 */
public abstract class Shape {
    
    /**
     * Imprime los atributos y valores de la figura. Imprime los atributos y
     * resultados de los metodos del objeto en un archivo dado como parámetro.
     *
     * @param out salida del método.
     */
    abstract public void print(PrintWriter out);

}
