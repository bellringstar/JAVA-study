package com.example.datastructure.stack;

public class MyStack<T> implements IStack<T> {

    private int size;
    private Node head;

    public MyStack(){
        this.size = size();
        this.head = new Node(null); //더미 헤드 = top => head.next = 항상 top 데이터
    }

    @Override
    public void push(T data) {
        Node node = new Node(data, this.head.next);
        this.head.next = node;
        this.size++;
    }

    @Override
    public T pop() {
        Node curr = this.head.next;
        this.head.next = curr.next;
        curr.next = null; // 연결끊기
        this.size--;
        return curr.data;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
