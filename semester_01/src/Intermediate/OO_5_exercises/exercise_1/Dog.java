package Intermediate.OO_5_exercises.exercise_1;

public class Dog {
  private int drinkTime;
  
  public Dog(int drinkTime) {
    this.drinkTime = drinkTime;
  }
  
  public Dog() {
    drinkTime = 0;
  }
  
  public int getDrinkTime() {
    return drinkTime;
  }
  
  public void setDrinkTime(int drinkTime) {
    this.drinkTime = drinkTime;
  }
  
  public boolean needToGo() {
    return drinkTime > 4;
  }
}
