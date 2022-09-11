/*
https://leetcode.com/problems/search-in-rotated-sorted-array/

Time complexity: O(NlogN)
Space complexity: O(1) */

class binary {
   public int search(int[] nums, int target) {
    int n = nums.length;
    int l = 0, r = n - 1;
    while (l <= r) {
     int m = (l + r) / 2;
     if (nums[m] == target)
      return m;
     // CHECK IF LEFT HALF SORTED
     if (nums[m] >= nums[l]) {
      if (target >= nums[l] && target < nums[m])
       r = m - 1;//if target is present in left half
      else
       l = m + 1;
     } else //Right half is sorted
     {
      if (target > nums[m] && target <= nums[r])
       l = m + 1;
      else
       r = m - 1;
     }
    }
    return -1;
   }
}