package com.assignment1.java;
public class LabyrinthPath {
    private Node head;

    private class Node {
        String location;
        Node next;

        Node(String location) {
            this.location = location;
            this.next = null;
        }
    }

    // Add a new location to the path
    public void addLocation(String location) {
        Node newNode = new Node(location);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Remove the last visited location
    public void removeLastLocation() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Check if the path contains a loop (trap)
    public boolean hasLoop() {
        if (head == null) return false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;  // Loop detected
            }
        }
        return false;
    }

    // Print the entire path
    public void printPath() {
        Node current = head;
        while (current != null) {
            System.out.print(current.location + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }
}
