public class Circle extends Shape {
    // Variabel instans
    private double radius;

    // No-arg constructor
    public Circle() {
        super(); // Memanggil no-arg constructor dari superclass (Shape)
        this.radius = 1.0;
    }

    // Constructor dengan 1 parameter
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor dengan 3 parameter
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Memanggil constructor berparameter dari superclass
        this.radius = radius;
    }

    // Getter untuk radius
    public double getRadius() {
        return radius;
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metode getArea
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Metode getPerimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override metode toString
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}