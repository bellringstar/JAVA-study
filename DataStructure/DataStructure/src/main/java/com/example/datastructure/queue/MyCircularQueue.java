package com.example.datastructure.queue;

public class MyCircularQueue<T> implements IQueue<T>{

    private T[] elements;
    private int front;
    private int rear;
    private int maxsize;

    public MyCircularQueue(int size){
        this.elements = (T[]) new Object[size+1]; //dummy공간 1칸
        this.front = 0;
        this.rear = 0;
        this.maxsize = size+1;
    }

    @Override
    public void offer(T data) {
        //enqueue
        if ( this.isFull() ){
            throw new IllegalStateException();
        }

        this.rear = (this.rear + 1)%this.maxsize;
        this.elements[this.rear] = data;
    }

    @Override
    public T poll() {
        //dequeue
        if (this.isEmpty()){
            throw new IllegalStateException();
        }
        this.front = (this.front+1) % maxsize;
        return this.elements[this.front];
    }

    @Override
    public T peek() {
        if (this.isEmpty()){
            throw new IllegalStateException();
        }
        return this.elements[this.front+1];
    }

    @Override
    public int size() {
        if (this.front <= this.rear){
            return this.rear - this.front;
        }
        return this.maxsize - this.front + this.rear;
    }

    @Override
    public void clear() {
        this.front = 0;
        this.rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.front == this.rear;
    }

    private boolean isFull() {
        return ( this.rear + 1 ) % this.maxsize == this.front;
    }
}
