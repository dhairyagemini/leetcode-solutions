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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer>result=new PriorityQueue<>();
        for(ListNode list:lists){
            while(list!=null){
                result.add(list.val);
                list=list.next;
            }

        }
        ListNode dummy=new ListNode(1);
        ListNode merge=dummy;
        while(!result.isEmpty()){
            merge.next=new ListNode(result.remove());
            merge=merge.next;
        }
        return dummy.next;
    }
}