/**
 * Driver_TextFileHandler
 */
public class Driver_TextFileHandler {

  public static void main(String[] args) {

    TextFileHandler handler = new TextFileHandler();
    handler.createNewFile("new_file.txt");

    handler.writeToNewFile("new_file.txt", "This is a new file.");
    //
    // handler.writeToNewFile("new_file.txt", "This is NOT a new file now.");
    //
    handler.appendToFile("new_file.txt", "This is appended to the file.");
    handler.appendToFile("new_file.txt", "This is appended to the file.");

    handler.readFileDisplayOnConsole("new_file.txt");

    // boolean copied = handler.copyFile("new_file.txt", "new_file_copy.txt");

    // System.out.println("AFTER EXCEPTION STILL PRINTS File copied: " + copied);
  }
}
