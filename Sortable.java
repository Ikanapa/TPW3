abstract class Sortable {
    /**\Komparasi this dengan objek lain.
     * @return -1 jika this < b, 0 jika sama, 1 jika this > b
     */
    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        int n = a.length;

        // Gap awal = n/2, lalu dibagi 2 setiap iterasi
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Insertion sort untuk setiap gap
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
    }
}
