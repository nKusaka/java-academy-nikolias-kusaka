import java.awt.*;

import static java.awt.Color.RED;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(400, 400);
        Turtle turtle = new Turtle(world);

        Point start = new Point(0,0);
        Color borderColor = Color.RED;

        Shape square = new Square(turtle, start, borderColor, 3, 100);
        square.paint();

        Shape circle = new Circle(turtle, start, borderColor, 3, 1);
        circle.paint();

        Shape triangle = new Triangle(turtle, start, borderColor, 3, 100);
        triangle.paint();
    }
}
