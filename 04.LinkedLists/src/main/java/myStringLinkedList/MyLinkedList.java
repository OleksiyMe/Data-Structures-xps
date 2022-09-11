package myStringLinkedList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyLinkedList {

    StrNode head;
    StrNode tail;
    Integer size;

    public MyLinkedList() {
        this.size = 0;
    }


    public boolean add(StrNode element) {
        if (isEmpty()) {
            head = tail = element;
            size++;
            return true;
        }
      //  StrNode previous = tail;
        tail.setNext(element);
        tail=element;
        size++;
        return true;

    }
    boolean isEmpty() {
        return head == null;
    }
    @Override
    public String toString() {
        String result = "";
        StrNode element = head;
        if (isEmpty()) return "Your list is empty";

        for (int i = 1; i <= size; i++) {
            StrNode previous = element;
           if (size==i) result += element.getElement() + "=> null ";
           else result += element.getElement() + "=> ";
        //    result += element.getElement() + " ";
            element = element.next;


        }

        return result;
    }
}
