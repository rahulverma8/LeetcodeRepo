class Solution {
    public String reverseWords(String s) {
        String scp = "";
        String temp[] = s.split(" ");
        for(int ia=0;ia<temp.length;ia++){
            for(int i=temp[ia].length()-1;i>=0;i--)
                scp += temp[ia].charAt(i);
            if(ia != temp.length-1)
                scp += " ";
        }

        return scp;
    }
}
