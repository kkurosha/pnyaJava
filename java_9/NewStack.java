import java.util.ArrayList;
import java.util.Scanner;

public class NewStack<E> extends ArrayList<E> {
    public NewStack() {super();}
    public int getSize() {return this.size();}
    public E peek() { return this.get(this.size()-1);}
    public void push(E o) { this.add(o);}
    public E pop() {
        E o = peek();
        this.remove(getSize()-1);
        return o;
    }

    @Override
    public String toString() {return "стек: " + super.reversed().toString();}

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        NewStack<String> stack = new NewStack<String>();
        System.out.println("Введите пять строк:");
        for(int i = 0; i < 5; i++){
            stack.push(in.nextLine());
        }
        System.out.println(stack.toString());
    }
}
