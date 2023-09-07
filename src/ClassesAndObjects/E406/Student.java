public class Student
{
  private String name;
  private char gender;
  private int number;

  public Student(String name, char gender, int number) {
    this.name = name;
    this.gender = gender;
    this.number = number;
  }

  public Student(String name, char gender) {
    this.name = name;
    this.gender = gender;
    this.number = 0;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName()
  {
    return name;
  }

  public int getNumber()
  {
    return number;
  }

  public char getGender()
  {
    return gender;
  }

  public String toString() {
    return name + "("+ gender +")" + " has a student number " + number + ".";
  }
}
