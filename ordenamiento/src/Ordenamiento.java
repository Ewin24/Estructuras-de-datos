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
}
