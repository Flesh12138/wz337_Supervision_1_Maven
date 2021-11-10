package uk.ac.cam.wz337.Q9;

public class SearchSet {
    private int mElements;
    private BinaryTreeNode mHead;

    public SearchSet() {
        mElements = 0;
    }

    public void insert(int value, BinaryTreeNode currentNode) {
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
    }

}
