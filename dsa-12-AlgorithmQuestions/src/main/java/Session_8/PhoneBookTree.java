package Session_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PhoneBookTree {
    CustomerNode root;

    public PhoneBookTree() {
        this.root=null;
    }
    void insert(CustomerNode newNode){
        if(root==null) {
            root=newNode;
            return;
        }
        CustomerNode current=root;

        while (true){
            if (newNode.firstName.compareToIgnoreCase(current.firstName)<0) { //less then current
                //if left is null right place to insert
                if (current.leftChild==null){
                    current.leftChild=newNode;
                    break;
                }
                current=current.leftChild; // branch left
            }
            else { // greater or equal than the current
                if (current.rightChild==null){
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;// branch right
            }
        }
    }

    void printNamesInAscOrder(CustomerNode root){
        if (root==null) return;// termination
        printNamesInAscOrder(root.leftChild);//Left Child
        System.out.println(root.firstName);//Root-do operation in here
        printNamesInAscOrder(root.rightChild);
        //right Child
    }
    List<String> firstNamesList(CustomerNode root){ // This is an In Order Traversal Iteratively
        List<String> list=new ArrayList<>();
        Stack<CustomerNode> stack=new Stack<>();
        while(!stack.isEmpty()||root!=null){
            if(root!=null){
                stack.push(root);
                root=root.leftChild;
            }else { // root is null
                root = stack.pop();
                list.add(root.firstName);
                root = root.rightChild;
            }
        }
        return list;
    }
    List<String> firstNamesListRecursive(CustomerNode root,List<String> list){ // This is an In Order Traversal Iteratively
        if (root==null) return list;
        firstNamesListRecursive(root.leftChild,list);
        list.add(root.firstName);
        firstNamesListRecursive(root.rightChild,list);
        return list;
    }
    List<String> firstNamesList3(CustomerNode root) { // This is an In Order Traversal Recursive, with no list as a parameter
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        result.addAll(firstNamesList3(root.leftChild));
        result.add(root.firstName);
        result.addAll(firstNamesList3(root.rightChild));
        return result;

    }

}

