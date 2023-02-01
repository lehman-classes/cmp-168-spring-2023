import java.util.Scanner;

public class Demo {
  
  public static void main(String[] args) {
    

    Scanner scanner = new Scanner(System.in);
    // System.out.print("Are you cold? ");
    System.out.print("Number of babies: ");
    String input = scanner.nextLine();

    int numBabies = Integer.valueOf(input);
    switch(numBabies){
        case 1:
            System.out.print("Congrats");
            break;
        case 2:
            System.out.print("Twins! "); //eliminate break to also print the next case’s instructions
        case 3:
            System.out.print("Wow!");
            break;
        case 4:
            System.out.print("Quads");
            break;
        default:
            System.out.println("Speechless");
            break;
    }
    // boolean isCold = Boolean.parseBoolean(input);

    // if(input.equalsIgnoreCase("yes")) { // condition must result in boolean value meaning true or false
    // // if( 0 == 1 || 1 == 1) { // condition must result in boolean value meaning true or false
    //   // if(true) {
    //   //
    //   // }
    //   System.out.println("Wear a jacket");
    // } else /* if (false) */ {
    //   // code here executes if condition is false
    //   System.out.println("It must be hot");
    // // } else {
    // //
    // }
  }
}
