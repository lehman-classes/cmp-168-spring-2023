class App {

  public static void main(String[] args) {

    // new instance of ObjectAll
    ObjectAll obj1 = new ObjectAll(1, 2);

    ObjectAll obj2 = new ObjectAll(3, 4);

    // print out the values of obj1
    System.out.println("obj1.a = " + obj1.getA());
    System.out.println("obj1.b = " + obj1.getB());

    // print out the values of obj2
    System.out.println("obj2.a = " + obj2.getA());
    System.out.println("obj2.b = " + obj2.getB());

    // set the values of obj1
    obj1.setA(5);
    obj1.setB(6);

    // print out the values of obj1
    System.out.println("new value obj1.a = " + obj1.getA());
    System.out.println("new value obj1.b = " + obj1.getB());

    // set the values of obj2
    obj2.setA(7);
    obj2.setB(8);

    // print out the values of obj2
    System.out.println("new value obj2.a = " + obj2.getA());
    System.out.println("new value obj2.b = " + obj2.getB());

    // call method add() on obj1
    System.out.println("obj1.add() = " + obj1.add());

    // call method add() on obj2
    System.out.println("obj2.add() = " + obj2.add());

    // new instance of ObjectAll using default constructor
    ObjectAll obj3 = new ObjectAll();

    // print out the values of obj3
    System.out.println("obj3.a = " + obj3.getA());
    System.out.println("obj3.b = " + obj3.getB());

    // add two numbers using the add()
    // method that takes two parameters
    System.out.println("obj3.add(9, 10) = " + obj3.add(9, 10));

    // use to String method
    System.out.println("obj1 = " + obj1.toString());

    // use equals method
    System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

  }
}
