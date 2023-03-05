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
}