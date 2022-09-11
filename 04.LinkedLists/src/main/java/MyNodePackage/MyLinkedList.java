package MyNodePackage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyLinkedList {

    StrNode first;
    StrNode last;
    Integer size;

    public MyLinkedList() {
        this.size = 0;
    }

    public boolean add(StrNode element) {
        if (size == 0) {
            first = last = element;
            size++;
            return true;
        }
        StrNode previous = last;
        last = element;
        previous.setNextPointer(element);
        size++;
        return true;

    }
    boolean isEmpty() {
        return first == null;
    }
    @Override
    public String toString() {
        String result = "";
        StrNode element = first;
        if (isEmpty()) return "Your list is empty";




        for (int i = 1; i <= size; i++) {
            StrNode previous = element;
            result += element.getElement() + " ";
            if (element.nextPointer != null) element = element.nextPointer;


        }

        return result;
    }
}
