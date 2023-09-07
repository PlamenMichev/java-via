public class E107
{
  public static void main(String[] args)
  {
    System.out.println(String.format("x = %s", 7 + 3 * 6 / 2 - 1)); // 15
    System.out.println(String.format("y = %s", 2 % 2 + 2 * 2 - 2 / 2)); // 3
    System.out.println(String.format("z = %s", (3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) ))); // 27 * 12 = 324
  }
}