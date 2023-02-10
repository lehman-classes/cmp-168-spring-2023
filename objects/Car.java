
/**
 * Car
 */
public class Car {

  // member variables
  private String color;

  // constructor
  Car() {
    this.color = "purple";
  }

  Car(String color) {
    this.color = color;
  }

  // getter
  public String getColor() {
    return color;
  }

  // setter
  public void setColor(String newColor) {
    color = newColor;
  }

  // behavior
  public void drive() {
    System.out.println("car is running");
  }

  public void stop() {
    System.out.println("car is stopped");
  }

  @Override
  public String toString() {
   return "This Car color is " + this.color; 
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null || !(obj instanceof Car) ) {
     return false; 
    } else {
      String objColor = ((Car)obj).getColor();
      if (this.color.equals(objColor)) {
       return true; 
      }
    }
    return false;
  }
}
