class Solution {
    public boolean wordPattern(String pattern, String str) {
        // 1 ms, faster than 58.31%
        // 38.8 mb, less than 14.78%
        
        // Time complexity: O(N), where N is the # of chars in 'pattern' or # of words in 'str'. 
        // If they have a different # of elements, it is O(1) since the function returns false right away.
        // Space complexity: O(1), there can only be up to 26 entries in the map, so it is O(1)
        
        char[] patArray = pattern.toCharArray();
        String[] strArray = str.split(" ");
        
        if(patArray.length != strArray.length)
            return false;
        
        HashMap<Character, String> map = new HashMap<>();
        
        for(int i = 0; i < patArray.length; i++)
        {
            if(map.containsKey(patArray[i]))
            {
                if(!map.get(patArray[i]).equals(strArray[i])) // if we find a mismatch
                    return false;
            }
            else
            {
                if(map.containsValue(strArray[i])) // if value is already mapped to something else
                    return false;  // (think of test case "abba" and "dog dog dog dog")
                map.put(patArray[i], strArray[i]);
            }
        }
        
        // if the for loop finishes without returning false, that means no mismatches were found
        return true;
    }
}
