public class Person {

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name == null ? "No name" : name;
    this.age = age;
  }

  // public String getName() {
  // return name;
  // }

  public int getAge() {
    return age;
  }

  public String toString() {
    return "Name: " + name + ", Age: " + age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Person other = (Person) obj;
    if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
      return false;
    }
    if (this.age != other.age) {
      return false;
    }
    // return true;
    return false;
  }
}
