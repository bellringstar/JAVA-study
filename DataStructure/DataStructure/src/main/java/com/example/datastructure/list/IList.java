package com.example.datastructure.list;

public interface IList<T> {

    void add(T t);

    void insert(int index, T t);

    void clear();

    boolean delete(T t);

    boolean deleteByIndex(int index);

    T get(int index);

    int indexOf(T t);

    boolean inEmpty();

    boolean contains(T t);

    int size();


}
