//  https://leetcode.com/problems/partition-labels/

class Solution {
    public List<Integer> partitionLabels(String S) {
        // 8 ms, faster than 29.77%
        // 38 MB, less than 86.09%
        
        /*
        Start with the first letter, and find the last index of it, if it repeats.
        This will be the first tentative section. Then, for each letter in this section,
        find the last index of it, and increase the section if that last index comes
        after the end of the section. So we will try to push the section as much as possible
        When we reach the end of the section, we can start over, and repeat until we run
        out of letters.
        
        ababcbaca defegde hijhklij
        |       | |     | |      |
        
        In the input example, the first section never gets "pushed" back. 
        The second section starts out as the range from the 1st d to the 2nd d, 
        but then gets pushed back because of the e.
        The third section starts out as the range from the 1st h to the 2nd h, 
        but gets pushed back two times because of the i and j
        Then we run out of letters and we can return the answer.
        */
        
        // store the lenghts of each section
        ArrayList<Integer> result = new ArrayList<>();
        
        int i1 = 0;
        int start = 0;
        
        while(start < S.length()) {
            
            int i2 = S.lastIndexOf(S.charAt(start));
            
            i1 = start + 1;
            
            // tentative range is from start to i2
            while(i1 < i2) {
                int t = S.lastIndexOf(S.charAt(i1));
                
                // if t is greater than i2, then that means the bar has been pushed back
                i2 = Math.max(i2, t);
                
                i1++;
            }
            
            // we finished finding a section, so add its length to the list
            result.add((i2 - start) + 1);
            
            // set up variables to look for the next section
            start = i2 + 1;
            i1++;
            
        }
        
        return result;
    }
}

/*

Test cases:
([)input followed by expected output)

"ababcbacadefegdehijhklij"
[9,7,8]

"q"
[1]

"aba"
[3]

"asandwichapplea"
[15]

"abcxyzabcxyzdogs"
[12,1,1,1,1]

"abcdefghijklmnopqrstuvwxyz"
[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]

"abababzdededededexfgfgfgfgfgy"
[6,1,10,1,10,1]

*/
