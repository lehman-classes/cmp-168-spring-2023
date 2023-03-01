public interface FoodEater {

	static final double METABOLISM_RATING_FAST = .75;
	static final double METABOLISM_RATING_MEDIUM = .50;
	static final double METABOLISM_RATING_SLOW = .25;
	
	void eat();
	void eat(Food f);
	double metabolizeFood(Food f);
}
