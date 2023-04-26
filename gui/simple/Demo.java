import javax.swing.*;
import java.awt.*;

public class Demo {

  public static void main(String[] args) {

    JFrame frame = new JFrame("Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);

    BorderLayout layout = new BorderLayout();
    JPanel panelBase = new JPanel(layout);

    JPanel panel = new JPanel();
    JButton button = new JButton("Click Me");
    JTextField text = new JTextField(10);

    panel.setBackground(Color.RED);
    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
    text.setText("Hello World");

    panel.add(text);
    panel.add(button);

    panelBase.add(panel);

    frame.add(panelBase, "Center");

    frame.add(new JLabel("One"), "West");
    frame.add(new JLabel("Two"), "East");

    frame.setVisible(true);

  }
}
