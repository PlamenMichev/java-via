import java.util.Scanner;

public class E604
{
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    var firstNumber = scanner.nextInt();
    System.out.print("Enter second number: ");
    var secondNumber = scanner.nextInt();

    if (firstNumber < secondNumber) {
      System.out.printf("%d is smaller than %d", firstNumber, secondNumber);
    } else if (firstNumber > secondNumber) {
      System.out.printf("%d is smaller than %d", secondNumber, firstNumber);
    } else {
      System.out.printf("%d is equal to %d", firstNumber, secondNumber);
    }
  }
}