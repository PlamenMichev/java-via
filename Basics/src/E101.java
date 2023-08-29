public class E101
{
  public static void main(String[] args)
  {
    String name = "Plamen";
    int age = 21;
    double annualPay = 1000000;

    String result = String.format("My name is %s, my age is %s and\n"
        + "I hope to earn $%s per year.", name, age, annualPay);
    System.out.println(result);
  }
}