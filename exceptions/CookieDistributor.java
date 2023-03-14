// write a CookieDistributor class that will be used to distribute cookies to people
// the class a numPeople and numCookies instance variables
// the class has a constructor that takes in the number of people and the number of cookies
// the class has a method called distribute that will distribute the cookies evenly among the numPeople

public class CookieDistributor {

  private int numPeople;
  private int numCookies;

  public CookieDistributor(int numPeople, int numCookies) {
    this.numPeople = numPeople;
    this.numCookies = numCookies;
  }

  // create a method called getNumCookiesPerPerson that returns the number of
  // cookies per person

  public int getNumCookiesPerPerson() {
    return numCookies / numPeople;
  }

  public void distribute() {
    int cookiesPerPerson = numCookies / numPeople;
    int cookiesLeftOver = numCookies % numPeople;
    System.out.println("Each person gets " + cookiesPerPerson + " cookies.");
    System.out.println("There are " + cookiesLeftOver + " cookies left over.");
  }

  public static void main(String[] args) {
    CookieDistributor cd = new CookieDistributor(5, 25);
    cd.distribute();
  }

}
