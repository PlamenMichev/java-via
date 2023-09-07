public class PointTest
{
  public static void main(String[] args) {
    var point1 = new Point(10, 20);
    var point2 = new Point(30, 40);

    System.out.println("First point " + point1);
    System.out.println("Second point " + point2);

    point1.move(5, 5);
    point2.moveTo(50, 50);

    System.out.println("First point " + point1);
    System.out.println("Second point " + point2);

    var dist = Math.sqrt(
        Math.pow(point2.getX() - point1.getX(), 2)
            + Math.pow(point2.getY() - point1.getY(), 2));

    System.out.println("Distance between points: " + dist);
  }
}
