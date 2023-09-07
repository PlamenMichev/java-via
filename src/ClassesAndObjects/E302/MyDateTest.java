public class MyDateTest
{
  public static void main(String[] args) {
    MyDate date = new MyDate();
    date.setDay(1);
    date.setMonth(1);
    date.setYear(1970);

    MyDate date2 = new MyDate();
    date2.setDay(12);
    date2.setMonth(5);
    date2.setYear(2003);

    System.out.println("Date: " + date.displayDate());
    System.out.println("Date: " + date2.displayDate());
  }
}
