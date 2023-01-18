package com.hunterparcells.csi2310.work.bag.exception;

/**
 * The BagOverflowException is an exception that is thrown when a Bag class can no longer contain any more items. The
 * Bag class is used to store objects, and when the limit of items it can hold has been reached, this exception is
 * thrown to alert the user that the bag can no longer contain any more items and must be emptied before anymore can be
 * added. This prevents the user from adding too many items and potentially causing errors or crashing the program.
 *
 * @author Hunter Parcells
 */
public class BagOverflowException extends Exception {
    public BagOverflowException(Object item, int size) {
        super("Error when adding: " + item.toString() + ". Bag is full at size " + size + ", no new items can be added.");
    }
}
