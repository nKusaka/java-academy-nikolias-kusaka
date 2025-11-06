import java.awt.*;

public class Triangle extends Shape {
    private double baseLength;
    private double height;

    public Triangle(String name, Color color, double thickness, double baseLength, double height) {
        super(name, color, thickness);
        this.baseLength = baseLength;
        this.height = height;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
