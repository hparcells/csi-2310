package com.hunterparcells.csi2310.work.bag;

public interface IBag {
    void add(Object item);

    void remove(Object item);

    boolean contains(Object item);

    int length();

    boolean isEmpty();

    void clear();
}
