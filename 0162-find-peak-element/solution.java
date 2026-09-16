class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Peak lies in the right half
                left = mid + 1;
            } else {
                // Peak lies in the left half (including mid)
                right = mid;
            }
        }

        return left;
    }
}
