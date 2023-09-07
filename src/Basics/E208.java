import java.util.Scanner;

public class E208
{
  public static void main(String[] args)
  {
    var scanner = new Scanner(System.in);
    System.out.print("Enter the amount of shares bought: ");
    var stockAmount = scanner.nextInt();
    System.out.print("Enter the price per share bought: ");
    var stockPricePerShare = scanner.nextDouble();
    System.out.print("Enter the price per share sold: ");
    var numberOfSharesSold = scanner.nextInt();
    System.out.print("Enter the price per share sold: ");
    var stockSellPricePerShare = scanner.nextDouble();
    System.out.print("Enter the broker commission: ");
    var brokerCommission = scanner.nextDouble();

    var stockPrice = stockPricePerShare * stockAmount;
    var stockSellPrice = stockSellPricePerShare * numberOfSharesSold;
    var stockBrokerCommission = stockPrice * brokerCommission;
    var stockSellBrokerCommission = stockSellPrice * brokerCommission;
    var profit = stockSellPrice - stockPrice - stockBrokerCommission - stockSellBrokerCommission;

    System.out.println("Joe paid $" + stockPrice + " for the stock.");
    System.out.println("Joe paid $" + stockBrokerCommission + " to his broker when he bought the stock.");
    System.out.println("Joe sold the stock for $" + stockSellPrice + ".");
    System.out.println("Joe paid $" + stockSellBrokerCommission + " to his broker when he sold the stock.");
    System.out.println("Joe made $" + profit + " profit.");
  }
}

