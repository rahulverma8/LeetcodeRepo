class Solution {
    String res="";
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        Arrays.sort(strs);
        for(int i=0;i<Math.min(strs[0].length(),strs[strs.length-1].length());i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)) 
                res += strs[0].charAt(i);
            else break;
        }
        return res;
    }
}
