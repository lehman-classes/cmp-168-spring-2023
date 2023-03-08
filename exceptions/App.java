public class App {

  // public static boolean checkIfInputIsNumber(String input) {
  // if (input == null) {
  // return false;
  // }
  // try {
  // Integer.valueOf(input, 10);
  // } catch (Exception e) {
  // return false;
  // }
  // return true;
  // }

  public static void checkIfInputIsNumber(String input)
      throws InvalidNumberException {
    if (input == null) {
      // this StringIndexOutOfBoundsException is for illustration
      throw new InvalidNumberException("Input is null");
    }
    try {
      Integer.valueOf(input, 10);
    } catch (Exception e) {
      throw new InvalidNumberException("Input is not a number");
    }
    // throw new ArrayIndexOutOfBoundsException();
  }

  public static void main(String[] args) {

    try {
      // really really bad... because I am not checking the user input
      // int x = Integer.valueOf(args[0], 10);

      if (args.length > 0) {
        String input = args[0];

        // if you take this input and add it to a sql query it will be a sql
        // injection... BAD
        checkIfInputIsNumber(input);
        if (!input.equals("0")) {
          // if (checkIfInputIsNumber(input) && !input.equals("0")) {
          System.out.println(5 / Integer.valueOf(input, 10));
        } else {
          System.out.println("Please enter a valid number that is not zero");
        }
      }

      // } catch (StringIndexOutOfBoundsException e) {
      // // Handle exception here
      // System.err.println(e.getMessage());
      // System.err.println("StringIndexOutOfBoundsException");
      //
      // } catch (IllegalArgumentException e) {
      // // Handle exception here
      // System.err.println(e.getMessage());
      // System.err.println("IllegalArgumentException");

    } catch (InvalidNumberException e) {
      // Handle exception here
      System.err.println(e.getMessage());
      System.err.println("InvalidNumberException");

    } catch (Exception e) {
      // Handle exception here
      System.err.println(e.getMessage());
      System.err.println("Something bad happened");

    } finally {
      System.out.println("This is the finally block");
    }

    System.out.println("cool stuff happening here");
  }
}
