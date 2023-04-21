// Clase Asignatura
public class Asignatura {
    private int codigo;
    private String nombre;
    private String carrera;
    private int numeroCreditos;

    // Constructor
    public Asignatura(int codigo, String nombre, String carrera, int numeroCreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.numeroCreditos = numeroCreditos;
    }

    // Métodos getter y setter para los atributos
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

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }
}
