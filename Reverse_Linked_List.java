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
