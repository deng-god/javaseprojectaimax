package com.mayuan.demo3genericty;

public interface Data<T> {
    void add(T t);
    void delete(T t);
    void update(T t);
    T query(int id);
}
