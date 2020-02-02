package programers;

import java.util.ArrayList;
import java.util.Arrays;

public class TagetNumber {
    /*
    * 사용할 수 있는 숫자가 담긴 배열 numbers,
    * 타겟 넘버 target이 매개변수로 주어질 때
    * 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
    *
    * */


    public int solution(int[] numbers, int target) {
        int anser =0;
        anser = dfs(numbers,0,0,target);

        return anser;
    }

    private int dfs(int[] numbers, int node, int sum, int target){
        //Node 노드 값 sum 합계

        if(node == numbers.length){
            if(sum==target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, node+1, sum + numbers[node], target)
                + dfs(numbers, node+1, sum - numbers[node], target);
    }



    void test (){
        System.out.println(solution(new int[]{1, 1, 1, 1, 1},3)
        );
    }



}
