package module_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloAnonymousActionListener_2_5 {
  private JFrame frame;
  private JPanel panel;
  private JButton button;
  
  HelloAnonymousActionListener_2_5() {
    frame = new JFrame("HelloAnonymousActionListener");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 250);
    frame.setLocationRelativeTo(null);
    frame.add(panel = new JPanel());
    panel.add(button = new JButton("Click me!"));
    frame.setVisible(true);
    
    // Add anonymous ActionListener to button here
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        button.setText("Anonymous AL clicked!");
      }
    });
    
  }
  
  public static void main(String[] args) {
    new HelloAnonymousActionListener_2_5();
  }
}