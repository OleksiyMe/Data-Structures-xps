package myStringLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(new StrNode("alpha"));
        list.add(new StrNode("bravo"));
        list.add(new StrNode("charlie"));
        list.add(new StrNode("delta"));
        list.add(new StrNode("foxtrot"));
        System.out.println(list);

    }
}
