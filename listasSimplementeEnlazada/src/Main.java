// Clase Main
public class Main {
    public static void main(String[] args) {
        // Crear instancias de la clase Asignatura
        Asignatura asignatura1 = new Asignatura(1, "Programación I", "Ingeniería en Sistemas", 4);
        Asignatura asignatura2 = new Asignatura(2, "Programación II", "Ingeniería en Sistemas", 4);
        Asignatura asignatura3 = new Asignatura(3, "Base de datos I", "Ingeniería en Sistemas", 4);
        Asignatura asignatura4 = new Asignatura(4, "Base de datos II", "Ingeniería en Sistemas", 4);
        Asignatura asignatura5 = new Asignatura(5, "Ingeniería de software", "Ingeniería en Sistemas", 4);

        // Crear instancia de la clase ListaAsignaturas
        ListaAsignaturas lista = new ListaAsignaturas();

        // Agregar nodos por
        // Agregar nodos por el inicio
        lista.agregarInicio(asignatura1);
        lista.agregarInicio(asignatura2);

        // Agregar nodo por el fin
        lista.agregarFin(asignatura3);

        // Agregar nodo entre dos nodos
        lista.agregarEntreDos(asignatura4, 2);

        // Listar un nodo
        lista.listar(1);

        // Recorrer la lista de nodos
        lista.recorrerLista();
    }
}
