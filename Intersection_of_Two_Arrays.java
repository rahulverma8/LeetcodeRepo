class Solution {

	boolean binarysearch(int[] arr,int key) {
		int l=0,r=arr.length-1,mid;
		while(l<=r){
			mid=(l+r)/2;
			if(key==arr[mid]) return true;
			else {
				if(key<arr[mid]) 
					r=mid-1;
				else l=mid+1;
			}
		}
		return false;
	}

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> resSet = new HashSet<Integer>();
        Arrays.sort(nums1);
        for(int i=0;i<nums2.length;i++){
            if(binarysearch(nums1,nums2[i]))resSet.add(nums2[i]);
            
        }
        int[] res = new int[resSet.size()];
        int i = 0;
        for (int num : resSet) {
            res[i++] = num;
        }
        return res;
    }
}
