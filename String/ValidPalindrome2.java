/* https://leetcode.com/problems/valid-palindrome-ii/

Time complexity: O(n)
Space complexity: O(1) */

public boolean validPalindrome(String s) {
        int i=0, j= s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j))
                return (isPalin(s,i+1,j) || isPalin(s,i,j-1)); /*check Palindrome by removing either first character and
                                                                 of String OR removing jth character.                                                                  by removing last character*/
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    
    public boolean isPalin(String str, int i, int j){
        while(i<j){
            if(str.charAt(i)!= str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }