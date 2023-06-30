//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String str = read.readLine();
   
            Solution ob = new Solution();
            ob.printTriangleDownwards(str);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void printTriangleDownwards(String str){
      for(int i=0;i<str.length();i++){
          for(int j=str.length()-1;j>i;j--){
              System.out.print(".");
          }
          System.out.print(str.substring(0,i+1));
          System.out.println();
      }
    }
}