package myStringLinkedList;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StrNode {

    String element;
    StrNode next;


    public StrNode(String element) {
        this.element = element;
        next =null;
    }
}
