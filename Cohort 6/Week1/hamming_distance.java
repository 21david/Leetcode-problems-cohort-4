class Solution {
    public int hammingDistance(int x, int y) {
        // 0 ms, faster than 100%
        // 36.2 mb, less than 67.13%
        
        int ct = 0;
        
        while(x > 0 || y > 0)
        {
            if((x & 1) != (y & 1))
                ct++;
            
            x >>= 1;
            y >>= 1;
        }
        
        return ct;
    }
}
