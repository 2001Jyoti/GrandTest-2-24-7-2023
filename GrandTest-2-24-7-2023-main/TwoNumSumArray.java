/*You are given an array of integers. The array contains both positive and negative numbers. Your task is to find any two numbers in the array whose sum is equal to given value. If there are multiple pairs, return allthe pair. 

Write a Java program that takes an array of integers as input and returns the two numbers whose sum is equal to given number. 

Input: 

int[] nums = {1, 5, -4, -2, 9, -7, 5}; 
Number : 10

Output: 

result = [1,9]  [5,5]*/
import java.util.Scanner;
class TwoNumSumArray
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements in array:");
      int n=sc.nextInt();
      int[] a=new int[n];
      System.out.println("entaer the elements of the array:");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the number:");
      int number=sc.nextInt();
     System.out.println("output:");
      boolean p=false;
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
          {
              
            
            if(a[i]+a[j]==number)
            {
              System.out.println("[" + a[i] + "," + a[j] + "]");
              p=true;
            }
          }
        }
      if(!p)
      {
        System.out.println("no pairs");
      }
    }
  }