class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2; // The square root of x (for x >= 4) is always <= x / 2
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Using mid <= x / mid instead of mid * mid <= x to avoid integer overflow
            if (mid <= x / mid) {
                ans = mid;     // mid is a valid candidate, save it
                left = mid + 1; // Try to find a larger value
            } else {
                right = mid - 1; // mid is too large, look in the lower half
            }
        }

        return ans;
    }
}