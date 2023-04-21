// Clase NodoAsignatura
public class NodoAsignatura {
    private Asignatura asignatura;
    private NodoAsignatura siguiente;

    // Constructor
    public NodoAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
        siguiente = null;
    }

    // Métodos getter y setter para los atributos
    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public NodoAsignatura getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAsignatura siguiente) {
        this.siguiente = siguiente;
    }
}
