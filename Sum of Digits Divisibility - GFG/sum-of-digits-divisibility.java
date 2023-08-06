//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDivisible(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDivisible(int N) {
         int sum=0;
         int temp=N;
         while(temp!=0)
         {
             int rem=temp%10;
             sum+=rem;
             temp/=10;
         }
        if(N%sum==0) return 1;
        else return 0;
    }
}