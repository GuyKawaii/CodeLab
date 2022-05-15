package module_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloActionListener {
  private JFrame frame;
  private JPanel panel;
  private JButton button;
  
  HelloActionListener() {
    frame = new JFrame("HelloActionListener");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 250);
    frame.setLocationRelativeTo(null);
    frame.add(panel = new JPanel());
    panel.add(button = new JButton("Click me!"));
    frame.setVisible(true);
    // Add ActionListener here
    ActionListener al2 = e -> button.setText("new text");
    ActionListener al3 = e -> button.setText("new 2text2");
    
    // Then add the ActionListener to the button
    button.addActionListener(al2);
  }
  
  public static void main(String[] args) {
    new HelloActionListener();
  }
  

}
