package Intermediate.OO_OOPExamples1415;

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseSheet {
  // 2A
  public int sum(int[] a) {
    int arraySum = 0;
    
    for (int value : a) {
      arraySum += value;
    }
    
    return arraySum;
  }
  
  public int[] cumSum(int[] a) {
    int[] sumArray = new int[a.length];
    int sum = 0;
    
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
      sumArray[i] = sum;
    }
    
    return sumArray;
  }
  
  public ArrayList<Integer> positives(int[] a) {
    ArrayList<Integer> positive = new ArrayList<>();
    
    for (int value : a) {
      if (value >= 0) {
        positive.add(value);
      }
    }
    return positive;
  }
  
  // 4B
  public int[][] transpose(int[][] array2d) {
    int x = array2d[0].length;
    int y = array2d.length;
    
    int[][] transpose2d = new int[x][y];
    
    for (int i = 0; i < y; i++) {
      for (int j = 0; j < x; j++) {
        transpose2d[j][i] = array2d[i][j];
      }
    }
    
    return transpose2d;
  }
  
  // Pretty print 2d-array
  public static void convertToString(int arr[][]) {
    
    for (int n = 0; n < arr.length; n++) {
      System.out.println(Arrays.toString(arr[n]));
    }
    
  }
  
  // RUN PROGRAM
  public static void main(String[] args) {
    new ExerciseSheet().go();
  }
  
  public void go() {
    // 2 A
    System.out.println("2 A");
    
    int[] array = new int[]{1, -3, 5, -7, 9};
    System.out.println("Original: " + Arrays.toString(array));
    System.out.println("Sum: " + sum(array));
    System.out.println("Cumulative sum: " + Arrays.toString(cumSum(array)));
    System.out.println("Positive: " + positives(array));
    
    // 4 B
    System.out.println("\n4 B");
    int[][] array2d = new int[][]{{11, 12, 13}, {21, 22, 23}};
    
    System.out.println("Original");
    convertToString(array2d);
    System.out.println("Transpose");
    convertToString(transpose(array2d));
    
    // 8 B
    /*
    THE LOCAL SCOPE SHADOWS THE GLOBAL SCOPE
    
    public void vectorAdd ( int x, int y, int dx, int dy){
      x = x + dx;
      y = y + dy;
    }
    
    NEW SETUP
    public void vectorAdd ( int[] vector, int dx, int dy){
      vector[0] += dx;
      vector[1] += dy;
    }
    
    public static void main (String[]args){
      int[] vector = new int[] {1,0};
      vectorAdd(a, b, 1, 1);
      System.out.println(a +’’ ‘‘ + b);
      // (a,b) is still (0,2)
    }
    */
    
    // 10 C
    /*
    using reference on primitive types could cause confusion as there will be mutation everywhere, although
    some functions would not need to be fruitful to mutate and reassign.
     */
    
    // 11 B
    // missing b) c)
    System.out.println("\n11 B");
    Vector v1 = new Vector(new double[]{1, 2});
    Vector v2 = new Vector(new double[]{3, 4});
    
    
    System.out.println("Original v1: " + v1);
    System.out.println("Original v2: " + v2);
    v1.add(v2);
    System.out.println("v1 + v2: " + v1);
    
    // 12 B
    //  missing c)
    System.out.println("\n12 B");
    
    // connect linked list
    LinkedList list1 = new LinkedList(new LinkedListElement(10));
    list1.pushHead(new LinkedListElement(20));
    list1.pushHead(new LinkedListElement(30));
    list1.pushHead(new LinkedListElement(40));
    
    System.out.println("head value: " + list1.getHeadValue());
    System.out.println("List length: " + list1.getLength());
    System.out.println("Get index[0] value: " + list1.getIndexValue(0));
    System.out.println("Get index[1] value: " + list1.getIndexValue(1));
    System.out.println("Get index[2] value: " + list1.getIndexValue(2));
    System.out.println("Get index[3] value: " + list1.getIndexValue(3));
    System.out.println("Get index[4] value: " + list1.getIndexValue(4));
  
  
    System.out.println("Remove head: " + list1.popHead());
  
    list1.pushHead(new LinkedListElement(40));
    System.out.println("Add l4 new head: " + list1.getHeadValue());
    System.out.println("Get index[0] value: " + list1.getIndexValue(0));
    System.out.println("Get index[1] value: " + list1.getIndexValue(1));
    System.out.println("Get index[2] value: " + list1.getIndexValue(2));
    System.out.println("Get index[3] value: " + list1.getIndexValue(3));
    System.out.println("Get index[4] value: " + list1.getIndexValue(4));
  
    // 14 A
    // Vec3d is not a type of vec2d like a car is a type of vehicle
    
    
  }
  
}
