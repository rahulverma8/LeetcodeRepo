class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> mp = new HashMap<Character,Integer>();
        int count = 0 ;
        
        for(int i=0;i<stones.length();i++){
            char key = stones.charAt(i);
            mp.put(key,mp.containsKey(key) ? mp.get(key)+1 : 1);
        }
            
        for(int i=0;i<jewels.length();i++){
            if(mp.containsKey(jewels.charAt(i)) )
                count += mp.get(jewels.charAt(i));
        }
        return count;
    }
}
