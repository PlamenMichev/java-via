import java.util.Scanner;

public class E601
{
  public static void main(String[] args) {
    System.out.println("Enter age:");
    var scanner = new Scanner(System.in);
    var age = scanner.nextInt();
    if (age < 0) {
      System.out.println("Error in age value");
    } else if (age <= 12) {
      System.out.println("Child");
    } else if (age <= 19) {
      System.out.println("Teenager");
    } else if (age <= 65) {
      System.out.println("Adult");
    } else {
      System.out.println("Senior citizen");
    }
  }
}