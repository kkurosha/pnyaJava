import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Первый треугольник:");
        System.out.println("Введите длины сторон треугольника: ");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();
        System.out.println("Введите цвет треугольника: ");
        String color = in.next();
        System.out.println("Треугольник закрашен? (0 - нет, 1 - да): ");
        boolean isFilled = in.nextInt() != 0;
        Triangle triangle1 = new Triangle(side1, side2, side3, color, isFilled);

        System.out.println("Второй треугольник:");
        System.out.println("Введите длины сторон треугольника: ");
        side1 = in.nextDouble();
        side2 = in.nextDouble();
        side3 = in.nextDouble();
        System.out.println("Введите цвет треугольника: ");
        color = in.next();
        System.out.println("Треугольник закрашен? (0 - нет, 1 - да): ");
        isFilled = in.nextInt() != 0;
        Triangle triangle2 = new Triangle(side1, side2, side3, color, isFilled);
        in.close();
        System.out.println("\nПервый " + triangle1.toString());
        System.out.println("Площадь равна " + triangle1.getArea());
        System.out.println("Периметр равен " + triangle1.getPerimeter());

        System.out.println("\nВторой " + triangle2.toString());
        System.out.println("Площадь равна " + triangle2.getArea());
        System.out.println("Периметр равен " + triangle2.getPerimeter());

        System.out.println("\nНесуществующий треугольник: сторона1 = 1, сторона2 = 4, сторона3 = 1");
        Triangle triangle3 = new Triangle(1, 4, 1);
    }
}
