package module_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleButtons implements ActionListener {
  
  private JFrame frame = new JFrame();
  private JPanel panel = new JPanel();
  private JLabel label = new JLabel("virus: 0");
  private JButton button1 = new JButton("Click 1");
  private JButton button2 = new JButton("Click 2");
  private JButton button3 = new JButton("Click 3");
  private int virus = 0;
  
  
  public MultipleButtons() {
    panel.setPreferredSize(new Dimension(640, 480));
    panel.setBackground(Color.gray);
    
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(label);
    
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    
    
    // frame
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
    new MultipleButtons();
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button1) {
      JOptionPane.showMessageDialog(frame, "Hello your computer got virus");
      virus++;
      label.setText("virus: " + virus);
    }
  
    if (e.getSource() == button2) {
      JOptionPane.showMessageDialog(frame, "You literally got hacked bro");
      virus++;
      label.setText("virus: " + virus);
    }
  
    if (e.getSource() == button3) {
      JOptionPane.showMessageDialog(frame, "DO NOT REDEEM!!");
      virus++;
      label.setText("virus: " + virus);
    }
    
    
  }
}
