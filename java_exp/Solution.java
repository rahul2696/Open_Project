import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        for(int i=1;i<=size/2+1;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(j-i==size/2||i==size/2+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");    
                }
            }
            System.out.println();
        }
        
        for(int i=size/2;i>0;i--)
        {
            for(int j=1;j<=size;j++)
            {
                if(j-i==size/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");    
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=size/2+1;i>=1;i--)
        {
            for(int j=1;j<=size;j++)
            {
                if(j-i==0||i==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");    
                }
            }
            System.out.println();
        }
        
        for(int i=1;i<=size/2;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(j-i==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");    
                }
            }
            System.out.println();
        }
    }
}