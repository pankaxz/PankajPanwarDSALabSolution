package GreatLearning.LongestPathProblem.Driver;
import GreatLearning.LongestPathProblem.Services.DoubleNode;
import GreatLearning.LongestPathProblem.Services.LongestPath;

import java.util.ArrayList;

/**
 * Problem 2 : Print the longest path from the root to the leaf in a binary tree.
 */
public class Main {
    public static void main(String[] args) {
        LongestPath longestPath = new LongestPath();

        //Creating Tree nodes
        DoubleNode root = new DoubleNode( 100 );
        DoubleNode node1 = new DoubleNode( 20  );
        DoubleNode node2 = new DoubleNode( 130 );
        DoubleNode node3 = new DoubleNode( 10 );
        DoubleNode node4 = new DoubleNode( 50 );
        DoubleNode node5 = new DoubleNode( 110 );
        DoubleNode node6 = new DoubleNode( 140 );
        DoubleNode node7 = new DoubleNode( 5 );

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        node3.left = node7;

        ArrayList<Integer> path = longestPath.FindLongestPath( root );

        //Printing the elements of the longest path.
        System.out.print(" longest path is : ");
        for (int element : path) {
           System.out.print(element + " ");
        }
    }
}
