import java.util.Scanner;

public class TestScoresTest
{
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.print("Enter the first score: ");
    double firstScore = scanner.nextDouble();
    System.out.print("Enter the second score: ");
    double secondScore = scanner.nextDouble();
    System.out.print("Enter the third score: ");
    double thirdScore = scanner.nextDouble();

    TestScores scores = new TestScores(firstScore, secondScore, thirdScore);
    System.out.println(scores);
  }
}
