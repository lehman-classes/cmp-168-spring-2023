
/**
 * GuardDog
 *
 * inherits class Dog
 */
public class GuardDog extends Dog { 

  // member variables
  private String protectionMechanism;
  private int securityRating;

  // overloaded constructors
  GuardDog() {
    super("Guard Dog Doe");
  }

  GuardDog(String name) {
    super(name);
  }

  GuardDog(String name, String protectionMechanism, int securityRating) {
    super(name);
    this.protectionMechanism = protectionMechanism;
    this.securityRating = securityRating;
  }

  // getters or accessors
  public int getSecurityRating() {
    return securityRating;
  }

  public String getProtectionMechanism() {
    return protectionMechanism;
  }

  public boolean isValid(int val) {
    return val >= 1 && val <= 10;
  }

  @Override
  public String toString() {
    return super.toString() + "\nShowDog [protectionMechanism=" + protectionMechanism + ", securityRating=" + securityRating + "]";
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }
  
}
