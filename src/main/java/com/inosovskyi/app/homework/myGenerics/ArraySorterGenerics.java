package com.inosovskyi.app.homework.myGenerics;


import java.util.Comparator;

public class ArraySorterGenerics<T extends Number> implements Comparator<T> {
    private T[] arraySortGenerics;

    public ArraySorterGenerics(T[] arraySortGenerics) {
        this.arraySortGenerics = arraySortGenerics;
    }

    public T[] sort() {

        return null;
    }

    @Override
    public int compare(T o1, T o2) {
        if (o1 < o2) {
            return -1;
        }
        else if (o1 > o2) {

        }
        return 0;
    }
}

