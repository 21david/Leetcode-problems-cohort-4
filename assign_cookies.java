class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // 9 ms, faster than 43.74%
        // 50.3 MB, less than 5.00%
        
        /*
        Greedy, O(N*logN) approach:
        Sort both the children and the cookies descending.
        Then give out the cookies in the first order that they can be given out.
         - for the first cookie, give it to the first child such that s[i1] >= g[i2]
         - repeat for as many cookies as possible
         Return the amount of children that could be satisfied.
        */
        
        Arrays.sort(g);  // sort ascending
        Arrays.sort(s);  // sort ascending
        
        int happyChild = 0;
        
        int gi = g.length - 1;
        
        for(int i = s.length - 1; i >= 0; i--)
        {
            // for each cookie, we want to find the first child that we can give it to
            
            while( gi >= 0 && s[i] < g[gi])  // finds the first child
                gi--;
            
            if(gi < 0)  // if out of bounds, this cookie was not given to any child
                break;
            
            happyChild++;
            
            gi--;
            
        }
        
        
        return happyChild;
    }
}

/*
Test cases:

[1,2,3]
[1,1]

[2,3,6,7,7,8,12]
[20,8,6,4,2,2,1,1]

[1,3,6,6,9,9,12,13]
[30,20,9,8,6,5]

[1,1,1,3,3,6,17,20]
[34,20,9,1,1,1]

[1,2,3,3,3,8,10,15]
[15,3,2,1]

[1,3,5,7,9,12,12,12,16]
[16,12,12,10,5,2]

[2,3,5,8,10,12,12,12,18]
[20,20,12,10,5,2]

[1,1,1,1,3,3,3,6,6,6,10,10,10,10,15,15,15]
[20,20,20,20,11,7,5,2,2]

[8,8,10,10,12,12]
[10,10,10,10,10]

[5,5,5,15,15,15,20,20,20,30,30]
[30,20,10,4,3,2,1]

[10,10,10,10,10]
[5,5,5]

[50,50,50,50,50]
[60,50,40,30,20,10]


Expected outputs:
1
5
6
6
4
6
6
9
4
3
0
2

*/
