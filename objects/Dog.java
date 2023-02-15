
/**
 * Dog
 */
public class Dog {

  private String name;
  private double weight;
  private double height;
  private boolean isVaccinated;
  private int ageInDogYears;

  Dog() {
    this.name = "doggy doe";
  }

  Dog(String name, boolean vaccinated, int ageInDogYears) {
    this.name = name;
    this.isVaccinated = vaccinated;
    this.ageInDogYears = ageInDogYears;
  }

  public String getName() {
    return this.name;
  }

  public double getWeight() {
    return this.weight;
  }
  
  public double getHeight() {
    return this.height;
  }

  public boolean getIsVaccinated() {
    return this.isVaccinated;
  }

  public int getAgeInDogYears() {
    return this.ageInDogYears;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setIsVaccinated(boolean isVacc) {
    this.isVaccinated = isVacc;
  }

  public void setAgeInDogYears(int age) {
    this.ageInDogYears = age;
  }
  
}
