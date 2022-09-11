package MyNodePackage;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StrNode {

    String element;
    StrNode nextPointer;


    public StrNode(String element) {
        this.element = element;
        nextPointer=null;
    }
}
