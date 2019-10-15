import java.util.Scanner;

public class winPercentage{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
      int total = 100;
      int wins = 10;
      while(total >= 1){
      System.out.println("Enter total games: ");
      total = scan.nextInt();
      if(total >= 1){

      }
      else{
        System.out.println("Can't be less than 1");
      }
      }

      while(wins > total && wins >= 0){
      System.out.println("Enter total wins: ");
      wins = scan.nextInt();
      if(wins >= 0){

      }
      else{
        System.out.println("Can't be less than 0");

        if(wins > total)
        System.out.println("Wins can't be greater than Total");
      }

      }

      double percent = 100 * (wins / ((double) total));
      System.out.println(percent + "%");
  }
}
