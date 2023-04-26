import javax.swing.*;
import java.awt.event.*;

/**
 * TicTacToe
 */
public class TicTacToe extends JFrame implements ActionListener {

  private JButton[][] buttons = new JButton[3][3];
  private String currentPlayer = "X";

  /**
   * [0,0] [0,1] [0,2]
   * [1,0] [1,1] [1,2]
   * [2,0] [2,1] [2,2]
   */

  public void togglePlayer() {
    if (currentPlayer.equals("X")) {
      currentPlayer = "O";
    } else {
      currentPlayer = "X";
    }
  }

  public boolean checkRow(int row) {
    if (buttons[row][0].getText().equals(buttons[row][1].getText())
        && buttons[row][0].getText().equals(buttons[row][2].getText()) && !buttons[row][0].getText().equals("")) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkColumn(int column) {
    if (buttons[0][column].getText().equals(buttons[1][column].getText())
        && buttons[0][column].getText().equals(buttons[2][column].getText())
        && !buttons[0][column].getText().equals("")) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkDiagonal() {
    if (buttons[0][0].getText().equals(buttons[1][1].getText())
        && buttons[0][0].getText().equals(buttons[2][2].getText()) && !buttons[0][0].getText().equals("")) {
      return true;
    } else if (buttons[0][2].getText().equals(buttons[1][1].getText())
        && buttons[0][2].getText().equals(buttons[2][0].getText()) && !buttons[0][2].getText().equals("")) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkWin() {
    for (int i = 0; i < 3; i++) {
      if (checkRow(i) || checkColumn(i)) {
        return true;
      }
    }
    if (checkDiagonal()) {
      return true;
    }
    return false;
  }

  public boolean checkDraw() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (buttons[i][j].getText().equals("")) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    // This is call the Game Loop
    JButton buttonClicked = (JButton) e.getSource();
    buttonClicked.setText(currentPlayer);
    if (checkWin()) {
      JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
      System.exit(0);
    }
    if (checkDraw()) {
      JOptionPane.showMessageDialog(null, "Draw!");
      System.exit(0);
    }
    togglePlayer();
    // Game Loop End

  }

  public static void main(String[] args) {

    TicTacToe t = new TicTacToe();
    t.setVisible(true);
    t.setSize(400, 400);
    t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    t.setTitle("Tic Tac Toe");

    JPanel panel = new JPanel();
    panel.setBackground(java.awt.Color.LIGHT_GRAY);
    panel.setLayout(new java.awt.GridLayout(3, 3));
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        JButton button = new JButton();
        button.addActionListener(t);

        t.buttons[i][j] = button;
        panel.add(t.buttons[i][j]);
      }
    }
    t.add(panel);

  }

}
