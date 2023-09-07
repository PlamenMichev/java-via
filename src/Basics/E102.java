public class E102
{
  public static void main(String[] args)
  {
    String firstName = "Plamen";
    String middleName = "Plamenov";
    String lastName = "Michev";
    char firstInitial = 'P';
    char middleInitial = 'P';
    char lastInitial = 'M';

    System.out.println(String.format("Hi! My name is %s and my initials are %s.", firstName + " " + middleName + " " + lastName,
        firstInitial + "." + middleInitial + "." + lastInitial));
  }
}
