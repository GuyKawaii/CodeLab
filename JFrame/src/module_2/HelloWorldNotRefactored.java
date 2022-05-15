package module_2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldNotRefactored {
  // 1. Move JFrame and JLabel to attributes right under class declaration
  private JFrame frame;
  private JLabel label;
  private String[] labels;
  
  public HelloWorldNotRefactored() {
    frame = new JFrame();
    label = new JLabel();
    
    labels = new String[]{"new1", "new2", "new3"};
    
    // 2. Move this segment to constructor:
    frame = new JFrame("HelloWorldRefactored");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(label = new JLabel("The label"));
    frame.setSize(300, 200);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
  public void run() {
    for (String labelText : labels) {
      // 3. Move this segment to run() method
      try {
        Thread.sleep(1000);
      } catch (Exception e) { }
      
      label.setText(labelText);
    }
 
  }
  
  public static void main(String[] args) {
    // 4. Finally, let main() method create an instance of class and call run() method
    new HelloWorldNotRefactored().run();
  }
  
}