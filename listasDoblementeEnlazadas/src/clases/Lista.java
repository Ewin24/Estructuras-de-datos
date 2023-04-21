public class Lista {
    private Nodo primero;
    private Nodo ultimo;

    public Lista() {
        primero = null;
        ultimo = null;
    }

    // Método para agregar un nodo al principio de la lista
    public void agregarAlInicio(Asignatura asignatura) {
        Nodo nuevo = new Nodo(asignatura);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
    }

    // Método para agregar un nodo al final de la lista
    public void agregarAlFinal(Asignatura asignatura) {
        Nodo nuevo = new Nodo(asignatura);
        if (ultimo == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }

// Método para agregar un nodo entre dos nodos existentes
        public void agregarEntreNodos(Asignatura asignatura, Nodo nodoAnterior, Nodo nodoSiguiente) {
            Nodo nuevo = new Nodo(asignatura);
            nuevo.setAnterior(nodoAnterior);
            nuevo.setSiguiente(nodoSiguiente);
            nodoAnterior.setSiguiente(nuevo);
            nodoSiguiente.setAnterior(nuevo);
        }

// Método para eliminar un nodo de la lista
        public void eliminarNodo(Nodo nodo) {
            if (nodo == primero) {
                primero = nodo.getSiguiente();
                if (primero != null) {
                    primero.setAnterior(null);
                } else {
                    ultimo = null;
                }
            } else if (nodo == ultimo) {
                ultimo = nodo.getAnterior();
                if (ultimo != null) {
                    ultimo.setSiguiente(null);
                } else {
                    primero = null;
                }
            } else {
                nodo.getAnterior().setSiguiente(nodo.getSiguiente());
                nodo.getSiguiente().setAnterior(nodo.getAnterior());
            }
        }

// Método para recorrer la lista de principio a fin
        public void recorrerListaDePrincipioAFin() {
            Nodo actual = primero;
            while (actual != null) {
                System.out.println(actual.getAsignatura().toString());
                actual = actual.getSiguiente();
            }
        }

// Método para recorrer la lista de fin a principio
        public void recorrerListaDeFinAPrincipio() {
            Nodo actual = ultimo;
            while (actual != null) {
                System.out.println(actual.getAsignatura().toString());
                actual = actual.getAnterior();
            }
        }
    }

