public class Test4 {
    public static void main(String[] args) {
        GeometricObject[] figures = new GeometricObject[5];
        figures[0] = new Circle(3);
        figures[1] = new Square(5);
        figures[2] = new Triangle(3, 4, 5);
        figures[3] = new Rectangle(5, 3);
        figures[4] = new Circle(4);
        for (int i = 0; i < 5; i++){
            System.out.println("\nПлощадь: " + figures[i].getArea());
            figures[i].howToColor();
        }
    }
}
