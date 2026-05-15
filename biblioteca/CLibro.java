/** Clase que representa un libro en la biblioteca 
 * @author: Lorena
 * @version: 1.0
*/

package biblioteca;

/** @param titulo: título del libro 
 * @param autor: autor del libro
 * @param ejemplares: número total de ejemplares del libro en la biblioteca
 * @param prestados: número de ejemplares prestados actualmente
*/
public class CLibro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    /**
     * Constructor por defecto
     */
    public CLibro() {
    }

    public CLibro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    /**
     * Presta un número específico de ejemplares del libro
     * @param cantidad: número de ejemplares a prestar
     * @return true si se puede prestar, false en caso contrario
     */
    public boolean prestar(int cantidad) {
        if ((prestados + cantidad) <= ejemplares) {
            prestados = prestados + cantidad;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Devuelve un número específico de ejemplares del libro
     * @param cantidad: número de ejemplares a devolver
     * @return true si se puede devolver, false en caso contrario
     */
    public boolean devolver(int cantidad) {
        if ((prestados - cantidad) >= 0) {
            prestados = prestados - cantidad;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Muestra el estado actual del libro
     */
    public void mostrarEstado() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ejemplares: " + ejemplares);
        System.out.println("Prestados: " + prestados);
    }

     /** Agrupa operaciones sobre libro1
      *Agrupa operaciones sobre libro1
      */  

    public void operativa_libro() {
        CLibro libro1;
        int cantidad = 2;
        libro1 = new CLibro("El Quijote", "Miguel de Cervantes", 10, 2);
        libro1.mostrarEstado();
        libro1.prestar(cantidad);
        libro1.devolver(cantidad);
        libro1.mostrarEstado();
    
    }
}
