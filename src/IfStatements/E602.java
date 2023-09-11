import java.util.Scanner;

public class E602
{
  public static void main(String[] args)
  {
    var scanner = new Scanner(System.in);

    System.out.print("Enter gender letter: ");
    var gender = scanner.nextLine().charAt(0);
    System.out.print("Enter age: ");
    var age = scanner.nextInt();

    if ((gender != 'M' && gender != 'F') || age < 0)
    {
      System.out.println("Error in typed values");
    }
    else if (gender == 'M')
    {
      if (age < 18)
      {
        System.out.println("Boy");
      }
      else
      {
        System.out.println("Man");
      }
    }
    else
    {
      if (age < 18)
      {
        System.out.println("Girl");
      }
      else
      {
        System.out.println("Woman");
      }
    }
  }
}


