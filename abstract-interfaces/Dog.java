public class Dog extends Pet implements Comparable<Dog> {//class declaration

	private static int numDogs = 0; // counter controlled within the class
	//member variables
	private int dogNumber;
	private String name;
	private double weight;
	private double height;
	private boolean isVaccinated;
	private int ageInDogYears;
	

	@Override
	public void play() {
		System.out.println("WOOF! I will play with "+getFavoriteToy());
	}

  @Override
  public int compareTo(Dog anotherDog) {

    if(this.dogNumber < anotherDog.dogNumber) {
      return -1;
    } else if( this.dogNumber > anotherDog.dogNumber) {
      return 1;
    }
    return 0;
  }
	
	
	public Dog(){//default constructor
		super();
		numDogs++;//increment the counter
		dogNumber = numDogs; //assign to the member variable
		name = "doggy Doe";
		weight = 0.0;
		height = 0.0;
		isVaccinated = false;
		ageInDogYears = 0;
	}

	public Dog(String name){//overloaded constructor
		this();//default constructor
		this.name = name;
	}

	public Dog(String name, double weight, double height){//overloaded constructor
		this();//default constructor
		this.name = name;
		if(isValid(weight)){ this.weight = weight;}
		if(isValid(height)){this.height = height;}
	}
	public Dog(String name, boolean isVaccinated, int ageInDogYears){//overloaded constructor
		this();//default constructor
		this.name = name;
		this.isVaccinated = isVaccinated;
		if(isValid(ageInDogYears)){this.ageInDogYears = ageInDogYears;}
	}
	public Dog(String name, double weight, double height, boolean isVaccinated, int ageInDogYears){//overloaded constructor
		super();
		numDogs++;//increment the counter
		dogNumber = numDogs; //assign to the member variable
		this.name = name;
		if(isValid(weight)){ this.weight = weight;}
		if(isValid(height)){this.height = height;}
		this.isVaccinated = isVaccinated;
		if(isValid(ageInDogYears)){this.ageInDogYears = ageInDogYears;}
	}
	public Dog(String name, double weight, double height, boolean isVaccinated, int ageInDogYears,
			String faveFood, String faveToy, int maintLevel, boolean goesOut){//overloaded constructor
		super(faveFood,faveToy,maintLevel,goesOut);
		numDogs++;//increment the counter
		dogNumber = numDogs; //assign to the member variable
		this.name = name;
		if(isValid(weight)){ this.weight = weight;}
		if(isValid(height)){this.height = height;}
		this.isVaccinated = isVaccinated;
		if(isValid(ageInDogYears)){this.ageInDogYears = ageInDogYears;}
	}

	
	public static int getNumDogs(){
		return numDogs;
	}
	public int getDogNumber(){
		return dogNumber;
	}
	
	
	protected boolean isValid(double val){
		return val >= 0 ;
	}

	protected boolean isValid(int val){
		return val >= 0 ;
	}
	
	//mutator methods
	public void setName(String name){
		this.name = name;
	}
	public void setWeight(double wt){
		if(isValid(wt)){ this.weight = wt;}
	}
	public void setHeight(double ht){
		if(isValid(ht)){this.height = ht;}
	}
	public void setAgeInDogYears(int age){
		if(isValid(age)){this.ageInDogYears = age;}
	}
	public void setIsVaccinated(boolean isVacc){
		isVaccinated = isVacc;
	}
	
	//accessor methods
	public String getName(){
		return name;
	}
	public double getWeight(){
		return weight;
	}
	public double getHeight(){
		return height;
	}
	public boolean isVaccinated(){
		return isVaccinated;
	}
	public int getAgeInDogYears(){
		return ageInDogYears;
	}
	
	//example of a calculated method
	public int getAgeInHumanYears(){
		return   ageInDogYears * 7;
	}
	//example of a calculated method
	public int getBodyMassIndex(){
		return 0; //height * weight / someValue 
	}
	//more methods here
	public void speak(){
		System.out.println("woof");
	}
	public void speak(String s){
		speak();//call the other speak method
		System.out.println(s);
	}
	public void sit(){
		System.out.println("I "+this.name+" will sit now.");
	}
	
	@Override
	public String toString(){
		String s = super.toString()+ "\nDog [dog number= "+dogNumber+", name=" + name + ", age="+ageInDogYears+
				", weight=" + weight + ", height=" + height + ", " ;
			if(isVaccinated){
				s += "is vaccinated";
			}
			else{
				s += "is not vaccinated";
			}
		return s;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null){return false;}
		if(obj == this){return true;}
		if(obj instanceof Dog){
			Dog otherD = (Dog)obj;
			
			if(this.ageInDogYears == otherD.ageInDogYears){
				if( Math.abs(this.height-otherD.height) < 0.5){
					if( Math.abs(this.weight-otherD.weight) < 0.5){
						if(this.isVaccinated ==  otherD.isVaccinated){
							if( this.name != null && otherD.name != null){
								if(this.name.equalsIgnoreCase(otherD.name)){
									return true;//all member variables for both objects match
								}
							}
						}
					}
				}
			}
			
		}
		return false;
	}


	@Override
	public void eat() {
		System.out.println("WOOF! I will eat "+getFavoriteFood());
		
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

	
	
	
	
	
	
}
