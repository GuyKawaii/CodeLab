package module_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class HelloActionListener_2_4 {
  private JFrame frame;
  private JPanel panel;
  private JButton button;
  
  HelloActionListener_2_4() {
    frame = new JFrame("HelloActionListener");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 250);
    frame.setLocationRelativeTo(null);
    frame.add(panel = new JPanel());
    panel.add(button = new JButton("Click me!"));
    frame.setVisible(true);
    
    // Add ActionListener here
    ActionListener al2 = e -> button.setText("thanks for clicking me");
    // Then add the ActionListener to the button
    button.addActionListener(al2);
  }
  
  public static void main(String[] args) {
    new HelloActionListener_2_4();
  }
  
  
}
