/*
https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/


Time complexity: O(n)
Space complexity: O(1)


 */


// Java program to print largest
// contiguous array sum
class GFG {

    static void maxSubArraySum(int a[], int size)
    {
        int res = Integer.MIN_VALUE,
                sum = 0,start = 0,
                end = 0, s = 0;

        for (int i = 0; i < size; i++)
        {
            sum += a[i];

            if (sum > res)
            {
                res = sum;
                start = s;
                end = i;
            }

            if (sum < 0)
            {
                sum = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is "
                + res);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }

}
