import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;

/**
 * CSVReader
 */
public class CSVReader {

  public static void writeDataToFile(String filename, String line) {
    FileOutputStream fos = null;
    try {
      File file = new File(filename);
      if (!file.exists()) {
        file.createNewFile();
      }
      fos = new FileOutputStream(file, true);
      fos.write(line.getBytes());
      fos.write("\r".getBytes());
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (fos != null) {
        try {
          fos.close();
        } catch (Exception e) {
        }
      }
    }
  }

  public static void main(String[] args) {

    Scanner scanner = null;
    try {
      File file = new File("test.csv");
      if (file.exists()) {
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          String[] data = line.split(",");
          if (data.length != 4) {
            writeDataToFile("invalid.csv", line);
            continue;
          }
          System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + data[3]);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }

    writeDataToFile("greetings.txt", "Hello World!");
  }
}
