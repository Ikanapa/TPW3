class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    /** Cetak informasi karyawan ke stdout */
    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    /** Naikkan gaji sebesar prosentase tertentu */
    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100.0;
    }

    public int hireYear() {
        return hireyear;
    }

    public double getSalary() {
        return salary;
    }

    /** Implementasi compare – membandingkan berdasarkan salary */
    @Override
    public int compare(Sortable b) {
        // Karena kita tahu bahwa objek yang dibandingkan selalu Employee,
        // kita bisa langsung cast. (Dalam aplikasi nyata, lebih aman
        // menggunakan instanceof atau generic Comparable<T>.)
        Employee eb = (Employee) b;
        if (this.salary < eb.salary) return -1;
        if (this.salary > eb.salary) return 1;
        return 0;
    }
}
