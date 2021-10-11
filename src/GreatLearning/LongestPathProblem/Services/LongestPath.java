package GreatLearning.LongestPathProblem.Services;

import java.util.ArrayList;

public class LongestPath {
    /**
     * Find the longest path in a tree.
     * @param root : root node of the tree
     * @return : Array list of the longest path
     */
    public ArrayList<Integer> FindLongestPath(DoubleNode root) {

        //if tree is empty, return an empty array.
        if (root == null) {
            return new ArrayList<>();
        }

        //Array for the right sub-tree.
        ArrayList<Integer> rightNode = FindLongestPath( root.right );

        //Array for the left sub-tree.
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