package com.anu.game.JZ20;

import java.util.Stack;

public class Solution {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();



    public void push(int node) {
        data.push(node);
        if (min.isEmpty()) {
            min.push(node);
        } else {
            min.push(node <= min.peek()? node : min.peek());
        }

    }

    public void pop() {
        data.pop();
        min.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}
