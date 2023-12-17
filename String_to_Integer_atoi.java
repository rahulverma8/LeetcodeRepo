class Solution {

    public int extractNum(String s,int signedOne){
        String numStr = "";
        boolean zeroCrossed=false;
        if(s.length()==0) return 0;
        //getting the number
        for(int i=0;i<s.length();i++){
            
            if(s.length()>0 && s.charAt(i)>='0' && s.charAt(i)<='9'){

                if(s.charAt(i)=='0'){
                    if(!zeroCrossed) continue;
                    else numStr += s.charAt(i);
                }
                else{
                    zeroCrossed = true;
                    numStr += s.charAt(i);
                } 
            } 
            else break;
        }
        try {
            int num=0;
            if(numStr.length()!=0)
                num = Integer.parseInt(numStr);
            return num*signedOne;
        } catch (NumberFormatException e) {
            if(signedOne==1)    return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
        //long intMaxVal = Integer.MAX_VAL;
        //if(((long)intMaxVal)<num) System.out.println("");
    }

    public int myAtoi(String s) {
       s = s.trim();
       byte signedOne=1;
       
       //checking sign
       if(s.length()==0) return 0; 
       if(s.charAt(0)=='-'||s.charAt(0)=='+'){
           if(s.charAt(0)=='-')signedOne=-1;

           s = s.substring(1,s.length());
       } 
       return extractNum(s,signedOne);
    }
}
