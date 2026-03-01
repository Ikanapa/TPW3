public class Cylinder extends Circle {
    // Private variable specific to Cylinder
    private double height;

    // Constructor with default color, radius and height
    public Cylinder() {
        super();              
        this.height = 1.0;
    }

    // Constructor with default radius and color, but given height
    public Cylinder(double height) {
        super();              
        this.height = height;
    }

    // Constructor with default color, but given radius and height
    public Cylinder(double radius, double height) {
        super(radius);        
        this.height = height;
    }

    // Constructor with given radius, height, and color
    public Cylinder(double radius, double height, String color) {
        super(radius, color); 
        this.height = height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // A public method for computing the volume of cylinder
    // Uses superclass method getArea() to get the base area
    public double getVolume() {
        return getArea() * height;  // getArea() diwarisi dari Circle
    }

    /**
     * Override metode toString() dari superclass Circle
     * Mengembalikan representasi string dari Cylinder
     */
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()  
               + " height=" + height;
    }
}