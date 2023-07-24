
/*You are developing a program to perform various operations on a text message. The program should allow the user to enter a string and perform various operations on it, such as display first character of each word, count total number of digits, count total number of special symbols. 

Sample Input and Output: 

Enter a text string: My home address is 12/3/A-591

First Character of each Word: M , h,  a,  i, 1

Total number of digits: 6

Total number of special symbols: 3*/
import java.util.Scanner;
class Operations
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a text string:");
      String s=sc.nextLine();
      System.out.println("First Character of each Word: ");
      String[] word=s.split(" ");
      for(String w:word)
        {
          System.out.println(w.charAt(0)+ ",");
        }
      
    
      int d=0;
      for(char c:s.toCharArray())
        {
          if(Character.isDigit(c))
          {
            d++;
          }
        }
       System.out.println("\nTotal number of digits:" + d);
     int specialSymbol=0;
      for(char c:s.toCharArray())
        {
          if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c))
          {
            specialSymbol++;
          }
        }
      System.out.println("Total number of special symbols:");
    }
  }