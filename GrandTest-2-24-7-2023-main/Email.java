/*You are developing a program to analyze email addresses. The program should allow the user to enter an email address and check whether the email address is valid or not. The email address is valid if it follows the following conditions:


   1. Email id needs tostart with lower case alphabet and does not allow white spaces between characters. 

    2. Email id should end with domain and should contain ‘@’ symbol.  

Input: 

String email = "example@email.com"; 

Output: 

Is the email address valid? true


Input: 

String email = "2023example@email.con"; 

Output: 

Is the email address valid? false*/

import java.util.Scanner;
class Email
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a email id");
      String email=sc.nextLine();
      if(email.contains("@gmail.com")) 
      {
        System.out.println("Is the email address valid? true");
        System.out.println(email);
      }
      else
      if(email.contains("@gmail.con")){
        System.out.println("Is the email address valid? false*");
      }
    }
  }