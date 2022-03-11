package Basic;

import java.util.Arrays;

public class Arrays7 {
	
	// 1
	// a) - sum of all elements
	// b) - sum of all elements with even index
	// b) - sum of all elements with odd index
	
	// 2
	// a) - print elements until a smaller element comes after the current
	// b) - print elements as long as index is smaller than element at the index
	
	// 3 Reverse the order of elements in an Array in Java
	public void reverseArray() {
		String[] names = {"Jonas", "Tina", "Tom", "Steve", "Amanda", "Hanna", "Rebecca", "Carl"};
		
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.print(names[i] + " ");
		}
	}
	
	// 4 Print the Index of Array in Java: Even index get index as value else 1
	public void printIndex() {
		int[] field = new int[25];
		
		for (int i = 0; i < field.length; i++) {
			if (i % 2 == 0) {
				field[i] = i;
			} else {
				field[i] = 1;
			}
		}
		System.out.println(Arrays.toString(field));
	}
	
	// 5 Print the elements of an Array in Java: print odd value elements
	public void printOdd() {
		int[] field = {2, 20, 3, 13, 15, 3, 9, 10, 1, 5, 8};
		
		System.out.print("[ ");
		for (int i = 0; i < field.length; i++) {
			if (field[i] % 2 != 0) {
				System.out.print(field[i] + ", ");
			}
		}
		System.out.print("]");
	}
	
	// 6 Remove elements from an Array in Java
	public int[] removeInputNum() {
		int inputNum = 3;
		int length = 0;
		int[] beforeField = {2, 3, 2, 1, 3, 5, 7, 8, 7, 8, 2, 6, 3};
		int[] afterField;
		
		
		for (int j : beforeField) {
			if (j != inputNum) {
				length++;
			}
		}
		
		afterField = new int[length];
		
		for (int i = beforeField.length - 1; i >= 0; i--) {
			if (beforeField[i] != inputNum) {
				afterField[length - 1] = beforeField[i];
				length--;
			}
		}
		
		return afterField;
	}
	
	
	public static int[] increaseValues() {
		int inNum = 3;
		int[] field = {2, 3, 2, 5, 3, 1};
		int[] returnField = new int[field.length];
		
		for (int i = 0; i < field.length; i++) {
			if (i == 0 || i == field.length -1) {
				returnField[i] = field[i];
			} else {
				returnField[i] = field[i] * inNum;
			}
		}
		
		return returnField;
	}
	
	public static void main(String[] args) {
		int[] test = new Arrays7().increaseValues();
		System.out.println(Arrays.toString(test));
		
	}
}
