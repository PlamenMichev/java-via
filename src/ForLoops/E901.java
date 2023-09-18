import java.util.Scanner;

public class E901
{
  public static void main(String[] args)
  {
    var scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    var number = scanner.nextInt();

    for (int i = 1; i <= number; i++)
    {
      if (i == number) {
         System.out.print(i);
         System.out.println();
         break;
      }

      System.out.print(i + ", ");
    }

    for (int i = 1; i <= number * 2; i++)
    {
      if (i >= number) {
        System.out.print(i * 2);
        System.out.println();
        break;
      }

      System.out.print(i * 2+ ", ");
    }

    for (int i = 1; i <= number * number; i++)
    {
      if (i >= number) {
        System.out.print(i * i);
        System.out.println();
        break;
      }

      System.out.print(i * i + ", ");
    }
  }
}
