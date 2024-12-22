package LinkedListImpl;
public class Runner {
    public static void main(String a[]){
        LinkedList list = new LinkedList();

        // Add some test nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original List:");
        list.show();

        // Test deleteHead
        System.out.println("\nDeleting head:");
        list.deleteHead();
        list.show();

        // Test deleteAtEnd
        System.out.println("\nDeleting last node:");
        list.deleteAtEnd();
        list.show();

        // Test deleteKthPosition
        System.out.println("\nDeleting 2nd node:");
        list.deleteKthPosition(2);
        list.show();

        // Test deleteByValue
        System.out.println("\nDeleting node with value 30:");
        list.deleteByValue(30);
        list.show();

        // Edge Case: Deleting from an empty list
        System.out.println("\nDeleting from an empty list:");
        list.deleteHead();
        list.deleteHead();
        list.show();
    }
}
