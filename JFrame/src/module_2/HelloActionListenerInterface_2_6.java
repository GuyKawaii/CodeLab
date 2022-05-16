package module_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloActionListenerInterface_2_6 {
  private JFrame frame;
  private JPanel panel;
  public JButton button;
  
  HelloActionListenerInterface_2_6() {
    frame = new JFrame("HelloActionListener");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 250);
    frame.setLocationRelativeTo(null);
    frame.add(panel = new JPanel());
    panel.add(button = new JButton("Click me!"));
    frame.setVisible(true);
    
    // Add the instance of the ActionListener implementer here
    button.addActionListener(new LocalAL(this));
  }
  
  public JButton getButton() {
    return button;
  }
  
  public static void main(String[] args) {
    new HelloActionListenerInterface_2_6();
  }
}

// Create your own class that implements ActionListener her
class LocalAL implements ActionListener {
  HelloActionListenerInterface_2_6 helloActionListenerInterface_2_6;
  
  public LocalAL(HelloActionListenerInterface_2_6 helloActionListenerInterface_2_6) {
    this.helloActionListenerInterface_2_6 = helloActionListenerInterface_2_6;
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    helloActionListenerInterface_2_6.getButton().setText("Thanks for clicking!");
  }
}