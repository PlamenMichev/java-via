public class PersonTest
{
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("John Doe");
    person.setBirthday("01/01/1970");

    Person person2 = new Person();
    person2.setName("Plamen Michev");
    person2.setBirthday("12/05/2003");

    System.out.println("Name: " + person.getName() + "\n" + "Birthday: " + person.getBirthday());
    System.out.println("Name: " + person2.getName() + "\n" + "Birthday: " + person2.getBirthday());
  }
}
