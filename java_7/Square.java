public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {}

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        setColor(color);
        setFilled(filled);
    }

    public void setSide(double side) { this.side = side; }
    public double getSide() {
        return side;
    }

    public double getArea(){ return side * side; }
    public double getPerimeter() { return 4 * side; }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }
}
