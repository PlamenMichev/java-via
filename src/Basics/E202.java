import java.util.Scanner;

public class E202
{
  public static void main(String[] args)
  {
    int firstNumber;
    int secondNumber;
    int thirdNumber;

    Scanner keyboard = new Scanner(System.in);
    firstNumber = keyboard.nextInt();
    secondNumber = keyboard.nextInt();
    thirdNumber = keyboard.nextInt();

    System.out.println("The sum is " + (firstNumber + secondNumber + thirdNumber));
  }
}
