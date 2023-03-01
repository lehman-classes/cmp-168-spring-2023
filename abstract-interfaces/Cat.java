public class Cat extends Pet{

	@Override
	public void play(){
		System.out.println("MEOW!!! I will play with "+getFavoriteToy());
	}

	@Override
	public void eat() {
		System.out.println("MEOW!!! I will eat meow mix");
		
	}

	@Override
	public void eat(Food f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double metabolizeFood(Food f) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void speak() {
		System.out.println("MEOW!");
		
	}

	@Override
	public void speak(String s) {
		speak();
		System.out.println(s +" Meow!");
		
	}
	
}
