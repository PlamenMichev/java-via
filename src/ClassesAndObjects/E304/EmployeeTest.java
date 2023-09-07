public class EmployeeTest
{
  public static void main(String[] args) {
    var firstEmployee = new Employee();
    firstEmployee.setName("Susan Meyers");
    firstEmployee.setIdNumber(47899);
    firstEmployee.setDepartment("Accounting");
    firstEmployee.setPosition("Vice President");

    var secondEmployee = new Employee();
    secondEmployee.setName("Mark Jones");
    secondEmployee.setIdNumber(39119);
    secondEmployee.setDepartment("IT");
    secondEmployee.setPosition("Programmer");

    var thirdEmployee = new Employee();
    thirdEmployee.setName("Joy Rogers");
    thirdEmployee.setIdNumber(81774);
    thirdEmployee.setDepartment("Manufacturing");
    thirdEmployee.setPosition("Engineer");

    System.out.println("Name\t\tID Number\tDepartment\tPosition");
    System.out.println(firstEmployee.getName() + "\t" + firstEmployee.getIdNumber() + "\t\t" + firstEmployee.getDepartment() + "\t\t" + firstEmployee.getPosition());
    System.out.println(secondEmployee.getName() + "\t" + secondEmployee.getIdNumber() + "\t\t" + secondEmployee.getDepartment() + "\t\t\t" + secondEmployee.getPosition());
    System.out.println(thirdEmployee.getName() + "\t" + thirdEmployee.getIdNumber() + "\t\t" + thirdEmployee.getDepartment() + "\t\t" + thirdEmployee.getPosition());
  }
}
