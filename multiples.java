import java.util.Scanner;

public class multiples{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int num = scan.nextInt();
    System.out.println("Enter the number of multiples:");
    int multi = scan.nextInt();

    if((multi > 0) && (num > 0)){
      for(int i = 2; i <= (multi + 1); i++){

        System.out.print((num * i) + " ");
        if((i % 6) == 0){
          System.out.println();
        }

      }
    }
    else
    System.out.println("Use positive numbers");
  }
}
