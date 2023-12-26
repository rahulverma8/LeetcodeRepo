public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode tempA=headA;
        ListNode tempB=headB;
         
        while(tempA!=null){
            while(tempB!=null){
                if(tempA==tempB)
                    return tempA;
                tempB = tempB.next;
            }
            tempB=headB;
            tempA = tempA.next;
        }
        return null;
    }
}
