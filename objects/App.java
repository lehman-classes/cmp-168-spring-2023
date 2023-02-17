/**
 * App
 */
public class App {

  public static void main(String[] args) {


    YankeeFan fan = new YankeeFan();

    YankeeFan.HiddenMetsFan mets = new YankeeFan.HiddenMetsFan();
    
    System.out.println(fan.getName());

    // Dog d1 = new Dog();
    // Dog fido = new Dog();
    // Dog scooby = new Dog("Scooby",true,3);
    // d1.setName("Cookie");
    // Person p = new Person();
    // p.adoptDog(d1);
    // p.adoptDog(fido);
    // p.adoptDog(scooby);
    //
    // Dog[] dogs = p.getDogs();
    // for (int i = 0; i < dogs.length; i++) {
    //   if(dogs[i] != null) {
    //    System.out.println(dogs[i].getName()); 
    //   }
    // }

    // Person.staticValue = "yet another value";
    //
    // Person.staticMethod();
    //
    // System.out.println(Person.staticValue);

    // int x = 5;
    // Car obj = new Car();
    // int value = obj.primitivePassing(x);
    // System.out.println("x:" + x);
    // System.out.println("value:" + value);
    //
    //
    // Dog dog = new Dog();
    // dog.setName("Lilo");
    // System.out.println("name:" + dog.getName());
    // obj.referencePassing(dog);
    // System.out.println("name:" + dog.getName());
    
    // This app creates 3 cars of different colors

    // // primitive type
    // int x = 5;
    //
    //
    // // reference type
    // // the variable obj has a reference to where the instance is located
    // Car obj = new Car();
    //
    // System.out.println(obj.getColor());
    //
    // Car red = new Car("red");
    //
    // Car blue = new Car("blue");
    //
    // Car yellow = new Car("yellow");
    //
    // // red.setColor("pink");
    //
    // red.stop();
    //
    // red.drive();
    //
    // blue.setColor("red");
    //
    // System.out.println(red.equals(blue));
  }
}
