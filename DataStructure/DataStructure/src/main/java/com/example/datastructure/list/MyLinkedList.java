package com.example.datastructure.list;

public class MyLinkedList<T> implements IList<T>{

    private int size;
    private Node head;
    public MyLinkedList(){
        this.size = 0;
        this.head = new Node(null); // dummy head node
    }
    @Override
    public void add(T t) {
        Node curr = this.head; //헤드부터 시작
        while(curr.next != null){
            curr = curr.next; //헤드에서 다음이 null을 가리키는 지점까지 이동 == 끝부붙 까지
        }
        Node node = new Node(t); //데이터가 들어있는 node 생성
        curr.next = node; // 끝 부분의 다음이 생성한 node를 가리키게 만듬
        this.size++;
    }

    @Override
    public void insert(int index, T t) {
        if (index > this.size || index < 0){
            throw  new IndexOutOfBoundsException();
        }
        Node prev = this.head; //이전 노드를 헤드로 지정
        Node curr = prev.next; //현재 노드를 헤드의 다음 것으로 지정

        int i = 0;
        while (i++<index){
            //삽일 할 인덱스 위치 까지 이동
            prev=prev.next;
            curr=curr.next;
        }
        // prev -> curr
        Node node = new Node(t, curr); //curr을 가리키고 t를 갖고있는 노드 생성
        prev.next = node; // prev와 curr 사이에 삽입 = prev -> node -> curr
        this.size++;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.head.next = null; //연결을 끊어버린다.
    }

    @Override
    public boolean delete(T t) {
        Node prev = this.head; //항상 헤드부터 시작
        Node curr = prev.next;
        while (curr != null){ //linked list의 끝까지 반복
            if(curr.data.equals(t)){ // 만약 현재 위치가 삭제하고자 하는 데이터의 위치다
                prev.next = curr.next; // prev -> curr -> curr.next => prev -> curr.next
                curr.next = null; // 지우고자 하는 curr은 더 이상 가리키는게 없어진다.
                this.size--;
                return true;
            }
            prev = prev.next;
            curr = curr.next;
        }
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        Node prev = this.head;
        Node curr = prev.next;
        if (index >= this.size || index < 0){
            throw  new IndexOutOfBoundsException();
        }
        int i = 0;
        while(i++ < index){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = curr.next;
        curr.next = null;
        this.size--;
        return true;

    }

    @Override
    public T get(int index) {
        if (index >= this.size || index < 0){
            throw  new IndexOutOfBoundsException();
        }
        Node curr = this.head.next; //prev 노드는 필요없다 prev 노드를 썼던건 연결 관계를 수정하기 위해
        // head의 경우 더미노드이니 다음것부터 시작
        int i = 0;
        while (i++<index){
            curr = curr.next;
        }
        return curr.data;
    }

    @Override
    public int indexOf(T t) {
        Node curr = this.head.next;
        int index = 0;
        while (curr != null){
            if(t.equals(curr.data)){
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean inEmpty() {
        return this.head.next == null;
    }

    @Override
    public boolean contains(T t) {
        Node curr = this.head.next;
        while (curr != null){
            if (t.equals(curr.data)){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
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
