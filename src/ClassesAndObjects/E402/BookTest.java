public class BookTest
{
  public static void main(String[] args) {
    var book1 = new Book("John Wick", "The Minister", 19.99, 300);
    var book2 = new Book("Dave Mustane", "New World Order", 25.99, 201);
    var book3 = new Book("Grim Brothers", "Winnie the pooh", 9.99, 102);

    book1.setPrice(book1.getPrice() * 0.8);
    book2.setPrice(book2.getPrice() * 0.8);
    book3.setPrice(book3.getPrice() * 0.8);

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
  }
}


