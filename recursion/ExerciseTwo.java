
import javax.swing.JOptionPane;

class ExerciseTwo {

  public static void countDown(int n) {
    if (n == 0) {
      JOptionPane.showMessageDialog(null, "Blastoff!");
    } else {
      countDown(n - 1);
      JOptionPane.showMessageDialog(null, n);
    }
  }

  public static void main(String[] args) {
    countDown(3);
  }
}
