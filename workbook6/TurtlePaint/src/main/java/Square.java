import java.awt.*;

public class Square extends Shape {
    private double length;
    private double width;

    public Square(String name, Color color, double thickness, double length, double width) {
        super(name, color, thickness);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
