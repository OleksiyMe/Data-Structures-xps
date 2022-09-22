package PrintMiddleLL;

public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList sll=new MySinglyLinkedList();
        for (int i = 1; i <= 9; i++) {
            sll.add(i);
        }
        printMiddle(sll);
    }
    public static void printMiddle(MySinglyLinkedList sll){

        //create two pointers
        Node singleJumper=sll.head;
        Node doubleJumper=sll.head;

        while(doubleJumper!=sll.tail&& doubleJumper.next!=sll.tail){

            singleJumper=singleJumper.next;
            doubleJumper=doubleJumper.next.next;

        }

        if (doubleJumper==sll.tail){
            System.out.println(singleJumper.id);
        }else {
            System.out.println(singleJumper.id+ ", "+ singleJumper.next.id);
        }



    }

}
