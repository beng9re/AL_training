import java.util.HashMap;


public class HashTest1 {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String,Integer> temp =new HashMap<String,Integer>();
        for (String phoneNum: phone_book) {
            temp.put(phoneNum,phoneNum.length());
        }

        for (int i = 0;i < phone_book.length;i++){
            String key = phone_book[i];
            for (int j = 0; j < phone_book.length;j++){
                if(vailCK(key,phone_book[j],temp)){
                    return false;
                }
            }
        }
        return answer;

    }

    public static boolean vailCK (String key,String arrayVal,HashMap<String,Integer> map){
        if(arrayVal.length() >= map.get(key)
                && !key.equals(arrayVal)
                && key.equals(arrayVal.substring(0,map.get(key)))){
            return true;
        }else{
            return false;
        }

    }

/*
    public static void main(String[] args) {


        String case1 [] = {"11","22","33","44"};
        String case2 [] = {"119", "97674223", "1195524421"};
        String case3 [] = {"12","123","1235","567","88"};
        String case4 [] = {"123","456","789"};





        System.out.println(solution(case1));
        System.out.println(solution(case2));
        System.out.println(solution(case3));
        System.out.println(solution(case4));







    }
    */
}
