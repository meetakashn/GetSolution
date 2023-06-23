//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v  = new int[n];
            for(int  i = 0; i < n; i++)
                v[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.find_median(v);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int find_median(int[] v)
    {
        int n=0,m=v.length;
        Arrays.sort(v);
        if(m%2!=0){
            n=v[m/2];
        }
        else{
            int o=m/2;
            int sum=v[o-1]+v[o];
            n=sum/2;
        }
        return n;
        
    }
}