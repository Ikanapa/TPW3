public class EmployeeTest {
    public static void main(String[] args) {
        // Membuat array 3 objek Employee
        Employee[] staff = new Employee[3];

        // Mengisi data karyawan
        staff[0] = new Employee("Antonio Rossi", 2_000_000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2_500_000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal",   3_000_000, 1, 11, 1993);

        // Menaikkan gaji masing‑masing sebesar 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        System.out.println("=== Sebelum diurutkan ===");
        for (Employee e : staff) {
            e.print();
        }

        // Mengurutkan menggunakan shell_sort (yang memanfaatkan compare)
        Sortable.shell_sort(staff);

        System.out.println("\n=== Sesudah diurutkan (menaik berdasarkan salary) ===");
        for (Employee e : staff) {
            e.print();
            
        }
    }
}