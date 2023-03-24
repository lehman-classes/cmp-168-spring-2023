import java.io.FileOutputStream;
import java.io.PrintWriter;

public class OutputDemo {

  public static void main(String[] args) {

    // print a message to the standard output (the console)
    System.out.println("Hello World!");

    // print a message to the standard error (the console)
    System.err.println("Hello Error!");

    // write a message to a file
    PrintWriter out = null;
    try {
      out = new PrintWriter(new FileOutputStream("output.txt", true));
      out.println("Hello File!");
    } catch (java.io.IOException e) {
      System.err.println("Error writing to file");
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }
}
