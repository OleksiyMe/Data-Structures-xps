package MergeTwoSortedLL;

public class TestMerge {
    public static void main(String[] args) {

        ListNode n1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(56, null)))));
        System.out.println(listToString(n1));
        ListNode n2 = new ListNode(1, new ListNode(4, new ListNode(6, new ListNode(8, null))));
        System.out.println(listToString(n2));

        System.out.println(listToString(merge(n1, n2)));

    }

    private static ListNode merge(ListNode n1, ListNode n2) {
        ListNode current = new ListNode();
        ListNode dummy = new ListNode();
        dummy = current;

        while (n2 != null) {

            if (n2.val >= n1.val) {
                current.next=n1;
                n1=n1.next;

            } else {
                current.next=n2;
                n2=n2.next;
            }
            current=current.next;
       }
        if(n2!=null){
            current.next=n2;
        }else{
            current.next=n1;
        }


        return dummy.next;
    }


    private static String listToString(ListNode current) {
        StringBuffer sb = new StringBuffer();
        while (current != null) {
            sb.append(current.val + " ");
            current = current.next;
        }
        return sb.toString();
    }

}
