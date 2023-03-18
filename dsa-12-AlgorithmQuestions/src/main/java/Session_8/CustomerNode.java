package Session_8;

public class CustomerNode {
    String firstName;
    String lastName;
    String email;
    String number;
    CustomerNode leftChild;
    CustomerNode rightChild;

    public CustomerNode(String firstName, String lastName, String email, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
    }
}
