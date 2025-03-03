/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        HashMap<ListNode,Integer>a=new HashMap<>();
        while(temp!=null){
        if(a.containsKey(temp)){
            return temp;
        }
        a.put(temp,1);
        temp=temp.next;
        }
        return null;
        
    }
}