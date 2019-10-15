import java.util.Scanner;

public class wordSplicer{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word:");
    String input = scan.nextLine();

    for(int i = 0; i <= input.length(); i++){
    System.out.println(input.charAt(i));
    }
  }
}
