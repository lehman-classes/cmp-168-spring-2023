public abstract class Pet implements FoodEater, Communicator {
	
	private String favoriteFood;
	private String favoriteToy;
	private int maintenanceLevel;
	private boolean goesOutside;
	
	public Pet(){
		favoriteFood = "some food";
		favoriteToy = "some toy";
		maintenanceLevel = 0;
		goesOutside = false;
	}
	public Pet(String faveFood, String faveToy, int maintLevel, boolean goesOut){
		favoriteFood = faveFood;
		favoriteToy = faveToy;
		maintenanceLevel = maintLevel;
		goesOutside = goesOut;
	}
	//our abstract method will be overridden and provided a proper body in any class that inherits from Pet
	public abstract void play();
	
	public String getFavoriteFood() {
		return favoriteFood;
	}
	public String getFavoriteToy() {
		return favoriteToy;
	}
	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}
	public boolean isGoesOutside() {
		return goesOutside;
	}
	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	public void setFavoriteToy(String favoriteToy) {
		this.favoriteToy = favoriteToy;
	}
	public void setMaintenanceLevel(int maintenanceLevel) {
		this.maintenanceLevel = maintenanceLevel;
	}
	public void setGoesOutside(boolean goesOutside) {
		this.goesOutside = goesOutside;
	}
	
	@Override
	public String toString(){
		String s = "Pet[ favorite food="+favoriteFood+
				", favorite toy="+favoriteToy+
				", maintenance level="+maintenanceLevel;
		if(goesOutside){s+= ", goes outside]";}
		else{s+= ", does not go outside]";}
		return s;
	}
	
	//equals method

}
