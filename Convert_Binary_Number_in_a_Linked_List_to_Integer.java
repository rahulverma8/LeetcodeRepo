class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int len=0;  //length of LL
        int res=0;
        while(temp.next!=null){
             len++;
             temp=temp.next;
             }
        temp=head;
        for(int i=(int)Math.pow(2,len);i>0 && temp!=null;i/=2){
            res += i*(temp.val);
            temp = temp.next;
        }
        return res;
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
