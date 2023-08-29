import java.util.Scanner;

public class E205
{
  public static void main(String[] args)
  {
    double firstScore;
    double secondScore;
    double thirdScore;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the first score: ");
    firstScore = keyboard.nextDouble();
    System.out.print("Enter the second score: ");
    secondScore = keyboard.nextDouble();
    System.out.print("Enter the third score: ");
    thirdScore = keyboard.nextDouble();

    System.out.println("The first score is: " + firstScore);
    System.out.println("The second score is: " + secondScore);
    System.out.println("The third score is: " + thirdScore);
    System.out.println("The average is: " + (firstScore + secondScore + thirdScore) / 3);
  }
}
