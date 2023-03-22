public class Test_Person {

  public static void main(String[] args) {

    Person p1 = new Person(null, 99999999);

    if (p1.getName() != null) {
      System.out.println("name should be null");
    } else {
      System.out.println("all good");
    }
  }
}
