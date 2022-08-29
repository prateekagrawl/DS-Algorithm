/*
https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1#
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
Time complexity: O(n)
Space complexity: O(1) */

Approach 1:
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        if(nums.length==0) return 0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j])
                i++;
            //swap nums[i] and nums[j]
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        return i+1;
    }
}




//Approach 2:
int remove_duplicate(int a[],int n){
        // code here
        int j=0;
        for(int i=0;i<n-1;i++){
            if(a[i]!=a[i+1])
              a[j++]=a[i];
        }
        a[j++]=a[n-1];
        return j;
    }