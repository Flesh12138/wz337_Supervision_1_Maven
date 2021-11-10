package uk.ac.cam.wz337.Q9;

public class BinaryTreeNode {
    private int mValue;
    private BinaryTreeNode mLeft;
    private BinaryTreeNode mRight;

    public BinaryTreeNode(int value) {
        mValue = value;
    }

    public int getValue() {
        return mValue;
    }

    public void setValue(int value) {
        mValue = value;
    }

    public BinaryTreeNode getLeft() {
        return mLeft;
    }

    public void setLeft(BinaryTreeNode left) {
        mLeft = left;
    }

    public BinaryTreeNode getRight() {
        return mRight;
    }

    public void setRight(BinaryTreeNode right) {
        mRight = right;
    }
}
