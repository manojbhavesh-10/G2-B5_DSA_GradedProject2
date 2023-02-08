package groupassignment_2.question2.driver;

import groupassignment_2.question2.service.ConvertToSkewedTree;
import groupassignment_2.question2.service.Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int order;

        ConvertToSkewedTree tree = new ConvertToSkewedTree();

        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);

//        System.out.println("Enter a number = 0 for increasing order or \nEnter a number = 1 for decreasing order ");
//        order = in.nextInt();

//        tree.inorder(tree.node);
//        System.out.println();

        order = 0;

        tree.bstIntoSkewedTree(tree.node, order);
        tree.traverse(tree.headNode);

    }
}
