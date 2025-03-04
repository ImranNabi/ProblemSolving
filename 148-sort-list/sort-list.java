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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer>st=new PriorityQueue<>();
        ListNode temp=head;
        while(temp!=null){
            st.add(temp.val);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode newNode=dummy;
       while(!st.isEmpty()){
        newNode.next=new ListNode(st.poll());
        newNode=newNode.next;
       }
       return dummy.next;
        
    }
}