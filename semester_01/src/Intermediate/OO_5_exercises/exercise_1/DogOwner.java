package Intermediate.OO_5_exercises.exercise_1;

public class DogOwner {
  private Dog dog;
  
  public DogOwner(Dog dog) {
    this.dog = dog;
  }
  
  public DogOwner() {
  }
  
  public Dog getDog() {
    return dog;
  }
  
  public void setDog(Dog dog) {
    this.dog = dog;
  }
  
  
  public boolean takeForWalk(Dog d) {
    return d.needToGo();
  }
  
}
