class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        
        ListNode before=null;
        ListNode after=head.next;
        
        while(after != null){
            after=head.next;
            head.next=before;
            
            before=head;
            if(after!=null)
            head=after;
            
        }
        return head;
    }
}
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
