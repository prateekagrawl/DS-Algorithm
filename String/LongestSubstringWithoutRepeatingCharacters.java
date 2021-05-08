    // https://leetcode.com/problems/longest-substring-without-repeating-characters/


    // Time complexity: O(n)
    // Space complexity: O(n)

public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs= new HashSet<>();
        int ans=0, i=0,j=0;
        while(j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j++));
                ans= Math.max(j-i,ans);
            }
            else
                hs.remove(s.charAt(i++));
        }
        return ans;
    }