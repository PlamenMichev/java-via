public class StudentTest
{
  public static void main(String[] args)
  {
    var student1 = new Student("Plamen Michev", 'M', 123456);
    var student2 = new Student("Dimitar Nizamov", 'M', 654321);
    var student3 = new Student("Female Name", 'F');

    student2.setNumber(123451);
    student1.setName("New Name");
    System.out.println(student3);
    student3.setNumber(152231);

    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3);
  }
}

