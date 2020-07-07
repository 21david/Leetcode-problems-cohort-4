class Solution {
    public int findComplement(int num) {
        // 1 ms, faster than 34.21%
        // 38.4 mb, less than 5.02%
        
        String binary = Integer.toBinaryString(num);
        
        char[] binaryArray = binary.toCharArray();
        
        for(int i = 0; i < binaryArray.length; i++)
        {
            if(binaryArray[i] == '0')
                binaryArray[i] = '1';
            else
                binaryArray[i] = '0';
        }
        
        return Integer.parseInt(new String(binaryArray), 2);
    }
}
