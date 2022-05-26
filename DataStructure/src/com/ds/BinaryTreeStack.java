package com.ds;


import java.util.Stack;

public class BinaryTreeStack  {
    Stack<Node> s = new Stack<>();
    Node current;

    public void inOrder(Node root){
        if (root == null){
            return;
        }
        current = root;
        while(current!= null || s.size()!= 0){
            while(current!=null){
                s.push(current);
                current = current.left;

            }
            current = s.pop();
            System.out.print(current.data + " ");
            current = current.right;


        }

    }
    public static void main(String args[]){
        BinaryTree b = new BinaryTree();
        BinaryTreeStack c = new BinaryTreeStack();
        b.root = new Node(1);
        b.root.left = new Node(2);
        b.root.right = new Node(3);
        b.root.left.left = new Node(4);
        b.root.left.right = new Node(5);
        c.inOrder(b.root);

    }

}
