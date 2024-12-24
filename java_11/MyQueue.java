import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
//poll - возвращает с удалением элемент из начала очереди
//peek - возвращает без удаления элемент из начала очереди

public class MyQueue {
    ArrayDeque<Integer> mQueue = new ArrayDeque<Integer>();
    ArrayDeque<Integer> sQueue = new ArrayDeque<Integer>();

    public boolean isEmpty() { return mQueue.isEmpty(); }
    public void push(int x) { //помещает элемент на вершину стека
        sQueue.add(x);
        while (!mQueue.isEmpty()) { sQueue.add(mQueue.poll()); }
        ArrayDeque<Integer> cQueue = mQueue;
        mQueue = sQueue;
        sQueue = cQueue;
    }
    public int pop() { //удаляет элемент на вершине стека и возвращает его
        if (isEmpty()) throw new IllegalStateException("Пусто");
        return mQueue.poll();
    }
    public int top() { //возвращает элемент на вершине стека
        if (isEmpty()) throw new IllegalStateException("Пусто");
        return mQueue.peek();
    }
    public String toString() {
        return mQueue.toString();
    }
}
