public class ShowDog extends Dog {

  // member variables
  private int numTrophies;
  private String bestFeature;

  // constructors
  ShowDog() {
    this("Show Dog Doe");
  }

  ShowDog(String name) {
    super(name);
    this.numTrophies = 0;
    this.bestFeature = "unknown";
  }

  ShowDog(int numTrophies, String bestFeature) {
    this.numTrophies = numTrophies;
    this.bestFeature = bestFeature;
  }

  ShowDog(String name, double wt, double ht, boolean isVac, int age, 
    int numTrophies, String bestFeature) {
      super(name, wt,ht,isVac, age);
      this.numTrophies = numTrophies;
      this.bestFeature = bestFeature;
  }

  // getters and setters
  public int getNumTrophies() {
    return this.numTrophies;
  }

  public String getBestFeature() {
    return this.bestFeature;
  }

  public void setNumTrophies(int numTrophies) {
    this.numTrophies = numTrophies;
  }

  public void setBestFeature(String bestFeature) {
    this.bestFeature = bestFeature;
  }

  // behaviours
  public void addTrophy() {
    numTrophies++;
  }

  public boolean isValid(int val) {
    return val >= 0;
  }

  // Override
  public String toString() {
    return super.toString() + "\nShowDog [numTrophies=" + numTrophies + ", bestFeature=" + bestFeature + "]";
  }

  public boolean equals(Object o) {
    return super.equals(o);
  }
  
}
