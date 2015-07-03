/*
File name: BinarySearchTreeTester.java
 */
//*********PROPERTY OF ALICIA RODRIGUEZ**********
package binarysearchtreetester;
//*********PROPERTY OF ALICIA RODRIGUEZ**********
public class BinarySearchTreeTester //*********PROPERTY OF ALICIA RODRIGUEZ**********
{
    /**
     * Tester of the BinarySearchTree class.
     * @param args 
     */
    public static void main(String[] args) //*********PROPERTY OF ALICIA RODRIGUEZ**********
    {
       //Testing the printRange method
       BinarySearchTree<Integer> intBST = new BinarySearchTree<>();
       //*********PROPERTY OF ALICIA RODRIGUEZ**********
       System.out.println("My Binary Search Tree of Integers: ");
       intBST.insert(6);
       intBST.insert(8);
       intBST.insert(9);
       intBST.insert(10);
       intBST.insert(5);
       intBST.insert(3);
       intBST.insert(7);
       intBST.insert(11);
       intBST.insert(12);
       intBST.insert(20);
       intBST.insert(18);
       intBST.insert(1);
       
       intBST.printTree();
       //*********PROPERTY OF ALICIA RODRIGUEZ**********
       System.out.println("Print the numbers between 4 and 15: ");
       intBST.printRange(4, 15, intBST.root);
       //*********PROPERTY OF ALICIA RODRIGUEZ**********
       System.out.println("");
       //*********PROPERTY OF ALICIA RODRIGUEZ**********
       BinarySearchTree<String> stringBST = new BinarySearchTree<>();
       //*********PROPERTY OF ALICIA RODRIGUEZ**********
       //Names of family and friends
       System.out.println("My Binary Search Tree of Strings: ");
       stringBST.insert("Alicia");
       stringBST.insert("Paola");
       stringBST.insert("Joshua");
       stringBST.insert("Emily");
       stringBST.insert("Melanie");
       stringBST.insert("Mavis");
       stringBST.insert("Yoisel");
       stringBST.insert("Fernando");
       stringBST.insert("Edwardo");
       stringBST.insert("Margarita");
       stringBST.insert("Luna");
       stringBST.insert("Hercules");
       //*********PROPERTY OF ALICIA RODRIGUEZ**********
       stringBST.printTree();
       //*********PROPERTY OF ALICIA RODRIGUEZ**********
       System.out.println("Print the names between B and L: ");
       stringBST.printRange("B", "L", stringBST.root);
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
    //*********PROPERTY OF ALICIA RODRIGUEZ**********
}//end of BinarySearchTreeTester class definition
