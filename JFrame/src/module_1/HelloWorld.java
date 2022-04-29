package module_1;

import javax.swing.*;

public class HelloWorld {
  public HelloWorld() {
    JFrame frame = new JFrame("Hello, World");
  
    JPanel panel = new JPanel();
    frame.add(panel);
  
  
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // center on screen
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
    new HelloWorld();
  }
  
  
}
