import java.lang.*;
package com.capgemini.lab1;
import java.io.*;
class Exercise3
{
    public static void main(String args[])throws IOException
    {
    int i,sum=0,f=1,res,n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Hey boss This is Fibonacci series Generator program");
    System.out.println("Enter The range");
    n=Integer.parseInt(br.readLine());
    System.out.println("The fibonacci series is:");
    for(i=0;i<n;i++)
    {
        res=sum+f;
        System.out.println(sum);
        sum=f;
        f=res;
    }
    System.out.println("\nTask completed.");
    }
}
