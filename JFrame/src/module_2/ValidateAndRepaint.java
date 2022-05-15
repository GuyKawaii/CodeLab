package module_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class ValidateAndRepaint {
  private JFrame frame;
  private JPanel panel;
  private JLabel label;
  ValidateAndRepaint() {
    frame = new JFrame("ValidateAndRepaint");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel = new JPanel());
    panel.add(label = new JLabel("The label"));
    frame.setSize(300, 250);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  void run() {
    JButton button = new JButton("Click me");
    panel.add(button);
    // call frame.validate() and frame.repaint() here
    frame.validate();
    frame.repaint();
  }
  public static void main(String[] args) {
    new ValidateAndRepaint().run();
  }
}