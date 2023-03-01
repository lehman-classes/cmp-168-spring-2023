public class Food {

	private String name;
	private int calories;
	private int portionSizeInOunces;
	

	public Food(String name, int calories, int portionSizeInOunces) {
		this.name = name;
		this.calories = calories;
		this.portionSizeInOunces = portionSizeInOunces;
	}
	
	public String getName() {
		return name;
	}



	public int getCalories() {
		return calories;
	}



	public int getPortionSizeInOunces() {
		return portionSizeInOunces;
	}



	@Override
	public String toString() {
		return "Food [name=" + name + ", calories=" + calories
				+ ", portionSizeInOunces=" + portionSizeInOunces + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		if( obj == null){return false;}
		if(this == obj){return true;}
		if(obj instanceof Food){
			Food otherF = (Food)obj;
		if(this.calories ==otherF.calories){
			if(this.portionSizeInOunces == otherF.portionSizeInOunces){
				//disregard food name
				return true;
			}
		}
		}
		return false;
	}


	
	
}
