import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TNode root;

    public MyTree() {
    }

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {

                if (current.leftChild == null) {
                    // if left is null insert there!!!
                    current.leftChild = newNode;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    // if right is null insert there!!!
                    current.rightChild = newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current = current.rightChild;
            }
        }
    }

    // PreOrder Traversal of the tree
    // Root-Left-Right
    void preOrderTraversal(TNode root) {
        if (root == null) return;
        System.out.print(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    void preOrderByMe(TNode root) {
        if (root == null) return;
        System.out.print(root.value + ", ");
        preOrderByMe(root.leftChild);
        preOrderByMe(root.rightChild);
    }

    // InOrder Traversal of the tree  (Ascending Order, if it a binary search tree)
    // Left-Root-Right  (Ascending Order, if it a binary search tree)
    void inOrderTraversal(TNode root) {
        if (root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    void inOrderTraversalByMe(TNode root) {
        if (root == null) return;
        inOrderTraversalByMe(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    // PostOrder Traversal of the tree
    // Left-Right-Root
    void postOrderTraversal(TNode root) {
        if (root == null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");
    }

    void postOrderByMe(TNode root) {
        if (root == null) return;
        postOrderByMe(root.leftChild);
        postOrderByMe(root.rightChild);
        System.out.print(root.value + ", ");

    }

    //Breadth First traversal (level-order traversal, not recursive)

    void levelOrderTraversal() {

        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value + ", ");
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);

        }
    }

    void levelTraversalByMe() {

        if (root == null) return;
        ArrayDeque<TNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            TNode vizited = queue.poll();
            System.out.print(vizited.value + ", ");
            if (vizited.leftChild != null) queue.add(vizited.leftChild);
            if (vizited.rightChild != null) queue.add(vizited.rightChild);
        }
    }

    ;


}
