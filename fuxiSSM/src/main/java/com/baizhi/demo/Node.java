package com.baizhi.demo;

/**
 * create by LiangS
 * on 2017/10/24
 */
public class Node {
    Object value;
    Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(Object value) {

        this.value = value;
    }

    public Node() {

    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
