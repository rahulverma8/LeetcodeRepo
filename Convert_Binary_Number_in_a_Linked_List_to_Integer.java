class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int len=0;  //length of LL
        int res=0;
        while(temp.next!=null){
             len++;
             temp=temp.next;
             }
        int power = 1;
        for(int i=0;i<len;i++) power *= 2; 

        temp=head;
        for(int i=power;i>0 && temp!=null;i/=2){
            res += i*(temp.val);
            temp = temp.next;
        }
        return res;
    }
}
