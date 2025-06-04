class Solution {
    public int binaryGap(int N) {
        // 1 ms, faster than 54.45%
        // 36.1 mb, less than 89.26%
        
        // convert to binary string so we can work with it
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(N));
        
        // we need to trim outside 0s (from the left and from the right)
        binary = new StringBuilder(binary.substring(binary.indexOf("1"), binary.lastIndexOf("1") + 1));

        // if there is no pair of 1s (i.e. for 8), we return 0
        if(binary.length() == 1)
            return 0;
        
        // we need to find the longest string of 0s in our string
        StringBuilder zeros = new StringBuilder(); //new StringBuilder();
        
        while( binary.indexOf(zeros.toString()) >= 0 )
            zeros.append("0");
        
        
        // the length of this string of 0s is the answer
        return zeros.length();
    }
}
