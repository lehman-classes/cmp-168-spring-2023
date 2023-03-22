public interface TextFileDelimitedIOable {

  public void readDelimitedFileDisplayOnConsole(String fileName);

  public void readDelimitedFileDisplayOnConsole(String fileName, String delimiter);

  public String readDelimitedFile(String fileName);

  public String readDelimitedFile(String fileName, String delimiter);
}
