// video link
// https://youtube.com/abc

public class Driver_Person {

  public static void main(String[] args) {
    Person p1 = new Person("John", 25);
    Person p2 = new Person("Jane", 24);
    Person p3 = new Person("John", 25);

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
  }
}
