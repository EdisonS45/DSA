package LinkedListImpl;

import java.sql.SQLOutput;

public class LinkedList {
    private Node head;
    public Node insert(int data){
        Node node = new Node();
        node.data=data;
        if(head==null){
            head=node;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        return head;
    }

    public Node insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next=head;
        head=node;
        return head;
    }

    public Node inserAt(int index,int data){
        Node node = new Node();
        node.data = data;
        if(index==0){
            insertAtStart(data);
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            node.next =temp.next;
            temp.next=node;
        }
        return head;
    }

    public Node deleteHead(){
        if(head==null){
            return head;
        }
        head=head.next;
        return head;
    }

    public Node deleteAtEnd(){
        if(head.next==null){
            Node head = deleteHead();
            return head;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public Node deleteKthPosition(int index){
        if(head==null){
            return head;
        }
        else if(index==1){
            Node head = deleteHead();

        }else{
            int count=0;
            Node current=head;
            Node prev=null;
            while(current!=null){
                count++;
                if(count==index){
                    prev.next=current.next;
                    break;
                }

                prev=current;
                current=current.next;
            }
        }
        return head;
    }

    public Node deleteByValue(int val){
        if(head==null){
            return head;
        }
        else if(head.data==val){
            deleteHead();
        }
        else{
            Node current=head;
            Node prev=null;
            while(current!=null){
                if(current.data==val){
                    prev.next=current.next;
                }
                prev=current;
                current=current.next;
            }
        }
        return head;
    }
    public void show(){
        if(head==null){
            System.out.println("Empty LL");
            return;
        }else{
            Node temp = head;
            while(temp.next!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println(temp.data);
        }

    }
}