public class CarTest
{
  public static void main(String[] args) {
    var car = new Car(2019, "Tesla");

    for (int i = 0; i < 5; i++) {
      car.accelerate();
      System.out.println("Current speed: " + car.getSpeed());
    }

    for (int i = 0; i < 5; i++) {
      car.brake();
      System.out.println("Current speed: " + car.getSpeed());
    }
  }
}
