public class Shape {
    // Variabel instans
    private String color;
    private boolean filled;

    // No-arg constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor dengan parameter
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter untuk color
    public String getColor() {
        return color;
    }

    // Setter untuk color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter untuk filled (menggunakan konvensi isXXX untuk boolean)
    public boolean isFilled() {
        return filled;
    }

    // Setter untuk filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Metode toString
    @Override
    public String toString() {
        String filledStatus = isFilled() ? "filled" : "Not filled";
        return "A Shape with color of " + color + " and " + filledStatus;
    }
} 
    

