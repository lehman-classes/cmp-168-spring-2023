public class App {
  public static void main(String[] args) {
    
    try {
      int x = Integer.valueOf(args[0], 10);
      
      System.out.println(5/x);
    } catch (Exception e) {
      // Handle exception here
      System.err.println(e.getMessage());
      System.err.println("Exception dividing by zero");

    }


    System.out.println("cool stuff happening here");
  }
}
