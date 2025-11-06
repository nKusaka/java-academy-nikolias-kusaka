import java.awt.*;

public class Triangle extends Shape {
    private int size;

    public Triangle(Turtle turtle, Point location, Color color, int border, int size) {
        super(turtle, location, color, border);
        this.size = size;
    }

    @Override
    public void paint() {
        turtle.setPenWidth(border);
        turtle.setColor(color);
        turtle.penUp();
        turtle.goTo(location.getX(), location.getY());
        turtle.penDown();

        for (int i = 0; i < 3; i++) {
            turtle.turnRight(120);
            turtle.forward(size);
        }
    }
}
