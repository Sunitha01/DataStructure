package com.ds;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        this.data = key;
        this.left = null;
        this.right = null;
    }

}

public class BinaryTree {
    Node root;
//    Preorder (Root, Left, Right)
    public void preOrder(Node n) {
        if (n == null) {
            return;
        }
        System.out.print(n.data + " ");
        preOrder(n.left);
        preOrder(n.right);
    }
//    Postorder (Left, Right,Root)
    public void postOrder(Node n){

        if (n == null){

            return ;
        }

        postOrder(n.left);

        postOrder(n.right);
        System.out.print(n.data + " ");


    }
    //    Inorder (Left,Root,Right)
    public void inOrder(Node n){

        if (n == null){

            return ;
        }

        inOrder(n.left);
        System.out.print(n.data + " ");
        inOrder(n.right);



    }






    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(4);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(7);
        System.out.println("preorder");
        tree.preOrder(tree.root);
        System.out.println("\n");
        System.out.println("postorder");
        tree.postOrder(tree.root);
        System.out.println("\n");
        System.out.println("Inorder");
        tree.inOrder(tree.root);


    }
}

//preorder root-left-right


