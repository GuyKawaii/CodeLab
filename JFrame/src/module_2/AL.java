package module_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AL implements ActionListener {
  private HelloActionListenerInterface helloActionListenerInterface;
  
  public AL(HelloActionListenerInterface helloActionListenerInterface) {
    this.helloActionListenerInterface = helloActionListenerInterface;
  }
  
  
  @Override
  public void actionPerformed(ActionEvent e) {
    helloActionListenerInterface.setButtonText("new click");
  }
}
