package programers;

public class DeGuTile {
    /*
    * 1 == 4  1 1           1 1
    * 2 == 6  1 2           2 1  이전버전의 y 이전버전의 합
    * 3 == 10 2 3           3 2
    * 4 == 16 3 5           5 3
    * 5 == 26 5 8           8 5
    * 6 ==    8 13
    * */

    public long degutileArround(int N){
        int preX = 0;
        int preY = 1;
        int x=0,y=0;
        for(int i=0; i < N; i++){
            x = preY;
            y = preX +preY;
            preX = x;
            preY = y;
            System.out.println(x + ":" + y);
        }

        return (x+y) * 2;
    }

    void test(){
        System.out.println(degutileArround(5));

    }

}
