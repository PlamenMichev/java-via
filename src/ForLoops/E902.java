import java.util.Scanner;

public class E902
{
  public static void main(String[] args)
  {
    var scanner = new Scanner(System.in);
    System.out.print("Type an year: ");
    var year = scanner.nextInt();

    var count = 0;
    for (int i = year; i < 2023; i++)
    {
      var isLeapYear = i % 4 == 0;
      if (isLeapYear) {
        count++;
      }
    }

    System.out.println("There are " + count + " leap years between " + year + " and 2022.");
  }
}
