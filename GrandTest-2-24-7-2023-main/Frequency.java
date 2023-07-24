/*Question 7:   

Scenario: You are given a string that represents a sentence. Your task is to find the most frequently occurring word and least frequently occurring word in the sentence. If there are multiple words with the same highest frequency and least frequency, choose the words that appear first in the sentence.  

 Sample Input:  
 String sentence = "the dog jumped over the fence and ran away. the cat and the dog jumped over the fence and ran away ";  

 
 Sample Output:  
 The most frequent word is: the  
The most frequent word is: dog */

import java.util.Scanner;
class Frequency
  {
     public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any string:");
      String s=sc.nextLine();
      String[] word=s.split(" ");
      Sting highestFrequency=0;
      String leastFrequency=0;
      int max=0;
      int min=0;
      for(int i=0;i<word.length;i++)
        {
          String c=word[i];
          int f=1;
        }
      for(int j=i+1;j<word.length;j++)
        {
          if(word[j].equals(c))
          {
            f++;
          }
        }
      if(c>max){
        max=c;
        highestFrequency=word;
      }
      if(c<min)  
      {
        min=c;
        leastFrequency=word;
      }
      System.out.println("The most frequent word is: " +  highestFrequency );
      System.out.println("The most frequent word is:" + leastFrequency);
    }
    
    
  }