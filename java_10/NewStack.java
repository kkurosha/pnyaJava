import java.util.ArrayList;
import java.util.Scanner;

public class NewStack<E> extends ArrayList<E> implements Cloneable {
    public NewStack() { super(); }
    public int getSize() { return this.size(); }
    public E peek() { return this.get(this.size()-1); }
    public void push(E o) { this.add(o); }
    public E pop() {
        E o = peek();
        this.remove(getSize()-1);
        return o;
    }
    @Override
    public String toString() {return "стек: " + super.reversed().toString();}

    public NewStack<E> deepCopy() {
        NewStack<E> copy = new NewStack<E>();
        for (int i = 0; i < getSize(); i++) {
            copy.push(this.get(i));
        }
        return copy;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        NewStack<String> stack = new NewStack<String>();
        System.out.println("Введите пять строк:");
        for(int i = 0; i < 5; i++){
            stack.push(in.nextLine());
        }
        System.out.println(stack.toString());

        NewStack<String> copyStack = stack.deepCopy();
        System.out.println(copyStack.toString());
        stack.push("999");
        System.out.println(stack.toString());
        System.out.println(copyStack.toString());

    }
}
