public class Payroll
{
  private String name;
  private double hourlyRate;
  private double hoursWorked;

  public void setName(String name)
  {
    this.name = name;
  }

  public void setHourlyRate(double hourlyRate)
  {
    this.hourlyRate = hourlyRate;
  }

  public void setHoursWorked(double hoursWorked)
  {
    this.hoursWorked = hoursWorked;
  }

  public String getName()
  {
    return name;
  }

  public double getHourlyRate()
  {
    return hourlyRate;
  }

  public double getHoursWorked()
  {
    return hoursWorked;
  }

  public double getGrossPay() {
    return hourlyRate * hoursWorked;
  }
}
