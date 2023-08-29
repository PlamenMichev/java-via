import java.util.Scanner;

public class E204
{
  public static void main(String[] args)
  {
    String name;
    int age;
    String address;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter your name: ");
    name = keyboard.nextLine();
    System.out.print("Enter your age: ");
    age = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("Enter your address: ");
    address = keyboard.nextLine();

    System.out.println("Your name is " + name + ", you are " + age + " years old, and you live at " + address);
  }
}
