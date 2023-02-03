public class Demo {


  public void sayHello(String greeting) {
    System.out.println(greeting);
  }

  public void sayHello() {
    String a;
    System.out.println("Hi, there");
  }

  public static int todaysWinningNumber() {
    return 24;
  }
  
  public int add(int x, int y) {
    y = y + 9;
    return x + y;
  }

  public static void main(String[] args) {

    // DemoClass.luckyNumber();

    DemoClass dc = new DemoClass();
    dc.setLuckyNumber(3);
    
    Demo demo = new Demo();

    System.out.println("before - dc.ln = " + dc.getLuckyNumber());
    demo.add(5, dc.getLuckyNumber());
    System.out.println("after - dc.ln = " + dc.getLuckyNumber());
    //
    // // how to call a method
    // demo.sayHello();
    //
    // // this method returns a value
    // int a = 3;
    // System.out.println("before - a = " + a);
    // int i = demo.add(5, a);
    // System.out.println("after - a = " + a);
    // System.out.println(i);
    //
    // todaysWinningNumber();

  }
}
