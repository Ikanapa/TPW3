public class Square extends Rectangle {

    // 1. No-arg constructor
    public Square() {
        super(); 
    }

    // 2. Constructor dengan 1 parameter (side)
    public Square(double side) {
        super(side, side); 
    }

    // 3. Constructor dengan 3 parameter
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); 
    }

    // Getter untuk side (karena width dan length sama, kita bisa kembalikan salah satu)
    public double getSide() {
        return super.getWidth(); 
    }

    // Setter untuk side
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setWidth untuk menjaga geometri persegi
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setLength untuk menjaga geometri persegi
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override toString
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}