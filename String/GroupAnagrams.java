/* https://leetcode.com/problems/group-anagrams/

Time complexity: O(NK) where N is the length of strs, and K is the maximum length of a string in strs
Space complexity: O(NK) total info. stored in our ans. */

 public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hs= new HashMap<>();
        int count[]= new int[26];
        for(String s:strs){
            Arrays.fill(count,0); //essential to make this array reset 
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder sb= new StringBuilder(""); //by default, sb takes an empty string after every iteration.
            for(int i=0;i<26;i++){
                sb.append("#");
                sb.append(count[i]);
            }
            
            String key= sb.toString();
            if(!hs.containsKey(key)){
                hs.put(key, new ArrayList());   
            }
            hs.get(key).add(s);
        }
         return new ArrayList(hs.values());