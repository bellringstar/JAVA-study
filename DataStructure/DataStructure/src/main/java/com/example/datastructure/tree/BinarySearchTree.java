package com.example.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements ITree<T>{

    private Node root;
    private int size;

    public BinarySearchTree() {
        this.size = 0;
    }

    @Override
    public void insert(T val) {
        this.root = insertNode(root, val);
        size++;
    }

    private Node insertNode(Node node, T val){
        if (node == null){
            return new Node(val);
        }
        //compatreTo 두개의 값을 비교해 int로 반환 : 숫자비교 -> 크다(1), 작다(-1), 같다(0)
        if (val.compareTo(node.data) < 0) {
            node.left = insertNode(node.left, val);
        } else if (val.compareTo(node.data) > 0) {
            node.right = insertNode(node.right, val);
        }

        return node;
    }

    @Override
    public void delete(T val) {
        deleteNode(root, val);
    }

    private Node deleteNode(Node node, T val){
        if (node == null){
            return null;
        }

        if (val.compareTo(node.data) < 0) {
            node.left = deleteNode(node.left, val);
        } else if (val.compareTo(node.data) > 0){
            node.right = deleteNode(node.right, val);
        } else {
            this.size--;
            if (node.left == null){
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.data = minNode(node.right);
            node.right = deleteNode(node.right, node.data);
        }
        return node;
    }

    @Override
    public boolean contains(T val) {
        return containsNode(root, val);
    }

    private boolean containsNode(Node node, T val) {
        if (node == null) {
            return false;
        }

        if (val.compareTo(node.data) == 0) {
            return true;
        }

        if (val.compareTo(node.data) < 0){
            return containsNode(node.left, val);
        }

        return containsNode(node.right, val);
    }

    @Override
    public int size() {
        return this.size;
    }

    public List<T> preOrder(){
        return this.preorderTree(root, new ArrayList<>());
    }

    private List<T> preorderTree(Node node, List<T> visited) {
        if (node == null) { return visited; }
        visited.add(node.data);
        preorderTree(node.left, visited);
        preorderTree(node.right, visited);

        return visited;
    }

    public List<T> inOrder() {
        return this.inorderTree(root, new ArrayList<>());
    }

    private List<T> inorderTree(Node node, List<T> visited){
        if(node==null) { return visited; }
        inorderTree(node.left, visited);
        visited.add(node.data);
        inorderTree(node.right, visited);
        return visited;
    }

    public List<T> postOrder() {
        return this.postorderTree(root, new ArrayList<>());
    }

    private List<T> postorderTree(Node node, List<T> visited){
        if(node==null) { return visited; }
        postorderTree(node.left, visited);
        postorderTree(node.right, visited);
        visited.add(node.data);
        return visited;
    }








    public T min() { return this.minNode(this.root); }
    public T max() { return this.maxNode(this.root); }

    private T minNode(Node node){
        T minData = node.data;
        while (node.left != null) {
            minData = node.left.data;
            node = node.left;
        }
        return minData;
    }

    private T maxNode(Node node){
        T maxData = node.data;
        while (node.right != null) {
            maxData = node.right.data;
            node = node.right;
        }
        return maxData;
    }

    private class Node{
        T data;
        Node left;
        Node right;

        Node(T data){ this.data = data;}

        Node(T data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
