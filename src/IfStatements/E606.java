import java.util.Scanner;

public class E606
{
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.print("Enter a: ");
    var a = scanner.nextDouble();
    System.out.print("Enter b: ");
    var b = scanner.nextDouble();
    System.out.print("Enter c: ");
    var c = scanner.nextDouble();

    var d = b * b - 4 * a * c;
    if (d < 0) {
      System.out.println("No solution");
    } else if (d == 0) {
      var x = -b / (2 * a);
      System.out.println("One solution: " + x);
    } else {
      var x1 = (-b + Math.sqrt(d)) / (2 * a);
      var x2 = (-b - Math.sqrt(d)) / (2 * a);
      System.out.println("Two solutions: " + x1 + " and " + x2);
    }
  }
}

//  In math a quadratic equation is given as: 02=++cbxaxFor such an equation the determinant (D) is defined as acbD42−=and the solution to the equation can then be calculated as: If D<0, there is no solution If  D=0, there is one solution: abx2−=If D>0, there are two solutions:  aDbx21+−= and aDbx22−−=Create a program that asks the user to input values for a, b and c, then calculates the solutions (if any) to a quadratic equation defined by those values, and prints them out. Remember that in Java the square root of a number is found by: Math.sqrt(number).