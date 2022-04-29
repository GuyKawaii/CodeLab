package module_1;

import javax.swing.*;
import java.awt.*;

public class HelloLabelTextField {
  public HelloLabelTextField() {
    JFrame frame = new JFrame("Hello, Label and TextField");
  
    // panel
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(0,2)); // Flow = default
    frame.add(panel);
  
    // other
    JLabel label1 = new JLabel("Label 1");
    JLabel label2 = new JLabel("Label 2");
    JLabel label3 = new JLabel("Label 3");
    JTextField textField1 = new JTextField(15);
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    panel.add(label1);
    panel.add(textField1);
    panel.add(label2);
    panel.add(textField2);
    panel.add(label3);
    panel.add(textField3);
  
    // frame
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
    new HelloLabelTextField();
  }
}
