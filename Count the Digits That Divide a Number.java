class Solution {
    public int countDigits(int num) {
        int tempnum=num;
        int count=0;
        while(tempnum>0){
            if(num%(tempnum%10)==0) count++;
            tempnum /= 10;
        }
        return count;
    }
}
