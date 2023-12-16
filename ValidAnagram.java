class Solution {
    public boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()) return false;
        
        String aup = a.toUpperCase();
        String bup = b.toUpperCase();
    
        int arr[]=new int[26];
        
        for(int i=0;i<a.length();i++){
            arr[aup.charAt(i)-65]++;
            arr[bup.charAt(i)-65]--;
        }
        
        for(int i=0;i<26;i++){
            if(arr[i] != 0) return false;
        }
        
        return true;
    }
}
