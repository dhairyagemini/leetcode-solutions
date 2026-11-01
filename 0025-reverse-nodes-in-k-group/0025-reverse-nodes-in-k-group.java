/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=head;
        ListNode knode=null;
        ListNode next=null;
    
        while(prev!=null){
            int count=0;
            prev=head;

            while(count<k&&prev!=null){
               
                prev=prev.next;
                count++;
            }
            if(count==k){
                ListNode rev=reverse(head,k);


                if(next==null){
                    next=rev;

                }
                if(knode!=null){
                    knode.next=rev;


                }
                knode=head;
                head=prev;

                }
        }
                if(knode!=null){
                    knode.next=head;
                }




        
        return next==null?head:next;
         
        
    }
    public ListNode reverse(ListNode head,int k){
        ListNode rev=null;
        ListNode  prev=head;
        while(k>0){
            ListNode revnext=prev.next;
            prev.next=rev;
            rev=prev;
            prev=revnext;

            k--;
        }
        return rev;

    }
}