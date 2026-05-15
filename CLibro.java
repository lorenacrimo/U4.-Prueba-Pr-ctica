public class CLibro {
    public String titulo;
    public String autor;
    public int ejemplares;
    public int prestados;

    public CLibro() {
    }

    public CLibro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public boolean prestar(int cantidad) {
        if ((prestados + cantidad) <= ejemplares) {
            prestados = prestados + cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolver(int cantidad) {
        if ((prestados - cantidad) >= 0) {
            prestados = prestados - cantidad;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarEstado() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ejemplares: " + ejemplares);
        System.out.println("Prestados: " + prestados);
    }
}