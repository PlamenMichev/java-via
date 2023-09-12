public class Apartment
{
  private double rent;
  private int numberOfRooms;
  private Tenant tenant;

  public Apartment(double rent, int numberOfRooms) {
    this.rent = rent;
    this.numberOfRooms = numberOfRooms;
    this.tenant = null;
  }

  public Apartment(double rent) {
    this.rent = rent;
    this.numberOfRooms = 1;
    this.tenant = null;
  }

  public double getRent() {
    return this.rent;
  }

  public int getNumberOfRooms() {
    return this.numberOfRooms;
  }

  public Tenant getTenant() {
    return tenant;
  }

  public void setRent(double rent) {
    this.rent = rent;
  }

  public boolean isAvailable() {
    return this.tenant == null;
  }

  public void rentTo(Tenant tenant) {
    this.tenant = tenant;
  }

  public void evict() {
    this.tenant = null;
  }

  public String toString() {
    var result = "The apartment has " + this.numberOfRooms + " rooms and rent " + this.rent + "DKK per month.";

    if (tenant != null) {
      result += " There is a tenant in the apartment and their name is " + tenant.getName() + ".";
    }

    return result;
  }
}
