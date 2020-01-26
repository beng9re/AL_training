package LeetCode;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Longest_Substring {
    /*문자열이 지정되면 문자를 반복하지 않고 가장 긴 하위 문자열의 길이를 찾으십시오.
    * Given a string, find the length of the longest substring without repeating characters.
    *
    *
    *  Example 1:
    *
    *   Input: "abcabcbb"
    *   Output: 3
    *   Explanation: The answer is "abc", with the length of 3.
    *   Example 2:
    *
    *   Input: "bbbbb"
    *   Output: 1
    *   Explanation: The answer is "b", with the length of 1.
    *   Example 3:
    *
    *   Input: "pwwkew"
    *   Output: 3
    *   Explanation: The answer is "wke", with the length of 3.
    *                Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
    *       *
    * */


    public int lengthOfLongestSubstring(String s) {

        /*
          System.out.println(s.substring(0,1));
          System.out.println(s.substring(1,2));
          System.out.println(s.substring(2,3));
          System.out.println(s.substring(3,4));
          System.out.println(s.substring(4,5));

          System.out.println(s.substring(4,5));
          System.out.println(s.substring(4,5));
          System.out.println(s.substring(4,5));
        */
        Set<String> set = new HashSet<>();

        for(int i =0; i < s.length(); i++){
            Character ch = s.charAt(i);
            System.out.println(ch);
        }
        return 1;
    }


    public void test () {
        Map<String,Integer> testCase = new HashMap<String,Integer>();
        testCase.put("abcabcbb",3);
        testCase.put("bbbbb",1);
        testCase.put("pwwkew",3);

        testCase.forEach((key,value)->{
            if(lengthOfLongestSubstring(key)==value){
                System.out.println("Test Success");
            }else{
                System.out.println("TestCase Falie : key '"+key + "' Value : "+value);
            }

        });

    };



}
