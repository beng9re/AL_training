import java.util.*;
import java.util.stream.Collectors;

public class Even {

    public void swap (int arr[],int startIndex,int endIndex){
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }


    public static  void main(String args[]){
        int[] arr = {20,8,10,1,4,15};
        Arrays.sort(arr);

        int reSortArray[] = new int[4];

    //    1 2 3

    //    6 5 4




        reSortArray[0] = arr[arr.length-1];
        reSortArray[1] = arr[0];

        int startIndex = 1;
        int endIndex = arr.length-2;
        int currentIndex = 1;

        for (int i = 1 ; i <  arr.length-1 ; i ++) {
            int divnum = -1;
            if(i%2==0){
                divnum = arr[startIndex];
                startIndex++;
            }else{
                divnum = arr[endIndex];
                endIndex--;
            }
            if(Math.abs(divnum-reSortArray[0]) > Math.abs(reSortArray[currentIndex]-divnum)){

            }



        }


    }
}
