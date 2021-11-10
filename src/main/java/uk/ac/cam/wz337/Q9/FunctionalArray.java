package uk.ac.cam.wz337.Q9;

public class FunctionalArray {
    /*
    assumptions:
    I would assume that the constructor that "creates a tree of a given
    size" n will create a list of zeros
    Assume that the tree size is fixed once set
    The internal representation is from 1 to n, not 0 to n-1
    */
    private BinaryTreeNode root;
    private final int size;


    public FunctionalArray(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("n must be positive");
        size = n;
        root = new BinaryTreeNode(0);

        for (int i=2; i<=n; i++) {
            BinaryTreeNode node = root;
            int t = i;
            while (t > 3) { // t=2 or t=3: there is no node underneath, we need to create one
                if (t % 2 == 0) {
                    node = node.getLeft();
                }
                else {
                    node = node.getRight();
                }
                t /= 2;
            }

            if (t == 3) {
                node.setRight(new BinaryTreeNode(0));
            }
            else {
                node.setLeft(new BinaryTreeNode(0));
            }
        }
    }

    public void set(int index, int value) {
        find_element(index);
        find_element(index).setValue(value);
    }

    public int get(int index) {
        find_element(index);
        BinaryTreeNode node;
        return find_element(index).getValue();
    }

    private BinaryTreeNode find_element(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("index out of bounds");
        int t = index + 1; // true index in tree
        BinaryTreeNode node = root;
        while (t > 1) {
            if (t % 2 == 0) {
                node = node.getLeft();
            }
            else {
                node = node.getRight();
            }
            t /= 2;
        }
        return node;
    }
}
