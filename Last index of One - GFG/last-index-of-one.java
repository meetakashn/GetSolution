//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.lastIndex( s));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int lastIndex( String s) {
        char[] arr=s.toCharArray();
        int count=0;
        if(s.contains("1")){
         for(int i=0;i<s.length();i++){
            if(arr[i]=='1'){
                count=i;
            }
        }}
        else count=-1;
        return count;
    }
}