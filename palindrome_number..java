class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int originalx = x;
        int reversedx = 0;
        while(x>0){
            reversedx = x%10 + reversedx*10;
            x /= 10;
        }

        return originalx==reversedx ;
    }
}
