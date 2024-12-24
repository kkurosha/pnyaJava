import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class Triangle extends GeometricObject implements Colorable {
    private double side1, side2, side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        try {
            if (Math.max(side1, Math.max(side2, side3)) >= (side1 + side2 + side3 - Math.max(side1, Math.max(side2, side3)))) {
                throw new IllegalTriangleException("Такого треугольника быть не может");
            }
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        catch (IllegalTriangleException Q) {
            System.out.println(Q);
        }
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this(side1, side2, side3);
        setColor(color);
        setFilled(filled);
    }

    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) { this.side1 = side1; }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double getPerimeter() { return side1 + side2 + side3; }

    public String toString() {
        return "Треугольник: сторона1 = " + side1 + " сторона2 = " + side2 + " сторона3 = " + side3;
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все три стороны");
    }
}
