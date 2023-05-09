import javax.swing.JOptionPane;

class ExerciseOne {

  public static void countDown(int n) {
    if (n == 0) {
      JOptionPane.showMessageDialog(null, "Blastoff!");
    } else {
      JOptionPane.showMessageDialog(null, n);
      countDown(n - 1);
    }
  }

  public static void main(String[] args) {
    countDown(3);
  }
}
