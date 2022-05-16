package module_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton_2_3 {
  private JFrame frame;
  private JPanel panel;
  private JButton button;
  
  HelloButton_2_3() {
    frame = new JFrame("HelloButton");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 250);
    frame.setLocationRelativeTo(null);
    frame.add(panel = new JPanel());
    
    // Add JButton here
    panel.add(button = new JButton("Click A"));
    panel.add(button = new JButton("Click B"));
    
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
    new HelloButton_2_3();
  }
}
