import java.util.Scanner;

public class Question1
{
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.print("Type an integer: ");
    var firstInt = scanner.nextInt();
    System.out.print("Type a second integer: ");
    var secondInt = scanner.nextInt();
    System.out.print("Type a third integer: ");
    var thirdInt = scanner.nextInt();
    System.out.print("Type a fourth integer: ");
    var fourthInt = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Type your name: ");
    var name = scanner.nextLine();

    var firstAndSecondSum = firstInt + secondInt;
    var secondAndThirdProduct = secondInt * thirdInt;
    var thirdAndFourthDifference = thirdInt - fourthInt;
    double fourthAndFirstQuotient = (double) fourthInt / firstInt;

    System.out.println("Hi " + name + ", here are the results of the calculations:");
    System.out.println("The sum of (" + firstInt + " + " + secondInt + ") is " + firstAndSecondSum);
    System.out.println("The product of (" + secondInt + " * " + thirdInt + ") is " + secondAndThirdProduct);
    System.out.println("The difference of (" + thirdInt + " - " + fourthInt + ") is " + thirdAndFourthDifference);
    System.out.println("The quotient of (" + fourthInt + " / " + firstInt + ") is " + fourthAndFirstQuotient);
    System.out.println("The total sum is " + (firstAndSecondSum + secondAndThirdProduct + thirdAndFourthDifference + fourthAndFirstQuotient));
  }
}
