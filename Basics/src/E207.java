public class E207
{
  public static void main(String[] args)
  {
    final double STOCK_PRICE = 32.87;
    final double STOCK_SELL_PRICE = 33.92;
    final int STOCK_AMOUNT = 1000;
    final double BROKER_COMMISSION = 0.02;

    var stockPrice = STOCK_PRICE * STOCK_AMOUNT;
    var stockSellPrice = STOCK_SELL_PRICE * STOCK_AMOUNT;
    var stockBrokerCommission = stockPrice * BROKER_COMMISSION;
    var stockSellBrokerCommission = stockSellPrice * BROKER_COMMISSION;
    var profit = stockSellPrice - stockPrice - stockBrokerCommission - stockSellBrokerCommission;

    System.out.println("Joe paid $" + stockPrice + " for the stock.");
    System.out.println("Joe paid $" + stockBrokerCommission + " to his broker when he bought the stock.");
    System.out.println("Joe sold the stock for $" + stockSellPrice + ".");
    System.out.println("Joe paid $" + stockSellBrokerCommission + " to his broker when he sold the stock.");
    System.out.println("Joe made $" + profit + " profit.");
  }
}