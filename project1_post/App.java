import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;

/**
 * App
 */
public class App {

  public static boolean isInteger(int choice) {
    return Integer.toString(choice).matches("[0-9]+");
  }

  public static void main(String[] args) {

    Person p1 = new Person("John", 1990);
    Person p2 = new Person("John", 1990);
    Person p3 = new Person("John", 1991);

    // create a menu that ask user to enter a name and birth year
    // create a person object with the name and birth year
    // add the person object to an arraylist
    // ask user if they want to add another Person
    // if yes, repeat the process
    // if no, print out the list of people

    System.out.println("Person Program");
    System.out.println("==============");
    System.out.println();

    System.out.println("1) Add a new Person");
    System.out.println("2) List all Persons");
    System.out.println("3) Exit");
    System.out.println();

    System.out.print("Enter your choice: ");

    ArrayList<Person> people = new ArrayList<Person>();
    Scanner sc = new Scanner(System.in);
    try {
      int choice = sc.nextInt();
      while (choice != 3) {
        if (choice == 1) {
          System.out.print("Enter name: ");
          String name = sc.next();
          System.out.print("Enter birth year: ");
          int birthYear = sc.nextInt();
          Person p = new Person(name, birthYear);
          people.add(p);
        } else if (choice == 2) {
          System.out.println("List of Persons");
          for (Person p : people) {
            System.out.println(p);
          }
        } else if (choice == 4) {
          System.out.println("Write to file");
          File file = new File("people.txt");
          PrintWriter writer = new PrintWriter(new FileOutputStream(file, true));
          for (Person p : people) {
            System.out.println(p);
            writer.println(p.toString());
          }
          writer.flush();
        } else {
          System.out.println("Invalid choice!");
        }

        System.out.println("1) Add a new Person");
        System.out.println("2) List all Persons");
        System.out.println("4) Write to file");
        System.out.println("3) Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("Invalid choice!");
    } finally {
      sc.close();
    }

    // while (!sc.hasNextInt()) {
    // System.out.println("Invalid choice!");
    // System.out.print("Enter your choice: ");
    // choice = sc.nextInt();
    // }
    // String selection = sc.next();
    //
    // if (isInteger(Integer.parseInt(selection))) {
    // choice = Integer.parseInt(selection);
    // } else {
    // System.out.println("Invalid choice!");
    // }

  }
}
