public class Asignatura {
    private int codigo;
    private String nombre;
    private String carrera;
    private int nCreditos;

    public Asignatura(int codigo, String nombre, String carrera, int nCreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.nCreditos = nCreditos;
    }

    // Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getnCreditos() {
        return nCreditos;
    }

    public void setnCreditos(int nCreditos) {
        this.nCreditos = nCreditos;
    }

    // Método para mostrar la información de la asignatura
    public String toString() {
        return "Asignatura: " + nombre + " (Código: " + codigo + ", Carrera: " + carrera + ", Créditos: " + nCreditos + ")";
    }
}
