package com.assignment1.java;

import java.util.Stack;

public class ScrollStack {
    private Stack<String> stack;

    public ScrollStack() {
        stack = new Stack<>();
    }

    // Push a new scroll onto the stack
    public void pushScroll(String scroll) {
        stack.push(scroll);
    }

    // Pop the top scroll off the stack
    public String popScroll() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            return "No scrolls left to pop.";
        }
    }

    // Peek at the top scroll without removing it
    public String peekScroll() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return "No scrolls in the stack.";
        }
    }

    // Check if a specific scroll title exists in the stack
    public boolean containsScroll(String scroll) {
        return stack.contains(scroll);
    }
}
