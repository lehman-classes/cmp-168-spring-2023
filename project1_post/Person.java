public class Person {

  private String name;
  private int birthYear;

  public Person() {
    this.name = "";
    this.birthYear = 0;
  }

  public Person(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
  }

  public String getName() {
    return this.name;
  }

  public int getBirthYear() {
    return this.birthYear;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public String toString() {
    return "Person: Name: " + this.name + "| Birth Year: " + this.birthYear;
  }

  public int compareTo(Person other) {
    if (this.birthYear < other.birthYear) {
      return -1;
    } else if (this.birthYear > other.birthYear) {
      return 1;
    } else {
      return 0;
    }
  }

  public boolean equals(Object other) {
    if (other instanceof Person) {
      Person otherPerson = (Person) other;
      return this.name.equals(otherPerson.name) && this.birthYear == otherPerson.birthYear;
    } else {
      return false;
    }
  }
}
