class Solution {
    public int findPeakElement(int[] nums) {
        int peak=nums[0];
        for (int i=0;i<nums.length;i++){
            if(peak<nums[i]){
                peak=i;
            }
        }
    return peak;
    }
}
