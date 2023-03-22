import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

/**
 * TextFileHandler
 */
public class TextFileHandler implements TextFileIOable, TextFileDelimitedIOable {

  private PrintWriter getPrintWriter(String fileName, boolean append) {
    PrintWriter pw = null;
    try {
      pw = new PrintWriter(new FileWriter(fileName), append);
    } catch (IOException e) {
      System.err.println("Error creating file: " + fileName);
      e.printStackTrace();
    }
    return pw;
  }

  private PrintWriter getPrintWriter(String fileName) {
    return getPrintWriter(fileName, false);
  }

  private void closePrintWriter(PrintWriter pw) {
    if (pw != null) {
      pw.close();
    }
  }

  @Override
  public void createNewFile(String fileName) {
    PrintWriter pw = getPrintWriter(fileName);
    closePrintWriter(pw);
  }

  @Override
  public void writeToNewFile(String fileName, String text) {
    PrintWriter pw = getPrintWriter(fileName);
    if (pw != null) {
      pw.println(text);
    }
    closePrintWriter(pw);
  }

  @Override
  public void appendToFile(String fileName, String text) {
    PrintWriter pw = getPrintWriter(fileName, true);
    if (pw != null) {
      pw.println(text);
    }
    closePrintWriter(pw);
  }

  @Override
  public String readFile(String fileName) {
    Scanner sc = null;
    String text = "";
    try {
      sc = new Scanner(new File(fileName));
      while (sc.hasNextLine()) {
        text += sc.nextLine() + "\n";
      }
    } catch (Exception e) {
      System.err.println("Error reading file: " + fileName);
      e.printStackTrace();
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
    return text;
  }

  @Override
  public void readFileDisplayOnConsole(String fileName) {
    Scanner sc = null;
    try {
      sc = new Scanner(new File(fileName));
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (Exception e) {
      System.err.println("Error reading file: " + fileName);
      e.printStackTrace();
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }

  @Override
  public boolean copyFile(String origFileName) {
    Scanner sc = null;
    PrintWriter pw = null;
    try {
      sc = new Scanner(new File(origFileName));
      pw = new PrintWriter(new FileWriter(origFileName + ".copy"));
      while (sc.hasNextLine()) {
        pw.println(sc.nextLine());
      }
    } catch (Exception e) {
      System.err.println("Error reading file: " + origFileName);
      e.printStackTrace();
      return false;
    } finally {
      if (sc != null) {
        sc.close();
      }
      if (pw != null) {
        pw.close();
      }
    }
    return true;
  }

  @Override
  public boolean copyFile(String origFileName, String copiedFileName) {
    Scanner sc = null;
    PrintWriter pw = null;
    try {
      sc = new Scanner(new File(origFileName));
      pw = new PrintWriter(new FileWriter(copiedFileName));
      while (sc.hasNextLine()) {
        pw.println(sc.nextLine());
      }
    } catch (Exception e) {
      System.err.println("Error reading file: " + origFileName);
      e.printStackTrace();
      return false;
    } finally {
      if (sc != null) {
        sc.close();
      }
      if (pw != null) {
        pw.close();
      }
    }
    return true;
  }

  @Override
  public boolean deleteFile(String fileName) {
    File file = new File(fileName);
    if (file.exists()) {
      return file.delete();
    }
    return false;
  }

  @Override
  public void writeToFileFromKeyboard(String fileName) {
    PrintWriter pw = null;
    Scanner sc = null;
    try {
      pw = new PrintWriter(new FileWriter(fileName));
      sc = new Scanner(System.in);
      String text = "";
      while (!text.equals("quit")) {
        text = sc.nextLine();
        pw.println(text);
      }
    } catch (IOException e) {
      System.err.println("Error creating file: " + fileName);
      e.printStackTrace();
    } finally {
      if (pw != null) {
        pw.close();
      }
      if (sc != null) {
        sc.close();
      }
    }
  }

  @Override
  public boolean findAndReplaceContentInFile(String fileName, String originalText, String replacementText) {
    PrintWriter pw = null;
    Scanner sc = null;
    File file = new File(fileName);
    File tmpFile = new File(fileName + ".temp");
    try {
      sc = new Scanner(file);
      pw = new PrintWriter(new FileWriter(tmpFile));
      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        if (line.contains(originalText)) {
          line = line.replace(originalText, replacementText);
        }
        pw.println(line);
      }

      if (file.delete()) {
        tmpFile.renameTo(file);
        return true;
      }
    } catch (Exception e) {
      System.err.println("Error reading file: " + fileName);
      e.printStackTrace();
      return false;
    } finally {
      if (sc != null) {
        sc.close();
      }
      if (pw != null) {
        pw.close();
      }
    }
    return false;
  }

  @Override
  public void readFileChosenUsingFileChooser() {
    System.out.println("Not implemented yet");
  }

  @Override
  public String readDelimitedFile(String fileName) {
    Scanner sc = null;
    String text = "";
    try {
      sc = new Scanner(new File(fileName));
      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        String[] tokens = line.split(",");
        for (String token : tokens) {
          text += token + "\t";
        }
      }
    } catch (Exception e) {
      System.err.println("Error reading file: " + fileName);
      e.printStackTrace();
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
    return text;
  }

  @Override
  public String readDelimitedFile(String fileName, String delimiter) {
    Scanner sc = null;
    String text = "";
    try {
      sc = new Scanner(new File(fileName));
      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        String[] tokens = line.split(delimiter);
        for (String token : tokens) {
          text += token + "\t";
        }
      }
    } catch (Exception e) {
      System.err.println("Error reading file: " + fileName);
      e.printStackTrace();
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
    return text;
  }

  @Override
  public void readDelimitedFileDisplayOnConsole(String fileName) {
    Scanner sc = null;
    try {
      sc = new Scanner(new File(fileName));
      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        String[] tokens = line.split(",");
        for (String token : tokens) {
          System.out.print(token + "\t");
        }
        System.out.println();
      }
    } catch (Exception e) {
      System.err.println("Error reading file: " + fileName);
      e.printStackTrace();
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }

  @Override
  public void readDelimitedFileDisplayOnConsole(String fileName, String delimiter) {
    Scanner sc = null;
    try {
      sc = new Scanner(new File(fileName));
      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        System.out.println(line);
        String[] tokens = line.split(delimiter);
        for (String token : tokens) {
          System.out.print(token + "\t");
        }
        System.out.println();
      }
    } catch (Exception e) {
      System.err.println("Error reading file: " + fileName);
      e.printStackTrace();
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }
}
