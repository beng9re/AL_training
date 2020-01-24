import java.util.HashMap;
import java.util.Objects;

public class HashTestClass {


        public String solution(String[] participant, String[] completion) {
            String answer = "";


            HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
            HashMap<Integer,Boolean> ck = new HashMap<Integer, Boolean>();


            for (int i =0; i < participant.length ; i++) {
                for(int j=0 ; j<completion.length; j++){
                    if(participant[i].equals(completion[j]) && Objects.isNull(ck.get(j)) ){
                        ck.put(i,true);
                        break;
                    }else if(!participant[i].equals(completion[j]) && Objects.isNull(ck.get(j))){
                        answer = participant[i];
                    }
                }
            }

            return  answer;

        }






    public static void main(String []  arg) {
        HashTestClass hs =new HashTestClass();
        String [] testI1 = {"leo", "kiki", "eden"};
        String [] test1_1 = {"eden", "kiki"};	                        //retult : leo
        String [] testI2  =  {"marina", "josipa", "nikola", "vinko", "filipa"};
        String [] testI_2 ={"josipa", "filipa", "marina", "nikola"} ; //result :	vinko
        String [] testI3  = {"mislav", "stanko", "mislav", "ana" };
        String [] testI_3 ={"stanko", "ana", "mislav"};             // result : stanko


        System.out.println(hs.solution(testI1,test1_1));
        System.out.println(hs.solution(testI2,testI_2));
        System.out.println(hs.solution(testI3,testI_3));





    }
}


