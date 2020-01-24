package LeetCode;

import java.util.Arrays;

public class The_Sume {

    /*
    *
    * Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].
    *
    * */
    public int[] twoSum(int[] nums, int target) {
        int[] answer = {};

        for (int i =0;i < nums.length;i++){
            for(int j = i+1; j<nums.length ; j++){
                if(nums[i]+nums[j] == target){
                    answer = new int[]{i,j};
                    return answer;
                }
            }
        }
        return answer;
    }

    public int[] bastPratict(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");


    }


    public void test(){
        int [] testCase1 = {2,7,11,5};
        int target1 = 9;
        int [] testCase2 = {3,2,4};
        int taget2 = 6;



        if(Arrays.equals(twoSum(testCase1,target1),new int[]{0,1})
            && Arrays.equals(twoSum(testCase2,taget2),new int[]{1,2})
        ){
            System.out.println("Test Suc");
        }else{

            System.out.println(twoSum(testCase1,target1));
            System.out.println(twoSum(testCase2,taget2));
            System.out.println("fail");
        }



    }




}
