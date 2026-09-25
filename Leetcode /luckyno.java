class Solution {
    public int findLucky(int[] arr) {
       int lucky = -1;

        for (int i = 0; i < arr.length; i++) {

            int value = arr[i];
            int count = 0;

            // Count frequency of value
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == value) {
                    count++;
                }
            }

            // Check if value == frequency
            if (count == value) {
                lucky = Math.max(lucky, value);
            }
        }

        return lucky;
    }
}
