package ordenamiento;


import java.util.ArrayList;

public class Ordenamiento {

    public static void odrInsercion(int[] a) {
        int aux;
        for (int i = 1; i < a.length; i++) {
            int j = 1;
            aux = a[i];
            while (j > 0 && aux < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = aux;
        }
    }

    public static void insertionSort(ArrayList<Asignatura> list) {
        for (int i = 1; i < list.size(); i++) {
            Asignatura current = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).getCodigo() > current.getCodigo()) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, current);
        }
    }

    public static void selectionSort(ArrayList<Asignatura> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getCodigo() < list.get(minIndex).getCodigo()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Asignatura temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }

    public static void bubbleSort(ArrayList<Asignatura> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).getCodigo() > list.get(j + 1).getCodigo()) {
                    Asignatura temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    // Pseudocódigo para quicksort en Java
    public static void quicksort(ArrayList<Asignatura> array, int izq, int der) {
        if (izq < der) {
            // Elegir un pivote
            Asignatura pivote = array.get(izq);

            // Particionar el array alrededor del pivote
            int i = izq + 1;
            int j = der;
            while (i <= j) {
                // Encontrar el primer elemento mayor que el pivote
                while (i <= j && array.get(i).getCodigo() <= pivote.getCodigo()) {
                    i++;
                }

                // Encontrar el primer elemento menor que el pivote
                while (i <= j && array.get(j).getCodigo() > pivote.getCodigo()) {
                    j--;
                }

                // Si aún no se cruzan los índices, intercambiar los elementos
                if (i < j) {
                    Asignatura temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }

            // Colocar el pivote en su posición correcta
            Asignatura temp = array.get(izq);
            array.set(izq, array.get(j));
            array.set(j, temp);

            // Ordenar recursivamente los sub-arrays izquierdo y derecho
            quicksort(array, izq, j - 1);
            quicksort(array, j + 1, der);
        }
    }

    public static int busquedaBinaria(ArrayList<Asignatura> array, int valorBuscado) {
        int izquierda = 0;
        int derecha = array.size() - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (array.get(medio).getCodigo() == valorBuscado) {
                return medio; // Encontrado
            } else if (array.get(medio).getCodigo() < valorBuscado) {
                izquierda = medio + 1; // Buscar en la mitad derecha
            } else {
                derecha = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // No encontrado
    }
}
