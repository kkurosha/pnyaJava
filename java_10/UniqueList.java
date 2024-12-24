import java.util.ArrayList;
import java.util.List;

public class UniqueList {

    public static List<Object> removeDuplicates(List<Object> list) {
        List<Object> uniqueList = new ArrayList<>();
        for (Object item : list) {
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("a");
        list.add("0");
        list.add("0");
        list.add("b");
        list.add("a");
        list.add("c");

        List<Object> unique = removeDuplicates(list);
        System.out.println(unique);
    }
}
