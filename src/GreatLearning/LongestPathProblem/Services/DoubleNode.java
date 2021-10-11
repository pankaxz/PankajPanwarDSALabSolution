package GreatLearning.LongestPathProblem.Services;

/**
 * A node class for binary trees.
 */
public class DoubleNode {
    public int data;
    public DoubleNode left;
    public DoubleNode right;

    /**
     * Constructor
     * @param data : Value of the node
     * Left node and right node points to null by default
     */
    public DoubleNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}