public class E105
{
  public static void main(String[] args)
  {
    double salesTax = 0.25;
    double firstPriceBeforeTax = 80;
    double secondPriceBeforeTax = 140;
    double thirdPriceBeforeTax = 230;

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
