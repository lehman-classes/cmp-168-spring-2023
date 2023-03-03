/**
 * App
 */
public class App {

	public static void displayArray(Dog [] dogs){
		for(int i=0; i<dogs.length; i++){
			System.out.println("\n"+dogs[i].toString());
		}
	}
	
	
	public static void sortArray(Dog [] dogs){
		for(int i=0; i<dogs.length; i++){
			for(int j=0; j<dogs.length-1; j++){
				if(dogs[j]!=null && dogs[j+1]!=null){
					
					if(dogs[j].compareTo(dogs[j+1]) > 0 ){ //if calling object is considered greater than passed in object... swap
						Dog tempDog = dogs[j];
						dogs[j] = dogs[j+1];
						dogs[j+1] = tempDog;
					}
				}
			}
			
		}
	}

  public static void main(String[] args) {

		Dog d = new Dog();
		Dog d1 = new Dog("Fido",36,13,true, 2, "kibbles and bits","ball",4,true);
		Dog d2 = new Dog("Rompus", 120, 17, true, 8,"purina","frisbee",5,true);
		Dog d3 = new Dog("Clifford-Wally", 130, 35.5, false, 8);
		Dog d4 = new Dog();
		Dog d5 = new Dog("Gary", 100, 72, true, 10, "STEAK", "rope",3,true);
		Dog d6 = new Dog("Lio", 110, 72, true, 10, "STEAK", "rope",3,true);
		Dog d7 = new Dog("Ben", 110, 72.3, true, 10, "STEAK", "rope",3,true);
		Dog d8 = new Dog("Ben", 110, 72.4, true, 10, "STEAK", "rope",3,true);
		Dog d9 = new Dog("Ben", 110, 72.4, true, 10, "STEAK", "rope",3,true);
		
		// System.out.println("********");
		// System.out.println("d5 compare to d6 = " + d5.compareTo(d6));
		// System.out.println("d5 compare to d7 = " + d5.compareTo(d7));
		// System.out.println("d7 compare to d5 = " + d7.compareTo(d5));
		// System.out.println("d7 compare to d8 = " + d7.compareTo(d8));
		// System.out.println("d8 compare to d9 = " + d8.compareTo(d9));
		
		Dog [] allOurDogs = {d,d8,d2,d3,d4,d5,d6,d7,d1,d9};
		displayArray(allOurDogs);
		System.out.println("Will Sort now\n********");
		sortArray(allOurDogs);
		displayArray(allOurDogs);
	}
}
