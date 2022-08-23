 /*

 https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
 https://leetcode.com/problems/majority-element/
 Time complexity: O(N)
 Space complexity: O(1) */

//  Moore's Voting algo


  static int majorityElement(int a[], int size)
  {
   // your code here
   int ele = 0, cnt = 0, c=0;
   for(int i=0;i<a.length;i++){
    if(cnt == 0)
     ele = a[i];
    if(ele == a[i])
     cnt += 1;
    else
     cnt -=1;
   }

   //element which comes via algorithm needs to be verified if it is actually more than n/2
   for(int i=0;i<size;i++){
    if(a[i]==ele)
     c++;
   }
   if(c>size/2)
    return ele;
   else
    return -1;
  }


  //Other solution with O(n) time complexity and O(N) space via hashmap

 static int majority(int a[],int n) {
         HashMap<Integer,Integer> hs=new HashMap<>();
         for(int i=0;i<n;i++) {
           if(!hs.containsKey(a[i]))
             hs.put(a[i],1);
           else
             hs.put(a[i],hs.get(a[i])+1);
         }

         for(int i=0;i<n;i++) {
           if(hs.get(a[i])>n/2)
             return a[i];
         }
         return -1;
  }