public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;

        ListNode sl=head;
        ListNode fs=head;
        while(fs!=null && fs.next!=null){
            sl = sl.next;
            fs = fs.next.next;

            if(sl==fs) return true;
        }
        return false;
    }
}
