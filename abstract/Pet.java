public abstract class Pet{ 
private String favoriteFood;
	private String favoriteToy;
	private int maintenanceLevel;
	private boolean goesOutside;

public abstract void play();		//an abstract method has no method body

public Pet(){ 	//cannot directly create an instance of Pet even though it has a constructor
		favoriteFood = "unkown food";
		favoriteToy = "unkown toy";
		maintenanceLevel = 0;
		goesOutside = false;
	}

/*more code here*/ 

}

