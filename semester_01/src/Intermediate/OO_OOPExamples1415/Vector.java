package Intermediate.OO_OOPExamples1415;

import java.util.Arrays;

public class Vector {
  double[] values;
  
  public Vector(double[] values) {
    this.values = values;
  }
  
  public void add(Vector v) {
    for (int i = 0; i < values.length; i++) {
      values[i] += v.values[i];
    }
  }
  
  public double scalarProduct(Vector v) {
    return values[0] * v.values[0] + values[1] * v.values[1];
  }
  
  public void normalization() {
    double factor = magnitude();
    
    values[0] = values[0] / factor;
    values[1] = values[1] / factor;
  }
  
  public double magnitude() {
    return Math.sqrt(values[0] * values[0] + values[1] * values[1]);
  }
  
  
  @Override
  public String toString() {
    return Arrays.toString(values);
  }
}
