// https://leetcode.com/problems/valid-palindrome/

// Time complexity: O(n) where n= length of string,since doing a single traversal in the string
// Space complexity: O(1)

public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            while(l<r && (!Character.isLetterOrDigit(s.charAt(l))))
                l++;
            while(l<r && (!Character.isLetterOrDigit(s.charAt(r))))
                r--;
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            l++;
            r--;
        }
        return true;
    }