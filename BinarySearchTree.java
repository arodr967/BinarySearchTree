/*
File name: BinarySearchTree.java
Implemetation of a Binary Search Tree.
 */
package binarysearchtree;
//*********PROPERTY OF ALICIA RODRIGUEZ**********
public class BinarySearchTree<AnyType extends Comparable<AnyType>> {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    //Instance variable
    BinaryNode<AnyType> root;

    //Constructor
    public BinarySearchTree() {
        root = null;
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Insert AnyType input in the binary search tree.
     *
     * @param input
     */
    public void insert(AnyType input) {
        root = insert(input, root);
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Recursively insert a BinaryNode in it's corresponding place. If the node
     * is less than the root, or parent node, then it goes to the left. If the
     * node is greater than the root, or parent node, then it goes to the right.
     *
     * @param input any type of input
     * @param tree BST
     * @return the inserted node in it's corresponding place
     */
    private BinaryNode<AnyType> insert(AnyType input, BinaryNode<AnyType> tree) {
        if (tree == null) {
            return new BinaryNode<>(input, null, null);
        }
        int compare = input.compareTo(tree.data);

        if (compare < 0) {
            tree.left = insert(input, tree.left);
        } else if (compare > 0) {
            tree.right = insert(input, tree.right);
        }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        return tree;
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Prints the binary search tree.
     */
    public void printTree() {
        if (root == null) {
            System.out.println("Empty tree.");
        } else {
            printTree(root);
        }
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Recursively print the binary search tree.
     *
     * @param tree BST
     */
    private void printTree(BinaryNode<AnyType> tree) {
        if (tree != null) {
            printTree(tree.left);
            System.out.println(" " + tree.data);
            printTree(tree.right);
        }
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Method which takes as input a binary search tree, T, and two keys k1 and
     * k2, which are ordered so that k1 ≤ k2, and prints all elements X in the
     * tree such that k1 ≤ Key(X) ≤ k2. This method runs in O(K + logN) average
     * time, where K is the number of keys printed.
     *
     * @param lower the lower bound
     * @param upper the upper bound
     * @param tree
     */
    public void printRange(Comparable lower, Comparable upper,
            BinaryNode tree) {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        if (tree != null) {
            if (lower.compareTo(tree.data) < 0) {
                printRange(lower, upper, tree.left);
            }
            if (lower.compareTo(tree.data) <= 0
                    && tree.data.compareTo(upper) <= 0) {
                System.out.println(tree.data);
            }
            if (tree.data.compareTo(upper) <= 0) {
                printRange(lower, upper, tree.right);
            }
        }
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * BinaryNode class which implements a binary node with left and right
     * pointers.
     *
     * @author Alicia Rodriguez
     * @param <AnyType> AnyType of elements allowed
     */
    private class BinaryNode<AnyType extends Comparable> {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        //Instance varibles
        AnyType data;
        BinaryNode<AnyType> left;
        BinaryNode<AnyType> right;

        //Constructors   
        BinaryNode(AnyType data, BinaryNode<AnyType> left,
                BinaryNode<AnyType> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        BinaryNode(AnyType data) {
            this(data, null, null);
        }
    } //end of BinaryNode class definition
}// end of BinarySearchTree class definition
//*********PROPERTY OF ALICIA RODRIGUEZ**********
