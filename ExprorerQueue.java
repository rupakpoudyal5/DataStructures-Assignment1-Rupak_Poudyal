package com.assignment1.java;

public class ExprorerQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public ExprorerQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new String[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Enqueue new explorers
    public void enqueue(String explorer) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = explorer;
            size++;
        }
    }

    // Dequeue explorers when they enter the temple
    public String dequeue() {
        if (isEmpty()) {
            return "Queue is empty!";
        } else {
            String explorer = queue[front];
            front = (front + 1) % capacity;
            size--;
            return explorer + " entered the temple.";
        }
    }

    // Display the next explorer in line
    public String nextExplorer() {
        if (isEmpty()) {
            return "Queue is empty!";
        } else {
            return "Next explorer: " + queue[front];
        }
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }
}

