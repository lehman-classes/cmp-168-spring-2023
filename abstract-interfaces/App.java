/**
 * App
 */
public class App {

  public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pet p = new Pet();
		
		Dog d = new Dog();
		d.play();
		Dog d1 = new Dog("Fido",36,13,true, 2, "kibbles and bits","ball",4,true);

		Dog d2 = new Dog("Rompus", 120, 17, true, 8,"purina","frisbee",5,true);

		Dog d3 = new Dog("Clifford-Wally", 130, 35.5, false, 8);
		System.out.println("\nDETAILS: " +d.toString());
		System.out.println("\nDETAILS: " +d1.toString());
		System.out.println("\nDETAILS: " +d2.toString());
		System.out.println("\nDETAILS: " +d3.toString());
		
		Cat c = new Cat();
		c.setFavoriteFood("cheese");
		System.out.println("\nDETAILS: " +c.toString());
		c.play();
		System.out.println("\n****************");
		Pet [] pets = {d,c};
		for(int i=0; i<pets.length; i++){
			pets[i].play();
			pets[i].eat();
		}
		
		
	
	}
}
