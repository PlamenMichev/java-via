public class Temperature
{
  private double ftemp;

  public Temperature(double ftemp) {
    this.ftemp = ftemp;
  }

  public void setFahrenheit(double ftemp) {
    this.ftemp = ftemp;
  }

  public double getFahrenheit() {
    return ftemp;
  }

  public double getCelsius() {
    return (5.0/9.0) * (this.ftemp - 32);
  }

  public double getKelvin() {
    return (5.0/9.0) *  (this.ftemp - 32) + 273;
  }
}

//    l getCelsius—Returns the value of the ftemp field converted to Celsius.
//    l getKelvin—Returns the value of the ftemp field converted to Kelvin.

//
//    Use the following formula to convert the Fahrenheit temperature to Celsius:
//    Celsius 5
//    Use the following formula to convert the Fahrenheit temperature to Kelvin:
//    Kelvin 5 ((5/9) 3 (Fahrenheit 2 32)) 1 273
//    Demonstrate the Temperature class by writing a separate program that asks the user for a
//    Fahrenheit temperature. The program should create an instance of the Temperature class,
//    with the value entered by the user passed to the constructor. The program should then call
//    the object’s methods to display the temperature in Celsius and Kelvin.