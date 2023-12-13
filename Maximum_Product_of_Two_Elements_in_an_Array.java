class Solution {
    public int maxProduct(int[] nums) {
        int maxnew=0,maxold=0,maxval=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxnew){
            maxold=maxnew;
            maxnew=nums[i];
            }
            else{
                if(nums[i]>maxold)
                    maxold=nums[i];
            }
        }
       return (maxold-1)*(maxnew-1);
    }
}
