
/**
 * Person
 */
public class Person extends Cat{

  private String name;
  private double weight;
  private double height;
  private int age;
  Dog[] doggies;
  private int numDogs;

  public static String staticValue = "some value";

  Person() {
    this.name = "Doe";
    this.numDogs = 0;
    this.doggies = new Dog[5];
  }

  Person(String name, double weight, double height, int age) {
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.age = age;
  }

  public static void staticMethod() {
    System.out.println("from static method");
  }

  public String getName() {
    return this.name;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getHeight() {
    return this.height;
  }

  public int getAge() {
    return this.age;
  }

  public Dog[] getDogs() {
    return this.doggies;
  }

  public String getDogsAsString() {
    // for (int i = 0; i < doggies.length; i++) {
    //   
    // }
    return "";
  }

  public Dog getDogAtIndex(int index) {
    return doggies[index];
  }

  public void speak() {

  }

  public void tellDogToSit(int index) {} 
  public void tellAllDogsToSit() {} 
  public void setName(String n) {} 
  public void setWeight(double wt) {} 
  public void setHeight(double ht) {}
  public void setAge(int a) {}

  public boolean adoptDog(Dog d) {
    if(numDogs < doggies.length) {
      doggies[numDogs] = d;
      numDogs++;
      return true;
    }
    return false;
  }
  
}
