import java.util.Scanner;

public class E904
{
  public static void main(String[] args)
  {
    var scanner = new Scanner(System.in);
    System.out.print("Enter a number of the fibonacci sequence: ");
    int number = 0;
    while (number != -1)
    {
      number = scanner.nextInt();

      var firstNumber = 1;
      var secondNumber = 1;
      for (int i = 1; i < number; i++)
      {
        var currentNumber = secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber = currentNumber;
      }

      System.out.println("The number is: " + secondNumber);
    }
  }
}
