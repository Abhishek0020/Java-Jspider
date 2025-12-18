package Tree;

public class Driver {
    public static void main(String[] args) {
    	  BinarySearchTree bst = new BinarySearchTree();

          // Insert elements
          int[] keys = {80,50,90,100,85,55,40,52,60};
          for (int key : keys) {
              bst.add(key);
          }

          // Display traversals
          bst.PreOrder();
          bst.InOrder();
          bst.PostOrder();
          bst.LevelOrder();

          // Size
          System.out.println("Size: " + bst.size());

          // Delete a node
          System.out.println("Removing 70...");
          bst.remove(70);
          bst.InOrder();
          System.out.println("Size after removal: " + bst.size());

          // Try removing non-existent key
          System.out.println("Trying to remove 100...");
          boolean removed = bst.remove(100);
          System.out.println("Was 100 removed? " + removed);
      }
  }