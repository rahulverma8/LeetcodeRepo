class Solution {
    public int findLengthOfLCIS(int[] nums) {    // O(n) solution
        int max=1; //min element is 1
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] < nums[i]) count++;
            else{
                if(count>max) max = count;
                count=1;
            }
        }
        return Math.max(count,max);
    }
}
