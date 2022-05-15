package module_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HelloActionListenerInterface {
  private JFrame frame;
  private JPanel panel;
  private JButton button;
  private AL al;
  private String buttonText;
  
  HelloActionListenerInterface() {
    frame = new JFrame("HelloActionListener");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 250);
    frame.setLocationRelativeTo(null);
    frame.add(panel = new JPanel());
    panel.add(button = new JButton("Click me!"));
    frame.setVisible(true);
    // Add the instance of the ActionListener implementer here
    
    al = new AL(this);
    button.addActionListener(al);
  }
  
  public String getButtonText() {
    return buttonText;
  }
  
  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }
  
  public static void main(String[] args) {
    new HelloActionListenerInterface();
  }
}
// Create your own class that implements ActionListener here
