class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i]))
                return new int[]{i,mp.get(target-nums[i])};
            else{
                mp.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
