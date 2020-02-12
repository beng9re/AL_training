package programers;

import java.util.*;

public class HashColoth {
    /* 각의상의 조합수
    *
    *  [[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]] this return 5
    *
    *
    *
    * */


    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, List<String>> hash = new HashMap<String, List<String>>();

        for (String [] item : clothes){
            String key = item[1];
            String value = item[0];

            if(hash.containsKey(key)){
                hash.get(key).add(value);
            }else{
                List<String> arr = new ArrayList<String>();
                arr.add(value);
                hash.put(key,arr);
            }
        }

        for (String itmekey : hash.keySet()){
            answer *= hash.get(itmekey).size()+1;
        }



        return answer -1 ; // 안입을 경우를 제외 해야함
    }



    public void test(){
        String [][] arr1 =  {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
















        System.out.println(solution(arr1));

        //System.out.println((solution());


    }




}
