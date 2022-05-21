// A subclass of TwoDShape for circles.
public class Circle extends TwoDShape {
    // A default constructor.
    private final double diameter;

    public Circle() {
        super();
        diameter = 1;
    }
    // Construct Circle using a diameter.
    public Circle(double x) {
        super(x);
        diameter = x;
    }

    public double area() {
        return Math.PI * Math.pow((diameter/2), 2);
    }
}