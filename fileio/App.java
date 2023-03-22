import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    // Employee emp1 = new Employee("John", "Doe", 1000);
    // Employee emp2 = new Employee("Jane", "Doe", 2000);
    //
    // emp1.getEmployeeId(); // returns 1
    // emp2.getEmployeeId(); // returns 2

    File file;
    FileOutputStream fos = null;
    PrintWriter pw = null;

    try {
      file = new File("test.txt");
      file.createNewFile();

      // (1) testing file object methods and properties
      // file.createNewFile();
      // System.out.println(file.exists());
      // System.out.println(file.isFile());
      // System.out.println(file.isDirectory());
      //
      // System.out.println(file.length());
      //
      // System.out.println(file.getPath());
      // System.out.println(file.getAbsolutePath());
      // System.out.println(file.getCanonicalPath());

      // (2) reading files
      if (file.exists() && file.canRead()) {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
          System.out.println(scanner.nextLine());
        }
      } else {
        System.out.println("File is not readable");
      }

      // (3) scanner to read keyboard input
      // Scanner scanner = new Scanner(System.in);
      // System.out.print("Enter some text: ");
      // String input = scanner.nextLine();
      //
      // fos = new FileOutputStream(file, true);
      // fos.write(input.getBytes());
      // fos.write("\r".getBytes());

      // pw = new PrintWriter(new FileOutputStream(file, true));
      // pw.println(input);
      // pw.flush();
      //
      // System.out.println("You entered: " + input);

    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (fos != null) {
        try {
          fos.close();
        } catch (Exception e) {
        }
      }
      System.out.println("Done");
    }

  }
}
