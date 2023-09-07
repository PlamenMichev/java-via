public class Job
{
  private String title;
  private double salary;
  private Person employee;

  public Job(String title, double salary, Person employee)
  {
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }

  public Job(String title, double salary)
  {
    this.title = title;
    this.salary = salary;
    this.employee = new Person();
    this.employee.setName("Not assigned");
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public double getSalary()
  {
    return salary;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public void setEmployee(Person employee)
  {
    this.employee = employee;
  }

  public void givePercantageRaise(double percantage)
  {
    this.salary = this.salary * (1 + percantage / 100);
  }
}
