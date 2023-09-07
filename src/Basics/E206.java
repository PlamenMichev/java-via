import java.util.Scanner;

public class E206
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter your name: ");
    var name = keyboard.nextLine();
    System.out.print("Enter your city name: ");
    var cityName = keyboard.nextLine();
    System.out.print("Enter your college name: ");
    var collegeName = keyboard.nextLine();
    System.out.print("Enter your profession: ");
    var profession = keyboard.nextLine();
    System.out.print("Enter your animal type: ");
    var animalType = keyboard.nextLine();
    System.out.print("Enter your pet name: ");
    var petName = keyboard.nextLine();

    System.out.println("There once was a person named "
        + name
        + " who lived in "
        + cityName +
        ". At the age of 20, "
        + name + " went to college at "
        + collegeName + ". "
        + name + " graduated and went to work as a "
        + profession
        + ". Then, "
        + name +
        " adopted a(n) "
        + animalType +
        " named "
        + petName
        + ". They both lived happily ever after!");
  }
}