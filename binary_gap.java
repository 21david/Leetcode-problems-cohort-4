class Solution {
    public int binaryGap(int N) {
        // 4 ms, faster than 6.29%
        // 37.9 mb, less than 17.45%
        
        // convert to binary string so we can work with it
        String binary = Integer.toBinaryString(N);
        
        // we need to trim outside 0s (from the left and from the right)
        binary = binary.substring(binary.indexOf("1"), binary.lastIndexOf("1") + 1);

        // if there is no pair of 1s (i.e. for 8), we return 0
        if(binary.length() == 1)
            return 0;
        
        // we need to find the longest string of 0s in our string
        String zeros = ""; //new StringBuilder();
        
        while( binary.contains(zeros) )
            zeros += "0";
        
        
        // the length of this string of 0s is the answer
        return zeros.length();
    }
}
