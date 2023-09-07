
public class JobTest
{
  public static void main(String[] args) {
    var job1 = new Job("Programmer", 10000, new Person());
    var job2 = new Job("Accountant", 5000);

    System.out.println("First job title " + job1.getTitle());
    System.out.println("First job salary " + job1.getSalary());
    System.out.println("First job employee name " + job1.getEmployee().getName());

    job2.setTitle("Manager");
    job2.setSalary(20000);
    job2.setEmployee(new Person());

    System.out.println("Second job title " + job2.getTitle());
    System.out.println("Second job salary " + job2.getSalary());
    System.out.println("Second job employee name " + job2.getEmployee().getName());

    job1.givePercantageRaise(10);
    job2.givePercantageRaise(20);

    System.out.println("First job salary increased " + job1.getSalary());
    System.out.println("Second job salary increased " + job2.getSalary());
  }
}
