import java.util.Arrays;
import java.util.Scanner;

public class GenericStack<E> {
    private E[] list = (E[]) new Object[1];
    private int currentSize = 0;

    public int getSize() {
        return currentSize;
    }

    public E peek() {
        if (currentSize > 0) {
            return list[currentSize - 1];
        }
        return null;
    }

    public void push(E o) {
        if (currentSize == list.length) {
            list = Arrays.copyOf(list, currentSize * 2);
        }
        list[currentSize] = o;
        currentSize++;
    }

    public E pop() {
        E o = peek();
        if (currentSize > 0) {
            list[currentSize - 1] = null;
            currentSize--;
        }
        return o;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Стек:");
        for (int i = currentSize - 1; i >= 0; i--) {
            str.append(" ").append(list[i]);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<String>();
        for (int i = 0; i < 5; i++) {
            stack.push(in.nextLine());
        }
        stack.pop();
        System.out.println(stack.toString());
    }
}
