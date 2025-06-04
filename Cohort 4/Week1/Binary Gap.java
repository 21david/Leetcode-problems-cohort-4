/*
https://leetcode.com/problems/binary-gap/description/
*/

class Solution {
    public int binaryGap(int N) {
        
        String binaryString = Integer.toBinaryString(N);
        
        int index = binaryString.indexOf("1");
        int maxDistance = 0;
        int distance = 0;
        
        // find the distance between the first 1 and the second 1
        // if there isn't a second 1, return 0
        int nextOne = binaryString.indexOf("1", index + 1);
        
        if(nextOne >= 0)
            distance = nextOne - index;
        else
            return 0;
            
        if(distance > maxDistance)
            maxDistance = distance;
            
        index = nextOne;
        
        // iterates through pairs of 1s, finding the distance, and checking if that distance is a new maximum
        while((nextOne = binaryString.indexOf("1", index + 1)) >= 0)
        {
            
            distance = nextOne - index;
            
            if(distance > maxDistance)
                maxDistance = distance;
            
            index = nextOne;
        }
        
        return maxDistance;
        
    }
}
