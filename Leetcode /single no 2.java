class Solution {

    int count(int[] nums, int value) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                c++;
            }
        }
        return c;
    }

    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int s = count(nums, nums[i]);

            if (s == 1) {
                return nums[i];
            }
        }
        return -1;
    }
}
