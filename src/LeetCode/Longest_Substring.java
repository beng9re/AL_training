package LeetCode;

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
        int max = 0;

        for (int i =0;i<s.length();i++) {
            int su = smallSubString(i,s);
            max = su > max ? su : max;

        }

        return max;
    }

    public int smallSubString(int start,String s){
        Set<Character> set = new HashSet<>();
        for(int i =start; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }else{
                break;
            }
        }
        return set.size();
    }
    //abcabcbb // 음 슬라이드 윈도우 교차하면서 지워준
    public int slideWidnow(String s){
        Set<Character> set = new HashSet<>();
        int index =0,j = 0;
        int ans =0;
        while (index < s.length() && j <s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans,j-index);

            } else {
                set.remove(s.charAt(index++));
            }
        }
        return ans;

    }




    public void test () {
        Map<String,Integer> testCase = new HashMap<String,Integer>();
        testCase.put("abcabcbb",3);
        testCase.put("bbbbb",1);
        testCase.put("pwwkew",3);

        System.out.println(slideWidnow("abcabcbb"));

        testCase.forEach((key,value)->{
            if(lengthOfLongestSubstring(key)==value){
                System.out.println("Test Success");
            }else{
                System.out.println("TestCase Falie : key '"+key + "' Value : "+value);
            }

        });

    };



}
