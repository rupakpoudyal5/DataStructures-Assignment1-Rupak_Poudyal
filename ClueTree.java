package com.assignment1.java;
public class ClueTree {
    private Node root;

    private class Node {
        String clue;
        Node left, right;

        Node(String clue) {
            this.clue = clue;
            left = right = null;
        }
    }

    // Insert a new clue
    public void insertClue(String clue) {
        root = insertRecursive(root, clue);
    }

    private Node insertRecursive(Node root, String clue) {
        if (root == null) {
            return new Node(clue);
        }
        if (clue.compareTo(root.clue) < 0) {
            root.left = insertRecursive(root.left, clue);
        } else if (clue.compareTo(root.clue) > 0) {
            root.right = insertRecursive(root.right, clue);
        }
        return root;
    }

    // Perform in-order traversal
    public void inOrderTraversal() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.clue + " ");
            inOrderRecursive(root.right);
        }
    }

    // Perform pre-order traversal
    public void preOrderTraversal() {
        preOrderRecursive(root);
    }

    private void preOrderRecursive(Node root) {
        if (root != null) {
            System.out.print(root.clue + " ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    // Perform post-order traversal
    public void postOrderTraversal() {
        postOrderRecursive(root);
    }

    private void postOrderRecursive(Node root) {
        if (root != null) {
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.clue + " ");
        }
    }

    // Find a specific clue
    public boolean findClue(String clue) {
        return findRecursive(root, clue);
    }

    private boolean findRecursive(Node root, String clue) {
        if (root == null) {
            return false;
        }
        if (clue.equals(root.clue)) {
            return true;
        }
        if (clue.compareTo(root.clue) < 0) {
            return findRecursive(root.left, clue);
        } else {
            return findRecursive(root.right, clue);
        }
    }

    // Count the total number of clues
    public int countClues() {
        return countRecursive(root);
    }

    private int countRecursive(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + countRecursive(root.left) + countRecursive(root.right);
        }
    }
}
