import java.util.Scanner;

public class Demo {

  public String sayHello() {
    return "Hello";
  }

  public static void main(String[] args) {
    
    // Demo demo = new Demo();
    // System.out.println(demo.sayHello());

    // using the scanner class
    Scanner scanner = new Scanner(System.in);
    System.out.print("What's your favorite number? ");
    String input = scanner.nextLine();
    int num = Integer.parseInt(input);
    System.out.printf("input: %05d\n", num);

  }
}
