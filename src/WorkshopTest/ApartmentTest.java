public class ApartmentTest
{
  public static void main(String[] args) {
    var firstApartment = new Apartment(4000, 2);
    var secondApartment = new Apartment(2000);
    var thirdApartment = new Apartment(5000, 3);

    firstApartment.setRent(4200);

    var firstTenant = new Tenant("Bob");
    var secondTenant = new Tenant("Maria");

    firstApartment.rentTo(firstTenant);
    secondApartment.rentTo(secondTenant);

    System.out.println(firstApartment);
    System.out.println(secondApartment);
    System.out.println(thirdApartment);
  }
}
