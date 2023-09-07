import java.io.Console;

public class E209
{
  public static void main(String[] args)
  {
    var lines = 100;
    var secondLength = lines / 2;
    for (int i = 1; i <= lines - secondLength; i++) {
      System.out.println(" ".repeat(lines - 1 - i) + "*".repeat(i * 2 - 1));
    }

    for (int i = secondLength; i > 0 ; i--) {
      System.out.println(" ".repeat(lines - 1 - i) + "*".repeat(i * 2 - 1));
    }
  }
}