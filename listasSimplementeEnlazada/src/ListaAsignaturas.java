// Clase ListaAsignaturas
public class ListaAsignaturas {
    private NodoAsignatura inicio;

    // Constructor
    public ListaAsignaturas() {
        inicio = null;
    }

    // Método para agregar un nodo al inicio de la lista
    public void agregarInicio(Asignatura asignatura) {
        NodoAsignatura nuevoNodo = new NodoAsignatura(asignatura);
        nuevoNodo.setSiguiente(inicio);
        inicio = nuevoNodo;
    }

    // Método para agregar un nodo al final de la lista
    public void agregarFin(Asignatura asignatura) {
        NodoAsignatura nuevoNodo = new NodoAsignatura(asignatura);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            NodoAsignatura actual = inicio;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    // Método para agregar un nodo entre dos nodos existentes
    public void agregarEntreDos(Asignatura asignatura, int posicion) {
        if (inicio == null) {
            System.out.println("La lista está vacía");
        } else if (posicion == 1) {
            agregarInicio(asignatura);
        } else {
            NodoAsignatura nuevoNodo = new NodoAsignatura(asignatura);
            NodoAsignatura actual = inicio;
            int contador = 1;
            while (contador < posicion - 1 && actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
                contador++;
            }
            if (actual.getSiguiente() == null) {
                System.out.println("No existe el nodo en la posición " + posicion);
            } else {
                nuevoNodo.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(nuevoNodo);
            }
        }
    }

    // Método para listar un nodo de la lista
    public void listar(int posicion) {
        if (inicio == null) {
            System.out.println("La lista está vacía");
        } else if (posicion == 1) {
            System.out.println("Código: " + inicio.getAsignatura().getCodigo());
            System.out.println("Nombre: " + inicio.getAsignatura().getNombre());
            System.out.println("Carrera: " + inicio.getAsignatura().getCarrera());
            System.out.println("Número de créditos: " + inicio.getAsignatura().getNumeroCreditos());
        } else {
            NodoAsignatura actual = inicio;
            int contador = 1;
            while (contador < posicion && actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
                contador++;
            }
            if (actual.getSiguiente() == null) {
                System.out.println("No existe el nodo en la posición " + posicion);
            } else {
                System.out.println("Código: " + actual.getAsignatura().getCodigo());
                System.out.println("Nombre: " + actual.getAsignatura().getNombre());
                System.out.println("Carrera: " + actual.getAsignatura().getCarrera());
                System.out.println("Número de créditos: " + actual.getAsignatura().getNumeroCreditos());
            }
        }
    }

    // Método para recorrer la lista de nodos
    public void recorrerLista() {
        if (inicio == null) {
            System.out.println("La lista está vacía");
        } else {
            NodoAsignatura actual = inicio;
            while (actual != null) {
                System.out.println("Código: " + actual.getAsignatura().getCodigo());
                System.out.println("Nombre: " + actual.getAsignatura().getNombre());
                System.out.println("Carrera: " + actual.getAsignatura().getCarrera());
                System.out.println("Número de créditos: " + actual.getAsignatura().getNumeroCreditos());
                actual = actual.getSiguiente();
            }
        }
    }
}
