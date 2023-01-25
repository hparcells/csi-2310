package com.hunterparcells.csi2310.work.bag;

import com.hunterparcells.csi2310.work.bag.exception.BagOverflowException;

/**
 * Interface for a Bag of objects.
 *
 * @author Hunter Parcells
 */
public interface IBag {
    /**
     * Adds an item to the bag.
     *
     * @param item The item to add to the bag.
     *
     * @throws BagOverflowException If the bag is full.
     */
    void add(Object item) throws BagOverflowException;

    /**
     * Removes an item from the bag.
     *
     * @param item The item to remove.
     */
    void remove(Object item);

    /**
     * Checks if an item exists in the bag.
     *
     * @param item The item to check for.
     *
     * @return Whether the item exists in the bag.
     */
    boolean contains(Object item);

    /**
     * The current size of the bag.
     *
     * @return The number of items in the bag.
     */
    int length();

    /**
     * Counts the occurrences of an item in the bag.
     *
     * @param search The item to search for.
     *
     * @return The number of occurrences of the item in the bag.
     */
    int count(Object search);

    /**
     * Checks if the bag is empty.
     *
     * @return Whether the bag is empty.
     */
    boolean isEmpty();

    /**
     * Checks if the bag is full.
     *
     * @return Whether the bag is full.
     */
    boolean isFull();

    /**
     * Empties the bag.
     */
    void clear();
}
