package module_1;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class HelloLabel {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello, Label");
    
    JPanel panel = new JPanel();
    frame.add(panel);
  
    JLabel label1 = new JLabel("Hello, label");
    label1.setPreferredSize(new Dimension(300, 20));
    panel.add(label1);
    
    frame.setLocationRelativeTo(null);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
