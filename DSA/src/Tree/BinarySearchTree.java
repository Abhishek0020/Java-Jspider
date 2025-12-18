package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    Node root;
    int count = 0;
    boolean flag = true;

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean add(int key) {
        root = add(key, root);
        return flag;
    }

    private Node add(int key, Node n) {
        if (n == null) {
            count++;
            flag = true;
            return new Node(key);
        }

        if (key < n.key) {
            n.left = add(key, n.left);
        } else if (key > n.key) {
            n.right = add(key, n.right);
        } else {
            // Duplicate key
            flag = false;
        }
        return n;
    }

    public void PreOrder() {
        System.out.print("PreOrder: ");
        PreOrder(root);
        System.out.println();
    }

    private void PreOrder(Node n) {
        if (n == null)
            return;
        System.out.print(n.key + " ");
        PreOrder(n.left);
        PreOrder(n.right);
    }

    public void PostOrder() {
        System.out.print("PostOrder: ");
        PostOrder(root);
        System.out.println();
    }

    private void PostOrder(Node n) {
        if (n == null)
            return;
        PostOrder(n.left);
        PostOrder(n.right);
        System.out.print(n.key + " ");
    }

    public void InOrder() {
        System.out.print("InOrder: ");
        InOrder(root);
        System.out.println();
    }

    private void InOrder(Node n) {
        if (n == null) return;
        InOrder(n.left);
        System.out.print(n.key + " ");
        InOrder(n.right);
    }

    public void LevelOrder() {
        System.out.print("LevelOrder: ");
        Queue<Node> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
            while (!q.isEmpty()) {
                Node n = q.poll();
                System.out.print(n.key + " ");
                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);
            }
        }
        System.out.println();
    }

    public boolean remove(int key) {
        if (root != null) {
            int before = count;
            root = remove(key, root);
            return count < before;
        }
        return false;
    }

    private Node remove(int key, Node n) {
        if (n == null)
            return null;

        if (key < n.key) {
            n.left = remove(key, n.left);
        } else if (key > n.key) {
            n.right = remove(key, n.right);
        } else {
            count--;
            if (n.left == null && n.right == null)
                return null;
            else if (n.left == null)
                return n.right;
            else if (n.right == null)
                return n.left;
            else {
                n.key = getMin(n.right);
                n.right = remove(n.key, n.right);
            }
        }
        return n;
    }

    private int getMin(Node n) {
        int min = n.key;
        while (n.left != null) {
            min = n.left.key;
            n = n.left;
        }
        return min;
    }
}
