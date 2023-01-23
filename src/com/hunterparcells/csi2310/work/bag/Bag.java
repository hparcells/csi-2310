package com.hunterparcells.csi2310.work.bag;

import com.hunterparcells.csi2310.work.bag.exception.BagOverflowException;

import java.util.ArrayList;

class Bag implements IBag {
    private final int size;
    private ArrayList<Object> bag;

    public Bag(int size) {
        this.size = size;
        this.bag = new ArrayList<>();
    }

    public void add(Object item) {
        try {
            if(this.length() == this.size) {
                throw new BagOverflowException(item, this.size);
            }
            bag.add(item);
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void remove(Object item) {
        bag.remove(item);
    }

    public boolean contains(Object item) {
        return bag.contains(item);
    }

    public int length() {
        return bag.size();
    }

    public boolean isEmpty() {
        return this.length() == 0;
    }

    public void clear() {
        this.bag = new ArrayList<>();
    }

    /**
     * Returns the contents of the bag in an ArrayList.
     *
     * @return The contents of the bag.
     */
    public ArrayList<Object> getBag() {
        return this.bag;
    }
}
