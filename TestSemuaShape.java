public class TestSemuaShape {
    public static void main(String[] args) {
        
        // 1. Menguji Superclass Shape
        System.out.println("=== 1. Menguji Kelas Shape ===");
        Shape shape = new Shape("kuning", false);
        System.out.println(shape.toString());

        // 2. Menguji Subclass Circle
        System.out.println("\n=== 2. Menguji Kelas Circle ===");
        Circle circle = new Circle(5.0, "biru", true);
        System.out.println(circle.toString());
        System.out.println("Luas (Area): " + circle.getArea());
        System.out.println("Keliling (Perimeter): " + circle.getPerimeter());

        // 3. Menguji Subclass Rectangle
        System.out.println("\n=== 3. Menguji Kelas Rectangle ===");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "merah muda", true);
        System.out.println(rectangle.toString());
        System.out.println("Luas (Area): " + rectangle.getArea());
        System.out.println("Keliling (Perimeter): " + rectangle.getPerimeter());

        // 4. Menguji Subclass Square
        System.out.println("\n=== 4. Menguji Kelas Square ===");
        Square square = new Square(3.0, "ungu", false);
        System.out.println(square.toString());
        System.out.println("Luas awal: " + square.getArea()); // Seharusnya 3 * 3 = 9
        System.out.println("Keliling awal: " + square.getPerimeter()); // Seharusnya 4 * 3 = 12

        // 5. Menguji constraint geometri pada Square (Fitur Override setWidth & setLength)
        System.out.println("\n=== 5. Menguji Constraint Geometri Square ===");
        System.out.println("-> Mengubah width menjadi 5.0...");
        square.setWidth(5.0);
        // Perhatikan bahwa length ikut berubah menjadi 5.0 secara otomatis
        System.out.println(square.toString());
        System.out.println("Luas baru: " + square.getArea()); // Seharusnya 5 * 5 = 25

        System.out.println("-> Mengubah length menjadi 7.0...");
        square.setLength(7.0);
        // Perhatikan bahwa width ikut berubah menjadi 7.0 secara otomatis
        System.out.println(square.toString());
        System.out.println("Keliling baru: " + square.getPerimeter()); // Seharusnya 4 * 7 = 28
    }
}