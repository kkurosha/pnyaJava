import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueList {
    public static void main(String[] args) {
        MyQueue newQueue = new MyQueue();
        newQueue.push(4);
        newQueue.push(3);
        System.out.println("Стек: " + newQueue);
        System.out.println("Элемент на вершине стека: " + newQueue.top());
        System.out.println("Элемент на вершине стека, который удалится: " + newQueue.pop());
        System.out.println("Стек: " + newQueue);
        System.out.println("Стек пуст? - " + newQueue.isEmpty());
        System.out.println("Элемент на вершине стека, который удалится: " + newQueue.pop());
        System.out.println("Стек пуст? - " + newQueue.isEmpty());
    }
}


