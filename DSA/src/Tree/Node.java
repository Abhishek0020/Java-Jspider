package Tree;

public class Node {
    Node left;
    int key;
    Node right;

    Node(int key) {
        this.key = key;
    }

    public Node(Node left, int key, Node right) {
        this.left = left;
        this.key = key;
        this.right = right;
    }
}
