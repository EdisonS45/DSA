package StackImpl;

public class StackUsingQueue {
    Queue queue = new Queue();

    public void push(int x){

        queue.enqueue(x);
        int s = queue.size();
        for(int i=0;i<s-1;i++){
            queue.enqueue(queue.dequeue());
        }
    }

    public int pop(){
        return queue.dequeue();
    }

    public int size(){
        return queue.size();
    }

    public int top(){
        return queue.top();
    }
}
