package com.mayuan.demo2genericity;

import java.lang.invoke.CallSite;
import java.util.ArrayList;

public class MyArrayList<E> {
    private ArrayList list = new ArrayList();

    public boolean add(E e)
    {
        list.add(e);
        return true;
    }

    public boolean  remove(E e)
    {
        return list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
