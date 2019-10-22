import java.util.Scanner;

public class PalindromeTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a palindrome?");

    String input = scan.nextLine();

    for(int i = 0; i <= input.length() - 1; i++){
      if(input.charAt(i) == input.charAt(input.length() - (i + 1))){

      }
      else{
        System.out.println("Not a palindrome");
        System.exit(0);
      }
    }
    System.out.println("Is a palindrome");
  }
}
