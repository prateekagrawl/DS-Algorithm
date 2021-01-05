/*
https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1#

Time complexity:  O(N+c) where c is count of pairs with given sum
Space complexity: O(N) */

int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        int res=0;                                      
 
    // Traverse through all elements
    for(int i = 0; i < n; i++) 
    {
        int rem = k - arr[i];
        if (mp.containsKey(rem)) 
        {
            int count = mp.get(rem);
                         
            res=res+count;
        }
        if (mp.containsKey(arr[i]))
        {
            mp.put(arr[i], mp.get(arr[i]) + 1);
        }
        else
        {
            mp.put(arr[i], 1);
        }
    }
    return res;
    }