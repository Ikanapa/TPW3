class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String name) {
        secretaryName = name;
    }

    // Manager menggunakan implementasi compare dari Employee
    // (berdasarkan salary), karena Manager extends Employee
}