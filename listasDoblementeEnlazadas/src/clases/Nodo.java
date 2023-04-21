public class Nodo {
    private Asignatura asignatura;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo(Asignatura asignatura) {
        this.asignatura = asignatura;
        anterior = null;
        siguiente = null;
    }

    // Getters y setters
    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
