public class Test3 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        System.out.println("Наибольший круг:\n" + circle1.max(circle1, circle2).toString());
        Rectangle rectangle1 = new Rectangle(5, 1);
        Rectangle rectangle2 = new Rectangle(4,2);
        System.out.println("\nНаибольший прямоугольник:\n" + rectangle1.max(rectangle1, rectangle2).toString());
        System.out.println("\nНаибольшая фигура:\n" + rectangle1.max(rectangle1, circle2).toString());
    }
}
