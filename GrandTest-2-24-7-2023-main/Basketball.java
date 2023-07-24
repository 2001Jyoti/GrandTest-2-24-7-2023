/*Write a Java program to track the performance of a basketball team throughout a tournament. Implement an array to store the team's scores and the corresponding opposing team's scores for each game and calculate various statistics, such as the highest score and least score and average score of each team. Additionally, the program should display which team win the tournament based on average score of each team. 



Sample Input: 

Enter the number of games played: 4 
Enter the scores for each game: 
Game 1 – Team1 Score: 85 
Game 1 – Team 2 Score: 70 
Game 2 – Team1 Score:  92 
Game 2 - Team 2 Score: 80 
Game 3 - Team1 Score:  78 
Game 3 - Team 2 Score: 82 
Game 4 - Team1 Score:  90 
Game 4 - Team 2 Score: 95 

Sample Output: 

Team 1 Highest Score: 92
Team 1 Lowest Score:  78 
Team 1 average  Score: 86
Team 2 Highest Score: 95 
Team 2 Lowest Score:  70 
Team 2 average  Score: 82

Team 1 win the tournament*/
import java.util.Scanner;
class Basketball
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of games played:");
      int n=sc.nextInt();
      System.out.println("Enter the scores for each game:");
      int[] team1=new int[n];
      int[] team2=new int[n];

      for(int i=0;i<n;i++)
        {
          System.out.println("Game: " + (i+1) );
          System.out.println("Team1 Score: ");
          team1[i]=sc.nextInt();
          System.out.println("Team2 Score:");
          team2[i]=sc.nextInt();
    
        }
       Basketball b=new Basketball();
       team1A
      


      
    }
  }