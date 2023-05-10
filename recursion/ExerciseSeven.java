import java.io.File;

class ExerciseSeven {

  // recursive method to print all fille and directorie names
  public static void printAllFilesAndDirectories(String path) {

    File file = new File(path);
    if (file.exists()) {
      if (file.isDirectory()) {
        System.out.println("Directory: " + file.getName());
        File[] files = file.listFiles();
        for (File f : files) {
          printAllFilesAndDirectories(f.getAbsolutePath());
        }
      } else {
        System.out.println("File: " + file.getName());
      }
    } else {
      System.out.println("File or directory does not exist");
    } // if(file.exists()

  } // printAllFilesAndDirectories

  public static void main(String[] args) {

    // print all files and directories
    printAllFilesAndDirectories("/home/hendrix/Projects/lehman/spring2023/");

  }
}
