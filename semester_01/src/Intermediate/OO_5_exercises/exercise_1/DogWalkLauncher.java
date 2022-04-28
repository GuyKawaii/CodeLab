package Intermediate.OO_5_exercises.exercise_1;


public class DogWalkLauncher {
  public static void main(String[] args) {
    DogOwner o1 = new DogOwner();
    Dog d1 = new Dog(3);
    Dog d2 = new Dog(6);
  
    System.out.println(o1.takeForWalk(d1));
    System.out.println(o1.takeForWalk(d2));
  }
}
