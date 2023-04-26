import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {

  public static void main(String[] args) {

    JFrame frame = new JFrame();
    // CircleDrawerExample1 panel = new CircleDrawerExample1();
    // CircleDrawerExample2 panel = new CircleDrawerExample2();
    // CircleDrawerExample3 panel = new CircleDrawerExample3();
    CircleDrawerExample4 panel = new CircleDrawerExample4();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.add(panel);
    frame.setVisible(true);

    // // two dimensional array of booleans
    // boolean[][] grid = new boolean[10][10];
    //
    // // set all elements to true
    // for (int rows = 0; rows < grid.length; rows++) {
    // for (int cols = 0; cols < grid[rows].length; cols++) {
    // grid[rows][cols] = true;
    // }
    // }
    //
    // // create two dimensional array of integers
    // int[][] grid2 = new int[10][10];
    // for (int rows = 0; rows < grid2.length; rows++) {
    // for (int cols = 0; cols < grid2[rows].length; cols++) {
    // grid2[rows][cols] = rows * cols;
    // }
    // }
    //
    // JFrame frame = new JFrame();
    // JButton[] buttons = new JButton[10];
    // JPanel panel = new JPanel();
    // panel.setLayout(new GridLayout(5, 5));
    // panel.setBackground(java.awt.Color.BLUE);
    // for (int i = 0; i < buttons.length; i++) {
    // buttons[i] = new JButton("Button " + i);
    //
    // buttons[i].addActionListener(new ActionListener() {
    // public void actionPerformed(ActionEvent e) {
    // JButton button = (JButton) e.getSource();
    // button.setText("Clicked");
    // }
    // });
    //
    // buttons[i].addFocusListener(new java.awt.event.FocusAdapter() {
    // public void focusGained(java.awt.event.FocusEvent evt) {
    // JButton button = (JButton) evt.getSource();
    // button.setText("Focused");
    // }
    // });
    // buttons[i].addKeyListener(new java.awt.event.KeyAdapter() {
    // public void keyPressed(java.awt.event.KeyEvent evt) {
    // JButton button = (JButton) evt.getSource();
    // char key = evt.getKeyChar();
    // System.out.println("Key Pressed: " + key);
    // }
    // });
    //
    // panel.add(buttons[i]);
    // }
    //
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setSize(500, 500);
    // frame.add(panel);
    // frame.setVisible(true);
    //
  }
}
