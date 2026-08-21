class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++){
        int b=nums[i];
        int digits = 0;

         while(b>0){
            b/=10;
            digits++;
         }
         if(digits%2==0){
            count++;
         }
       }
    return count;
    }
}
