class Solution {
public:
    int lengthOfLastWord(string s) {
        int wordlen = 0;
        bool gotword = 0 ;
        for(int i=s.length()-1;i>=0;i--){
            if(s.at(i)!=' ')
                gotword  = 1;
            if(gotword){

                if(s.at(i)==' ')
                    break;
                else
                    wordlen++;
                }
        }
        return wordlen;
    }
};
