class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length(),len2=word2.length();
        char[]arr = new char[Math.min(len1,len2)*2];
        int ind=0;
        for(int i=0;i<Math.min(len1,len2)*2;i++){
            if(i%2==0) arr[i]=word1.charAt(ind);
            else{
                arr[i]=word2.charAt(ind);
                ind++;
            } 
            System.out.println(arr);
        }
        String res= new String(arr);
        if(len1<len2)
            res += word2.substring(len1,len2);
        if(len1>len2)
            res += word1.substring(len2,len1);
        return res;
    }
}
