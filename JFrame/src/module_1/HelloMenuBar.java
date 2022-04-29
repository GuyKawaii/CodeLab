package module_1;

import javax.swing.*;
import java.awt.*;

public class HelloMenuBar {
  public HelloMenuBar() {
    JFrame frame = new JFrame("Hello, Menu bar");
    
    // panel
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    frame.add(panel);
    
    // menu
    JMenuBar menuBar = new JMenuBar();
    JMenu menuFile = new JMenu("File");
    JMenuItem menuItemNew = new JMenuItem("New");
    JMenuItem menuItemSaveAS = new JMenuItem("Save As ...");
    JMenuItem menuItemExit = new JMenuItem("Exit");
    
    menuFile.add(menuItemNew);
    menuFile.add(menuItemSaveAS);
    menuFile.add(menuItemExit);
    menuBar.add(menuFile);
    frame.setJMenuBar(menuBar);
    
    // frame
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
    new HelloMenuBar();
  }
}
