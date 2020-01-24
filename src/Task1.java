import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Task1 {


    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int index = 0;
        List <Integer> que = new ArrayList<Integer>();

        for(int i = 0 ; i<prices.length;i++){
            for(int j=i; j<prices.length;j++){
                if(prices[i] <= prices[j]){
                    que.add(prices[i]);
                }else{
                    break;
                }
            }
        }


        for(int i =0;i< prices.length;i++){
            int count=0;
           for(int j=0;j<prices.length;j++){
               if(prices[i]==que.get(j)){
                   count++;
               }
           }
           answer[i]=count;
        }


        return answer;

    }





    public static void main(String[] arg){
        int prices[]={498,501,470,489};
        System.out.println("result : "+ solution(prices)[0]);

        System.out.println("testCall");
    }






}
