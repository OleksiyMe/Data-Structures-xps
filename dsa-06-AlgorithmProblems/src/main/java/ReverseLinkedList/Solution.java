package ReverseLinkedList;

public class Solution {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();

        for (int i = 0; i < 10; i++) list.add(i);
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();
    }

    static void reverse(MySinglyLinkedList list) {
        Node prev = list.head;                          //creating two pointers
        Node current = list.head.next;

        while (current != null) {     //iterating until curr==null

            Node nextNode = current.next;    //change direction of current to prev
            current.next = prev;      //move prev to the right to the current
            prev = current;             //move current to right on the next node
            current = nextNode;
        }
        list.tail = list.head;   //adjusting head and tail
        list.tail.next = null;
        list.head = prev;

    }
}
