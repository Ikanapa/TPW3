public class TestShape {
    public static void main(String[] args) {
        // Menguji no-arg constructor
        System.out.println("=== Menguji Shape 1 (No-arg Constructor) ===");
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());
        System.out.println("Warna: " + shape1.getColor());
        System.out.println("Apakah terisi? " + shape1.isFilled());

        System.out.println("\n=== Menguji Shape 2 (Parameterized Constructor) ===");
        // Menguji constructor dengan argumen
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2.toString());
        System.out.println("Warna: " + shape2.getColor());
        System.out.println("Apakah terisi? " + shape2.isFilled());

        System.out.println("\n=== Menguji Setter pada Shape 1 ===");
        // Menguji metode setter
        shape1.setColor("red");
        shape1.setFilled(false);
        System.out.println("Setelah diubah: " + shape1.toString());
        System.out.println("Warna baru: " + shape1.getColor());
        System.out.println("Status terisi baru: " + shape1.isFilled());
    }
}