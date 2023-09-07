// Java program to demonstrate BufferedReader
import java.util.Scanner;

public class E201
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String cityName = keyboard.nextLine();

    System.out.println("Number of characters: " + cityName.length());
    System.out.println("Name in uppercase: " + cityName.toUpperCase());
    System.out.println("Name in lowercase: " + cityName.toLowerCase());
    System.out.println("The first letter: " + cityName.charAt(0));
  }
}