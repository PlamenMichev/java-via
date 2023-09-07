import java.util.Scanner;

public class TemperatureTest
{
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.print("Enter a Fahrenheit temperature: ");
    double ftemp = scanner.nextDouble();

    System.out.println("test: " + (double)(5/9));

    Temperature temp = new Temperature(ftemp);
    System.out.println("Fahrenheit: " + temp.getFahrenheit());
    System.out.println("Celsius: " + temp.getCelsius());
    System.out.println("Kelvin: " + temp.getKelvin());
  }
}
