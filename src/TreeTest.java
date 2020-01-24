import java.util.Stack;
import java.util.TreeMap;

public class TreeTest {


    public static class Node{
        Node leftNode;
        Node rightNode;
        String value;
    };



    public static void main (String args[]){
        Node rootnode = new Node();

        String s = "(())()";

        boolean answer = false;

        Stack<Character> a = new Stack<Character>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') {
                a.push(s.charAt(i));
            }
           else {
                if(a.isEmpty()) {
                    answer =false;
                } else if(a.pop()!='(') {
                    answer =false;
                }
            }
        }

        if(a.isEmpty()) {
            answer = true;
        }

        System.out.println(answer);






    }

}
