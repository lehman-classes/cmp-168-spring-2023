
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

  public int primitivePassing(int num) {
    num = num * 2;
    return num;
  }

  public void referencePassing(Dog dog) {
    dog.setName("NEW NAME");
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
    } 

    if (this == obj) {
      return true;
    }

    String objColor = ((Car)obj).getColor();
    if (this.color.equals(objColor)) {
     return true; 
    }

    return false;
  }
}
