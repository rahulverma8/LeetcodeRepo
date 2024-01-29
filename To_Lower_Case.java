class Solution {
    public String toLowerCase(String s) {
        String lowerstr="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                lowerstr += (char)(s.charAt(i)+32);
            else
                lowerstr += s.charAt(i);
        }
        return lowerstr;
    }
}
