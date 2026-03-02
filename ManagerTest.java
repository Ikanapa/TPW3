public class ManagerTest {
    public static void main(String[] args) {
        // Mendeklarasikan array bertipe Sortable (polimorfisme)
        Sortable[] staff = new Sortable[4];

        // Mengisi array dengan kombinasi Employee dan Manager
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        staff[3] = new Manager("Carlo Rossi", 3500000, 15, 3, 1990);

        System.out.println("=== Sebelum diurutkan ===");
        for (int i = 0; i < staff.length; i++) {
            staff[i].print();
        }

        // Mengurutkan menggunakan shell_sort (来自于 Sortable)
        Sortable.shell_sort(staff);

        System.out.println("\n=== Sesudah diurutkan (berdasarkan salary) ===");
        for (int i = 0; i < staff.length; i++) {
            staff[i].print();
        }

        // Contoh pemanggilan compare secara langsung
        System.out.println("\n=== Contoh pemanggilan compare ===");
        int cmp = staff[0].compare(staff[1]);
        System.out.println("compare(staff[0], staff[1]) = " + cmp);
    }
}