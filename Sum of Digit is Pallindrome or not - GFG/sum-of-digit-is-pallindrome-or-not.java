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
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        int sum=0,rev=0;
	    while(N!=0){
	        int rem=N%10;
	        sum+=rem;
	        N=N/10;
	    }
	     int temp1=sum;
	    while(temp1!=0){
	        int rem=temp1%10;
	        rev=(rev*10)+rem;
	        temp1=temp1/10;
	    }
	    if(sum==rev) return 1;
	    else return 0;
    }
}