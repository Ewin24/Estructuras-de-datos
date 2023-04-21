public class Main {
    public static void main(String[] args) {
        // Crear la lista
        Lista lista = new Lista();

        // Agregar nodos al principio
        lista.agregarAlInicio(new Asignatura(1, "Matemáticas", "Ingeniería", 4));
        lista.agregarAlInicio(new Asignatura(2, "Física", "Ingeniería", 4));
        lista.agregarAlInicio(new Asignatura(3, "Programación", "Informática", 5));

        // Agregar nodos al final
        lista.agregarAlFinal(new Asignatura(4, "Historia", "Humanidades", 3));
        lista.agregarAlFinal(new Asignatura(5, "Economía", "Ciencias Económicas", 4));

        // Agregar un nodo entre nodos existentes
        Nodo nodo1 = lista.getPrimero().getSiguiente();
        Nodo nodo2 = lista.getUltimo().getAnterior();
        lista.agregarEntreNodos(new Asignatura(6, "Biología", "Ciencias Naturales", 4), nodo1, nodo2);

        // Eliminar un nodo
        Nodo nodoEliminar = lista.getUltimo().getAnterior();
        lista.eliminarNodo(nodoEliminar);

        // Recorrer la lista de principio a fin
        System.out.println("Lista de principio a fin:");
        lista.recorrerListaDePrincipioAFin();

        // Recorrer la lista de fin a principio
        System.out.println("Lista de fin a principio:");
        lista.recorrerListaDeFinAPrincipio();
    }
}