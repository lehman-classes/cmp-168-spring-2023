public class JavaTypes {

  private String name = "JavaTypes";
  private int age = 1;

  public static void someMethod() {
    System.out.println("someMethod()");
  }

  public int methodPassingPrimitive(int lucky) {
    System.out.println("methodPassingPrimitive(int lucky)");
    lucky = 7;
    System.out.println("lucky = " + lucky);

    someMethod();
    return lucky;
  }

  public void methodPassingReference(String name) {
    System.out.println("methodPassingReference(String name)");
    name = "New Name";
    System.out.println("name = " + name);
  }

  public JavaTypes methodPassingReference(JavaTypes j) {
    System.out.println("methodPassingReference(JavaTypes obj)");
    j.name = "New Name";
    System.out.println("obj.name = " + j.name);
    return j;
  }

  public static void main(String[] args) {

    // Primitive Types
    int num = 1;
    char letter = 'a';
    // to print the value of a variable num
    // we need to get the variable that points to the value in the stack
    System.out.println(num);

    // Reference Types
    String str = "Hello World!";

    // Call a method
    someMethod();

    // Create an object
    JavaTypes obj = new JavaTypes();
    // to get the value of a field name
    // we need to get the variable that points to the object in the heap
    System.out.println(obj.name);

    // Call a method
    int returnValue = obj.methodPassingPrimitive(num);
    System.out.println("num = " + num);
    System.out.println("returnValue = " + returnValue);

    // Call a method
    obj.methodPassingReference(str);
    System.out.println("str = " + str);

    // Call a method
    JavaTypes returnTypes = obj.methodPassingReference(obj);
    System.out.println(obj.name);
    System.out.println(obj);
    System.out.println(returnTypes);
  }
}
