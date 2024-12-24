public class MaxCircle {

    public static Circle findMaxCircle(Circle[] circles) {
        if (circles == null || circles.length == 0)
            return null;

        Circle maxCircle = circles[0];
        for (Circle circle : circles) {
            if (circle.compareTo(maxCircle) > 0) {
                maxCircle = circle;
            }
        }
        return maxCircle;
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(1.5),
                new Circle(2.5),
                new Circle(2.0)
        };
        Circle maxCircle = findMaxCircle(circles);
        System.out.println(maxCircle.getRadius());
    }
}