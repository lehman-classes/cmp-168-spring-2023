/**
 * Driver_DelimitedFiles
 */
public class Driver_DelimitedFiles {

  public static void main(String[] args) {

    TextFileHandler handler = new TextFileHandler();

    handler.createNewFile("new_file.csv");

    handler.writeToNewFile("new_file.csv", "12345, Name, 123.45");

    handler.readDelimitedFileDisplayOnConsole("new_file.csv", ",");

  }
}
