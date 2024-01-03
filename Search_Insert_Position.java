class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1,mid;

        if(target<nums[0]) return 0;    //edge cases
        if(target>nums[r]) return r+1;

        //binary search
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]==target) return mid;

            if(target<nums[mid]) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}
