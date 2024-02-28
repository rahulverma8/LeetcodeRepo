//Incomplete Code
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String word = "";
		String res= "";
        char cur;
		for(int i=0;i<s.length();i++) {
			cur = s.charAt(i);
            if(cur==' '){
                res = word +' '+ res ;
                if(res.length()>0){
                    if(res.charAt(0)!=' ') res = ' '  + res;
                }
            }
            else{
                word+=cur;
            }
        }
        return res;
    }
}
