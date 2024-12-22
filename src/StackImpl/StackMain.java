package StackImpl;

public class StackMain {
    public static void main(String a[]){
        StackUsingQueue queue = new StackUsingQueue();
        queue.push(34);
        queue.push(94);
        queue.push(14);
        queue.push(24);
        System.out.println("Element removed: "+queue.pop());
        System.out.println("Element removed: "+queue.pop());
        System.out.println(queue.top());
    }
}
