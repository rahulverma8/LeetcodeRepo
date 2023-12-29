class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null) return head;
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp= temp.next;
        }
        temp=head;

        for(int i=0;i<len/2;i++)
            temp=temp.next;

        return temp;
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
