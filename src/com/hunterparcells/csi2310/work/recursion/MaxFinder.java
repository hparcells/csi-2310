package com.hunterparcells.csi2310.work.recursion;

public class MaxFinder {

    private int[] D;
    private int size;
    private int indexOfAvailableLocation;

    public MaxFinder(int size) {
        D = new int[size];
        this.size = size;
        indexOfAvailableLocation = 0;
    }


    public int findMax(int leftIndex, int rightIndex) {
        int midPoint, leftMax, rightMax, finalMax = 0;

        // BASE CASE
        if(leftIndex == rightIndex)
            finalMax = D[leftIndex];
        else { // <---------- RECURSIVE CASE
            midPoint = (rightIndex - leftIndex) / 2;

            leftMax = findMax(leftIndex, midPoint + leftIndex);
            rightMax = findMax(leftIndex + midPoint + 1, rightIndex);

            if(leftMax < rightMax)
                finalMax = rightMax;
            else
                finalMax = leftMax;
        }

        return finalMax;
    }


    public void insertInt(int newData) {
        if(indexOfAvailableLocation < size) {
            D[indexOfAvailableLocation] = newData;
            indexOfAvailableLocation++;
        }
    }

}
