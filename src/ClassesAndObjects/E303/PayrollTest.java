public class PayrollTest
{
  public static void main(String[] args) {
    Payroll payroll = new Payroll();
    payroll.setName("John Doe");
    payroll.setHourlyRate(10.0);
    payroll.setHoursWorked(40);

    Payroll payroll2 = new Payroll();
    payroll2.setName("Plamen Michev");
    payroll2.setHourlyRate(20.0);
    payroll2.setHoursWorked(40);

    System.out.println("Name: " + payroll.getName() + "\n" + "Pay: " + payroll.getGrossPay());
    System.out.println("Name: " + payroll2.getName() + "\n" + "Pay: " + payroll2.getGrossPay());
  }
}
