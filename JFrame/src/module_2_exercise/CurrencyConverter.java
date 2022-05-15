package module_2_exercise;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
  private JFrame frame;
  private JPanel panel;
  private JButton button;
  private final double USD_PR_DKK = 7.16;
  private double usd = 0;
  
  CurrencyConverter() {
    frame = new JFrame("Currency converter");
    panel = new JPanel();
    panel.setLayout(new FlowLayout());
    frame.add(panel);
    
    // elements
    JLabel labelDKK = new JLabel("DKK");
    JLabel labelUSD = new JLabel("USD");
    JLabel labelUSDPrDKK = new JLabel(String.format("%.2f USD pr. DKK", USD_PR_DKK));
    
    JTextField textFieldDKK = new JTextField(7);
    JTextField textFieldUSD = new JTextField(String.format("%.2f", usd), 7);
    
    button = new JButton("convert");
    
    // layout
    panel.add(labelDKK);
    panel.add(textFieldDKK);
    panel.add(labelUSD);
    panel.add(textFieldUSD);
    panel.add(button);
    panel.add(labelUSDPrDKK);
    frame.pack();
    
    // action
    button.addActionListener(e -> {
      usd = usdPrDkk(textFieldDKK.getText());
      textFieldUSD.setText(String.format("%.2f", usd));
    });
    
    // frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
  private double usdPrDkk(String text) {
    NumberFormat format = NumberFormat.getInstance(Locale.getDefault()); // "," or "." as decimal separator
    double USD = 0;
    
    try {
      USD = format.parse(text).doubleValue() * USD_PR_DKK;
      
    } catch (Exception ignored) {
    }
    
    return USD;
  }
  
  public static void main(String[] args) {
    new CurrencyConverter();
  }
}
