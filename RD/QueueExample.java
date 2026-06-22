package RD;
import java.util.*;
public class QueueExample {
    public static void main(String[] args) {


        Queue<Integer> queue = new LinkedList<>();

        queue.offer(5);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Queue: " + queue.isEmpty());
        System.out.println("Queue Peek: " + queue.peek());
        System.out.println("Queue before Poll: " + queue);
        System.out.println("Queue Poll: " + queue.poll());
        System.out.println("Queue after Poll: " + queue);


        System.out.println("=====================================");
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: " + stack.isEmpty());
        System.out.println("Stack Peek: " + stack.peek());
        System.out.println("Stack before Pop: " + stack);
        System.out.println("Stack Pop: " + stack.pop());
    
    
        System.out.println("======================================");

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(5);
        deque.offerFirst(1);
        deque.offerLast(2);
        deque.offerLast(3);
        System.out.println("Deque: " + deque);
    }
}
