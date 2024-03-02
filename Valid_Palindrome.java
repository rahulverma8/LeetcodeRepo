class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(cur>=65 && cur <= 90) cur = (char)(cur+32);
            if((cur>=97 && cur <= 122) || (cur>=48 && cur <= 57)) str += cur;
        }
        //checking for palindrome<
        int len = str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return false;
        }
        return true;
    }
}
