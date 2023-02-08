package groupassignment_2.question2.service;

public class ConvertToSkewedTree {

    public Node node;
    public Node headNode = null;
    Node prevNode = null;

    public void bstIntoSkewedTree(Node root, int order) {

        if(root == null) {
            return;
        }

        if(order > 0) {
            bstIntoSkewedTree(root.right, order);
        } else {
            bstIntoSkewedTree(root.left, order);
        }

        Node rightNode = root.right;
        Node leftNode = root.left;

        if(headNode == null) {
            headNode = root;
            root.left = null;
            prevNode = root;
        } else {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }

        if(order > 0) {
            bstIntoSkewedTree(leftNode, order);
        } else {
            bstIntoSkewedTree(rightNode, order);
        }
    }

    public void traverse(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        traverse(root.right);
    }

    public void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);

    }
}
