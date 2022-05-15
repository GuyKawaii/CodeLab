package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphics
    extends JPanel
    implements ActionListener{
  private Timer t = new Timer(Game.updateSPeed, this);
  public String state;
  
  private Snake s;
  private Food f;
  private Game game;
  
  public Graphics(Game g) {
    t.start();
    state = "START";
    
    game = g;
    s = g.getPlayer();
    f = g.getFood();
    
    //add a keyListener
    this.addKeyListener(g);
    this.setFocusable(true);
    this.setBackground(Color.BLACK);
    this.setFocusTraversalKeysEnabled(false);
  }
  
  public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    
    Graphics2D g2d = (Graphics2D) g;
    
    if(state == "START") {
      g2d.setColor(Color.white);
      g2d.drawString("Press Any Key", Game.boardWidth / 2 * Game.boardSpacePixels - 40, Game.boardHeight / 2 * Game.boardSpacePixels - 20);
    }
    else if(state == "RUNNING") {
      g2d.setColor(Color.red);
      g2d.fillRect(f.getX() * Game.boardSpacePixels, f.getY() * Game.boardSpacePixels, Game.boardSpacePixels, Game.boardSpacePixels);
      
      g2d.setColor(Color.green);
      for(Rectangle r : s.getBody()) {
        g2d.fill(r);
      }
    }
    else {
      g2d.setColor(Color.white);
      g2d.drawString("Your Score: " + (s.getBody().size() - 3), Game.boardWidth / 2 * Game.boardSpacePixels - 40, Game.boardHeight / 2 * Game.boardSpacePixels - 20);
    }
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    game.update();
    t.setDelay(Game.updateSPeed);
    repaint();
  }
  
}