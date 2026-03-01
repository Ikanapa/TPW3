public class Rectangle extends Shape {
    // Variabel instans
    private double width;
    private double length;

    // No-arg constructor
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor dengan 2 parameter
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Constructor dengan 4 parameter
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter untuk width
    public double getWidth() {
        return width;
    }

    // Setter untuk width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter untuk length
    public double getLength() {
        return length;
    }

    // Setter untuk length
    public void setLength(double length) {
        this.length = length;
    }

    // Metode getArea
    public double getArea() {
        return width * length;
    }

    // Metode getPerimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override metode toString
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}