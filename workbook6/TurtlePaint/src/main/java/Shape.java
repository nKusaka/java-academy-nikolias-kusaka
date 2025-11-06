import java.awt.*;

public abstract class Shape {
    private String name;
    private Color color;
    private double thickness;

    public Shape(String name, Color color, double thickness) {
        this.name = name;
        this.color = color;
        this.thickness = thickness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
}
