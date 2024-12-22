package StackImpl;

public class Queue {
    private int front =-1;
    private int rear = -1;
    private int size=10;
    private int[] queue = new int[size];
    private int currentSize=0;

    public void enqueue(int x){
        if(currentSize==size){
            System.out.println("Overflow");
        }else if(currentSize==0){
            front=0;
            rear=0;
        }else{
            rear=(rear+1)%size;
        }
        queue[rear]=x;
        currentSize+=1;
    }

    public int dequeue(){
        int x=-1;
        if(currentSize==0){
            System.out.println("Underflow");
        }else if(currentSize==1){
            x=queue[front];
            front=-1;
            rear=-1;
            return x;
        }else{
            x=queue[front];
            front=(front+1)%size;
            return x;
        }
        return x;
    }

    public int size(){
        return currentSize;
    }

    public int top(){
        if(currentSize==0){
            System.out.printf("Underflow");
            return -1;
        }else {
            return queue[front];
        }
    }
}
