/**
 * App
 */
public class App {

  public static void main(String[] args) {
    
    // This app creates 3 cars of different colors

    Car obj = new Car();

    System.out.println(obj.getColor());

    Car red = new Car("red");

    Car blue = new Car("blue");

    Car yellow = new Car("yellow");

    // red.setColor("pink");

    red.stop();

    red.drive();

    blue.setColor("red");

    System.out.println(red.equals(blue));
  }
}
