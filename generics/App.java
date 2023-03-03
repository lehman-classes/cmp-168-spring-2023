/**
 * App
 */
public class App {

  public static void main(String[] args) {
    
    Box<Integer> box = new Box<Integer>();
    
    box.set("some text");

    box.set(Integer.valueOf(1));

    box.set(Double.valueOf(2.0));
  }
}
