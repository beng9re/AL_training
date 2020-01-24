package LeetCode;

import java.util.Random;

public class SuffleToArray {

    /*
    *
    * // Init an array with set 1, 2, and 3.
    int[] nums = {1,2,3};
    Solution solution = new Solution(nums);

    // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
    solution.shuffle();

    // Resets the array back to its original configuration [1,2,3].
    solution.reset();

    // Returns the random shuffling of array [1,2,3].
    solution.shuffle();
    *
    * */
    int [] oringinArray;
    int [] currentArray;


    SuffleToArray(int nums[]){
        this.oringinArray = nums.clone();
        this.currentArray = this.oringinArray;

    }

    private int randRange(int min, int max) {

        return new Random()
                .nextInt(max - min) + min;
    }
    private void swap(int i, int j) {
        int temp = currentArray[i];
        currentArray[i] = currentArray[j];
        currentArray[j] = temp;
    }


    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        this.currentArray = this.oringinArray.clone();
        return this.currentArray;
    }



    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = 0; i < currentArray.length; i++) {
            swap(i, randRange(i, currentArray.length));
        }
        return currentArray;
    }
    public void printVlaue(int[] arr){
        for (int value: arr) {
            System.out.print(value + " ");

        }
        System.out.println();

    }


    public static void main(String args[]){

        SuffleToArray suffleToArray = new SuffleToArray(new int[]{1,2,3});
        suffleToArray.printVlaue(suffleToArray.reset());
        suffleToArray.printVlaue(suffleToArray.shuffle());
        suffleToArray.printVlaue(suffleToArray.reset());
        suffleToArray.printVlaue(suffleToArray.shuffle());


    }


}
