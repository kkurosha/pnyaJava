public class MaxInArray {
    public static ComparableElement findMaxInArray(ComparableElement[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) return null;
        ComparableElement maxElement = array[0][0];
        for (ComparableElement[] row : array) {
            for (ComparableElement element : row) {
                if (element.compareTo(maxElement) > 0) {
                    maxElement = element;
                }
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        ComparableElement[][] array = {
                { new ComparableElement(1), new ComparableElement(2), new ComparableElement(3) },
                { new ComparableElement(4), new ComparableElement(10), new ComparableElement(5) },
                { new ComparableElement(7), new ComparableElement(6), new ComparableElement(8) }
        };
        ComparableElement maxElement = findMaxInArray(array);
        System.out.println(maxElement.getValue());
    }
}