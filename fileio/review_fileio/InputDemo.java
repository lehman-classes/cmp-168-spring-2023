import java.util.Scanner;
import java.io.File;

/**
 * App
 */
public class InputDemo {

  public static void main(String[] args) {

    // print "Hello World" to the output device - console
    // System.out.println("Hello World");

    Scanner scanner = null;
    try {

      // read user input from the console
      // using standard input stream (the keyboard)
      // Scanner scanner = new Scanner(System.in);
      // System.out.println("Enter your name: ");
      // String name = scanner.nextLine();
      // System.out.println("Hello " + name);

      // read from a file
      // using the Scanner class to read from a file
      File file = new File("test.txt");
      scanner = new Scanner(file);
      file.createNewFile();
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }

      File fakeFile = new File("fake.txt");
      boolean isDeleted = fakeFile.delete();
      System.out.println("isDeleted: " + isDeleted);

      // System.out.println("Roots:" + File.listRoots().length);

      File root = new File(File.listRoots()[0].getAbsolutePath());
      File[] files = root.listFiles();
      for (File f : files) {
        if (f.listFiles() != null) {
          System.out.println(f.getAbsolutePath() + " file count: " + f.listFiles().length);
        }
        // System.out.println(f.getAbsolutePath() + " " + f.isDirectory() + " " +
        // f.canExecute() + " " + f.canRead() + " "
        // + f.canWrite());
      }
      // System.out.println(file.getAbsolutePath());

      // int result = System.in.read(); // wait for user input
      // System.out.println("result: " + result);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
  }

}
