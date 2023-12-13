class Solution {
    public int maxProduct(int[] nums) {
        int maxnew=0,maxold=0,maxval=0;
        //maxnew will hold the max value
        //maxold will hold the 2nd max value
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
