package Intermediate.OO_5_exercises.exercise_2;

import java.net.Inet4Address;

public class Reviewer1 {
  private int[] ratings = new int[5];
  
  public void setRatings1(int movieIndex, int rating) {
    ratings[movieIndex] = rating;
  }
  
  public int getRating1(int movieIndex) {
    return ratings[movieIndex];
  }
  
  public int favorite1() {
    int max = 0;
    int maxIndex = 0;
    
    for (int i = 0; i < ratings.length; i++) {
      if (ratings[i] > max) {
        max = ratings[i];
        maxIndex = i;
      }
    }
    
    return maxIndex;
  }
}
