/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

Time complexity: O(NlogN)
Space Complexity: O(1)

check babbar's video tutorial

*/
class Solution1 {
	public int findFirstPosition(int a[], int key, int n){
		int l = 0, h = n-1, ans = -1;
		while(l<=h){
			int mid = l + (h-l)/2;
			if(a[mid]==key){
				ans = mid;  //constantly store answer in a key
				h = mid-1; //since we need to find First position, move high to mid-1.
			}
			else if(a[mid]< key)
				l = mid+1;
			else
				h = mid-1;
		}
		return ans;
	}

	public int findLastPosition(int a[], int key, int n){
		int l = 0, h = n-1, ans = -1;
		while(l<=h){
			int mid = l + (h-l)/2;
			if(a[mid]==key){
				ans = mid;
				l = mid+1; //since we need to find last position, move low to mid+1.
			}
			else if(a[mid]< key)
				l = mid+1;
			else
				h = mid-1;
		}
		return ans;

	}
	public int[] searchRange(int[] nums, int target) {
		int res1 = findFirstPosition(nums, target , nums.length);
		int res2 = findLastPosition(nums, target, nums.length);
		int res[] = new int[]{res1,res2};

		return res;
	}
}