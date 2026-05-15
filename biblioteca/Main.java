package biblioteca;

/**
 * Clase principal para probar la funcionalidad de la clase CLibro
 * @author: Lorena
 * @version: 1.0
 */
public class Main {

    /**
     * Método principal para ejecutar el programa
     * @param args
    */

    public static void main(String[] args) {
        CLibro libro1;
        libro1 = new CLibro("El Quijote", "Miguel de Cervantes", 10, 2);

        libro1.mostrarEstado();
        libro1.prestar(2);
        libro1.devolver(1);
        libro1.mostrarEstado();
    }
}