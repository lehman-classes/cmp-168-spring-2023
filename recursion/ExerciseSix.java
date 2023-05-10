class ExerciseSix {

  // recursive method is string palindrome
  public static boolean isPalindrome(String s) {
    System.out.println("s: " + s);
    if (s.length() == 1) {
      return true;
    } else {
      return (s.charAt(0) == s.charAt(1))
          || s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1));
    }
  } // isPalindrome

  public static void main(String[] args) {

    System.out.println(isPalindrome("kayak"));
    System.out.println(isPalindrome("noon"));
    System.out.println(isPalindrome("rotator"));

  } // main(
}
