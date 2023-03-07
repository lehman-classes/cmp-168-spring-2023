/**
 * App
 */
public class Tester_ShowDog {

  private static int NUM = 7;

  public void whoAmI(Dog dog) {
    System.out.println(dog.toString());
  }

  public static void main(String[] args) {

    Tester_ShowDog ts = new Tester_ShowDog();

    System.out.println(Tester_ShowDog.NUM);

    // ShowDog dog1 = new ShowDog();
    // dog1.setName("Dog1");
    // dog1.setHeight(2);
    // dog1.setWeight(10);
    // ShowDog dog2 = new ShowDog();
    // dog2.setName("Dog2");
    // dog2.setHeight(4);
    // dog2.setWeight(20);
    // ShowDog dog3 = new ShowDog();
    // dog3.setName("Dog3");
    // dog3.setNumTrophies(5);
    // dog3.setBestFeature("Dance");
    // ShowDog dog4 = new ShowDog();
    // dog4.setName("Dog4");
    // dog3.setNumTrophies(3);
    // dog3.setBestFeature("Sing");
    // ShowDog dog5 = new ShowDog();
    // dog5.setName("Dog5");
    GuardDog guardDog = new GuardDog();
    ShowDog showDog = new ShowDog();

    ts.whoAmI(guardDog);
    ts.whoAmI(showDog);

  }
}
