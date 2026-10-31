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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<Integer>result=new PriorityQueue<>();
        ListNode curr=list1;
            while(curr!=null){
                result.add(curr.val);
                curr=curr.next;

            
        }
             curr=list2;
            while(curr!=null){
                result.add(curr.val);
                curr=curr.next;
            
        }
        ListNode dummy=new ListNode(-1);
        ListNode merge=dummy;
        while(!result.isEmpty()){
        merge.next=new ListNode(result.remove());
        merge=merge.next;
        }
        return dummy.next;

        
    }
}