package test;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
  private ArrayList<Rectangle> body;
  private int w = Game.boardWidth;
  private int h = Game.boardHeight;
  private int d = Game.boardSpacePixels;
  
  private String move; //NOTHING, UP, DOWN, LEFT, RIGHT
  
  public Snake() {
    body = new ArrayList<>();
    
    Rectangle temp = new Rectangle(Game.boardSpacePixels, Game.boardSpacePixels);
    temp.setLocation(Game.boardWidth / 2 * Game.boardSpacePixels, Game.boardHeight / 2 * Game.boardSpacePixels);
    body.add(temp);
    
    temp = new Rectangle(d, d);
    temp.setLocation((w / 2 - 1) * d, (h / 2) * d);
    body.add(temp);
    
    temp = new Rectangle(d, d);
    temp.setLocation((w / 2 - 2) * d, (h / 2) * d);
    body.add(temp);
    
    move = "NOTHING";
  }
  
  public void move() {
    if(move != "NOTHING") {
      Rectangle first = body.get(0);
      
      Rectangle temp = new Rectangle(Game.boardSpacePixels, Game.boardSpacePixels);
      
      if(move == "UP") {
        temp.setLocation(first.x, first.y - Game.boardSpacePixels);
      }
      else if(move == "DOWN") {
        temp.setLocation(first.x, first.y + Game.boardSpacePixels);
      }
      else if(move == "LEFT") {
        temp.setLocation(first.x - Game.boardSpacePixels, first.y);
      }
      else{
        temp.setLocation(first.x + Game.boardSpacePixels, first.y);
      }
      
      body.add(0, temp);
      body.remove(body.size()-1);
    }
  }
  
  public void grow() {
    Rectangle first = body.get(0);
    
    Rectangle temp = new Rectangle(Game.boardSpacePixels, Game.boardSpacePixels);
    
    if(move == "UP") {
      temp.setLocation(first.x, first.y - Game.boardSpacePixels);
    }
    else if(move == "DOWN") {
      temp.setLocation(first.x, first.y + Game.boardSpacePixels);
    }
    else if(move == "LEFT") {
      temp.setLocation(first.x - Game.boardSpacePixels, first.y);
    }
    else{
      temp.setLocation(first.x + Game.boardSpacePixels, first.y);
    }
    
    body.add(0, temp);
  }
  
  public ArrayList<Rectangle> getBody() {
    return body;
  }
  
  
  public void setBody(ArrayList<Rectangle> body) {
    this.body = body;
  }
  
  public int getX() {
    return body.get(0).x;
  }
  
  public int getY() {
    return body.get(0).y ;
  }
  
  public String getMove() {
    return move;
  }
  
  public void up() {
    move = "UP";
  }
  public void down() {
    move = "DOWN";
  }
  public void left() {
    move = "LEFT";
  }
  public void right() {
    move = "RIGHT";
  }
}