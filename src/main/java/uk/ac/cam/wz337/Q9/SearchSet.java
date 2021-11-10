package uk.ac.cam.wz337.Q9;

public class SearchSet {
    private int mElements;
    private BinaryTreeNode mHead;

    public SearchSet() {
        mElements = 0;
        mHead = null;
    }

    private void insert(int value, BinaryTreeNode currentNode) {
        BinaryTreeNode downNode;
        if (value < currentNode.getValue()) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(new BinaryTreeNode(value));
            } else {
                insert(value, currentNode.getLeft());
            }
        } else if (value > currentNode.getValue()) {
            if (currentNode.getRight() == null) {
                currentNode.setRight(new BinaryTreeNode(value));
            } else {
                insert(value, currentNode.getRight());
            }
        }
        // otherwise, the element is the currentNode or does not exist in the tree
    }

    public void insert(int value) {
        if (mHead == null) {
            mHead = new BinaryTreeNode(value);
        } else {
            insert(value, mHead);
        }
        mElements++;
    }

    public int getNumberElements() {
        return mElements;
    }

    private boolean contains(int value, BinaryTreeNode currentNode) {
        if (currentNode == null) {
            return false;
        } else if (value == currentNode.getValue()) {
            return true;
        } else if (value < currentNode.getValue()) {
            return contains(value, currentNode.getLeft());
        } else {
            return contains(value, currentNode.getRight());
        }
    }

    public boolean contains(int value) {
        return contains(value, mHead);
    }

    public static void main(String[] args) {
        System.out.println("Testing SearchSet");
    }
}
