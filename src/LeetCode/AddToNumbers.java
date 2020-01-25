package LeetCode;



public class AddToNumbers {
    /*
    *
    * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.
    *
    *
    * */


    class ListNode implements Cloneable{

        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }



    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode so =new ListNode(0);
        ListNode q = l1;
        ListNode p = l2;
        ListNode curr = so;

        int carry = 0;

        while (q != null || p != null ){  //남은 벨류 까지 순


            int value = carry
                        + (q == null ? 0 : q.val)
                        + (p == null ? 0 : p.val);

            curr.next = new ListNode(value % 10);
            carry = (int)value / 10;
            curr = curr.next;
            if(q != null) { q = q.next;}
            if(p != null) { p = p.next;}


        }

        if(carry>0){
            curr.next = new ListNode(carry);
        }

        return so.next;
    }




    public void test() {
        ListNode nodeGroup1 = new ListNode(2);
        nodeGroup1.next = new ListNode(4);
        nodeGroup1.next.next =new ListNode(3);

        ListNode nodeGroup2 = new ListNode(5);
        nodeGroup2.next =  new ListNode(6);
        nodeGroup2.next.next = new ListNode(4);

        ListNode so = addTwoNumbers(nodeGroup1,nodeGroup2);





    }
}
