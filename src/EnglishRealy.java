public class EnglishRealy {

    public static void main(String[] args) {

        EnglishRealy eng = new EnglishRealy();


        String case1[]  ={"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        String flontString = "";
        int falseIndex  = -1;

        for (int i = 1; i < case1.length ; i++) {
            flontString = case1[i-1];
            if(!eng.lastCarecter(flontString).equals(eng.startCharecter(case1[i]))
                                            || eng.listChacker(case1,case1[i],i)){

                falseIndex = i + 1;
                break;
            }
        }

        if(falseIndex == -1){
            System.out.println(0 + ":"+ 0 );
        }else{
            System.out.println("index :" + falseIndex / 3 + "numberchaker:" + falseIndex%3);
        }


        System.out.println(eng.lastCarecter("testa"));
        System.out.println(eng.startCharecter("testa"));



        System.out.println("test");

    }

    public static boolean  listChacker(String[] list,String input,int index){
        for (int i = 0; i< index ; i++) {
            if(input.equals(list[i])){
                return true;
            }
        }
        return  false;
    }

    public static String lastCarecter(String word){
        return word.substring(word.length()-1,word.length());
    }
    public static String startCharecter(String word){
        return word.substring(0,1);
    }


    public int[] solution(int n, String[] words) {
        int[] answer = {};

        String flontString = "";
        int falseIndex  = -1;

        for (int i = 1; i < words.length ; i++) {
            flontString = words[i-1];
            if(!lastCarecter(flontString).equals(startCharecter(words[i]))
                    || listChacker(words,words[i],i)){

                falseIndex = i + 1;
                break;
            }
        }

        if(falseIndex == -1) {
            answer = new int[]{3, 3};
        }
        else{
            answer = new int[]{falseIndex/n,falseIndex%n};

        }
        /*
        *
        * 풀이임 :
        *
        *
        * class Solution {

    public boolean  listChacker(String[] list,String input,int index){
        for (int i = 0; i< index ; i++) {
            if(input.equals(list[i])){
                return true;
            }
        }
        return  false;
    }

    public String lastCarecter(String word){
        return word.substring(word.length()-1,word.length());
    }
    public String startCharecter(String word){
        return word.substring(0,1);
    }


    public int[] solution(int n, String[] words) {
        int[] answer = {};

        String flontString = "";
        int falseIndex  = -1;

        for (int i = 1; i < words.length ; i++) {
            flontString = words[i-1];
            if(!lastCarecter(flontString).equals(startCharecter(words[i]))
                    || listChacker(words,words[i],i)){

                falseIndex = i + 1;
                break;
            }
        }

        if(falseIndex == -1) {
            answer = new int[]{0, 0};
        }
        else{
            answer = new int[]{
                falseIndex%n == 0 ? n : falseIndex%n
                ,(int)Math.ceil((float)falseIndex/n)

                };

        }

        return answer;


    }
}
        *
        *
        *
        * */

        return answer;
    }



}
