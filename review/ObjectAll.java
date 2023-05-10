class ObjectAll {

  // member variables
  // can be of any data type
  // can be public, private, protected
  private int a;
  private int b;
  private String c; // reference type

  // constructor
  public ObjectAll() {
    this.a = 0;
    this.b = 0;
  }

  // overloaded constructor
  public ObjectAll(int a, int b) {
    this.a = a;
    this.b = b;
  }

  // getters
  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  // setters
  public void setA(int a) {
    this.a = a;
  }

  public void setB(int b) {
    this.b = b;
  }

  // add
  public int add() {
    return a + b;
  }

  // overloaded method add
  public int add(int x, int y) {
    return x + y;
  }

  @Override
  public String toString() {
    return "ObjectAll [a=" + a + ", b=" + b + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof ObjectAll))
      return false;
    ObjectAll other = (ObjectAll) obj;
    if (a != other.a)
      return false;
    if (b != other.b)
      return false;
    return true;
  }

}
