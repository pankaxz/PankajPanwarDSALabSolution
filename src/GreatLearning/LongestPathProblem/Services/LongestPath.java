package GreatLearning.LongestPathProblem.Services;

import java.util.ArrayList;

public class LongestPath {
    /**
     * Find the longest path in a tree.
     * @param root : root node of the tree
     * @return : Array list of the longest path
     */
    public ArrayList<Integer> FindLongestPath(DoubleNode root) {
        if (root == null)
            return new ArrayList<>();
        //Array list for the right sub-tree.
        ArrayList<Integer> rightNode = FindLongestPath( root.right );

        //Array list for the left sub-tree.
        ArrayList<Integer> leftNode = FindLongestPath( root.left );

        if (rightNode.size() < leftNode.size()) {
            leftNode.add( root.data );
        }
        else {
            rightNode.add( root.data );
        }

        return leftNode.size() > rightNode.size() ? leftNode : rightNode;
    }
}