import java.util.Scanner;

public class E203
{
    public static void main(String[] args)
    {
      double salesTax;
      double firstPriceBeforeTax;
      double secondPriceBeforeTax;
      double thirdPriceBeforeTax;

      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter sales tax: ");
      salesTax = keyboard.nextDouble();
      System.out.print("Enter the first price: ");
      firstPriceBeforeTax = keyboard.nextDouble();
      System.out.print("Enter the second price: ");
      secondPriceBeforeTax = keyboard.nextDouble();
      System.out.print("Enter the third price: ");
      thirdPriceBeforeTax = keyboard.nextDouble();

      System.out.println("First price before tax is: " + firstPriceBeforeTax
          + ". After tax it is: " + CalculatePriceWithTax(firstPriceBeforeTax, salesTax));

      System.out.println("Second price before tax is: " + secondPriceBeforeTax
          + ". After tax it is: " + CalculatePriceWithTax(secondPriceBeforeTax, salesTax));

      System.out.println("Third price before tax is: " + thirdPriceBeforeTax
          + ". After tax it is: " + CalculatePriceWithTax(thirdPriceBeforeTax, salesTax));
    }

    static double CalculatePriceWithTax(double priceWithoutTax, double salesTax)
    {
      return priceWithoutTax + (salesTax * priceWithoutTax);
    }
}
