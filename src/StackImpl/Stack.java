package StackImpl;

public class Stack {
    private int top=-1;
    private int size=10;
    private int[] st = new int[size];

    public boolean push(int x){
        if(top==size-1){
            System.out.println("Overflow");
            return false;
        }else{
            top++;
            st[top]=x;
            return true;
        }
    }

    public int pop(){
        if(top==-1){
            System.out.println("Underflow!");
        }else{
            int x=st[top];
            top--;
            return x;
        }
        return 0;
    }

    public int size(){
        return top+1;
    }

    public int top(){
        if(top==-1){
            System.out.println("Underflow");
            return -1;
        }else{
            int x=st[top];
            return x;
        }

    }
}
