package module_2;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter_2_7 {
  private JFrame frame;
  private JPanel panel;
  private final double USD_PR_DKK;
  private final double DKK_PR_USD;
  private double quoteCurrency;
  
  CurrencyConverter_2_7() {
    // ### state
    USD_PR_DKK = 7.16;
    DKK_PR_USD = 1 / USD_PR_DKK;
    quoteCurrency = 0;
    
    // ### UI
    frame = new JFrame("Currency converter");
    panel = new JPanel();
    panel.setLayout(new FlowLayout());
    frame.add(panel);
    
    // elements
    JLabel labelBaseCurrency = new JLabel("DKK");
    JLabel labelQuoteCurrency = new JLabel("USD");
    JLabel labelConversionRate = new JLabel(String.format("%.2f USD pr. DKK", DKK_PR_USD));
    
    JTextField textFieldBaseCurrency = new JTextField(7);
    JTextField textFieldQuoteCurrency = new JTextField(String.format("%.2f", quoteCurrency), 7);
    
    JButton buttonConvert = new JButton("convert");
    JButton buttonSwitch = new JButton("switch");
    
    // layout
    panel.add(labelBaseCurrency);
    panel.add(textFieldBaseCurrency);
    panel.add(labelQuoteCurrency);
    panel.add(textFieldQuoteCurrency);
    panel.add(buttonConvert);
    panel.add(labelConversionRate);
    panel.add(buttonSwitch);
    frame.pack();
    
    // action
    buttonConvert.addActionListener(e -> {
      switch (labelBaseCurrency.getText()) {
        case "USD" -> quoteCurrency = quoteCurrency(textFieldBaseCurrency.getText(), USD_PR_DKK);
        case "DKK" -> quoteCurrency = quoteCurrency(textFieldBaseCurrency.getText(), DKK_PR_USD);
      }
      
      textFieldQuoteCurrency.setText(String.format("%.2f", quoteCurrency));
    });
    
    // action
    buttonSwitch.addActionListener(e -> {
      String tmpBaseCurrency = labelBaseCurrency.getText();
      String tmpQuoteCurrency = labelQuoteCurrency.getText();
      
      switch (tmpBaseCurrency) {
        case "DKK" -> labelConversionRate.setText(String.format("%.2f DKK pr. USD", USD_PR_DKK));
        case "USD" -> labelConversionRate.setText(String.format("%.2f USD pr. DKK", DKK_PR_USD));
      }
      
      labelBaseCurrency.setText(tmpQuoteCurrency);
      labelQuoteCurrency.setText(tmpBaseCurrency);
      
    });
    
    // frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
  private double quoteCurrency(String text, double conversionRate) {
    NumberFormat format = NumberFormat.getInstance(Locale.getDefault()); // "," or "." as decimal separator
    double quoteCurrencyAmount = 0;
    
    try {
      quoteCurrencyAmount = format.parse(text).doubleValue() * conversionRate;
      
    } catch (Exception ignored) {
    }
    
    return quoteCurrencyAmount;
  }
  
  public static void main(String[] args) {
    new CurrencyConverter_2_7();
  }
}
