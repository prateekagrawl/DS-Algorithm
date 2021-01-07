/*
https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/

Time complexity: O(N)
Space complexity: O(1) */

static void shiftall(int[] arr, int left,
                     int right)
{
    while (left <= right) 
    {
         
        /*if the left
        and the right elements are
        negative */
        if (arr[left] < 0 && arr[right] < 0)
            left++;
 
        /* if the left pointer element is positive and
        // the right pointer element is negative */
        else if (arr[left] > 0 && arr[right] < 0)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
 
        // if both the elements are positive
        else if (arr[left] > 0 && arr[right] > 0)
            right--;
        else
        {
            left++;
            right--;
        }
    }