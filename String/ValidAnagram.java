/*https://leetcode.com/problems/valid-anagram/

Time complexity: O(n)
Space complexity: Constant space is used. O(1) */


public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;
        char sc[]= s.toCharArray();
        char st[]= t.toCharArray();
        int count[]= new int[26];
        for(int i=0;i<s.length();i++){
             count[sc[i]-'a']++;
             count[st[i]-'a']--;
        }
        for(int c: count){
            if(c!=0)
                return false;
        }
    return true;