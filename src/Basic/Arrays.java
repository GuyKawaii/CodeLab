package Basic;

import java.util.Scanner;

public class Arrays {
	Scanner in = new Scanner(System.in);
	
	// 1 Take 10 integer inputs from user and store them in an array and print them on screen.
	public void printNumbers() {
		System.out.print("Enter numbers seperated by space: ");
		String[] numbers = in.nextLine().split(" ");
		
		System.out.println(java.util.Arrays.toString(numbers));
	}
	
	// 2 Take 10 integer inputs from user and store them in an array. Again ask user to give a number. 
	// Now, tell user whether that number is present in array or not.
	public void checkNumber() {
		String checkNumber;
		boolean isThere = false;
		
		System.out.print("Enter numbers seperated by space: ");
		String[] textNumbers = in.nextLine().split(" ");
		
		System.out.print("Check for number: ");
		checkNumber = in.nextLine();
		
		for (int i = 0; i < textNumbers.length; i++) {
			if (textNumbers[i].equals(checkNumber)) {
				isThere = true;
				break;
			}
		}
		
		if (isThere) {
			System.out.println(checkNumber + " is there");
		} else {
			System.out.println(checkNumber + " is not there");
		}
	}
	
	// 3 Take 20 integer inputs from user and print the following: number of +,-, odd, even, 0s
	public void numbersCategories() {
		int numPositive = 0;
		int numNegative = 0;
		int numOdd = 0;
		int numEven = 0;
		int numZeroes = 0;
		int number;
		String[] numbersStrs;
		int[] numbers;
		
		System.out.print("Enter numbers seperated by space: ");
		numbersStrs = in.nextLine().split(" ");
		numbers = new int[numbersStrs.length];
		for (int i = 0; i < numbersStrs.length; i++) {
			// add to int array
			numbers[i] = Integer.parseInt(numbersStrs[i]);
			
			// check int array
			number = numbers[i];
			
			if (number >= 0) {
				numPositive++;
			} else {
				numNegative++;
			}
			if (number % 2 == 0) {
				numEven++;
			} else {
				numOdd++;
			}
			if (number == 0) {
				numZeroes++;
			}
		}
		
		System.out.println("Positive: " + numPositive);
		System.out.println("Negative: " + numNegative);
		System.out.println("    Even: " + numEven);
		System.out.println("     Odd: " + numOdd);
		System.out.println("   Zeros: " + numZeroes);
	}
	
	// 4 Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array
	//but in reverse order.
	public int[] reverseNumbers(int[] numbers) {
		int[] reveseNumbers = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			reveseNumbers[i] = numbers[numbers.length - 1 - i];
		}
		
		return reveseNumbers;
	}
	
	// 5 Write a program to find the sum and product of all elements of an array
	public void arraySummation(int[] numbers) {
		int sum = 0;
		int product = numbers[0];
		
		for (int num : numbers) {
			sum += num;
			product *= num;
		}
		product = product / numbers[0];
		
		System.out.println("     Sum: " + sum);
		System.out.println(" Product: " + product);
	}
	
	// 6 Initialize and print all elements of a 2D array.
	public void print2dArray() {
		int[][] array2D = new int[10][20];
		
		for (int[] row : array2D) {
			System.out.println(java.util.Arrays.toString(row));
		}
	}
	
	// 7 Find largest and smallest elements of an array
	public void arrayEdges(int[] numbers) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int num : numbers
		) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
	
	// 8 Write a program to check if elements of an array are same or not it read from front or back. E.g.-
	public boolean isSame(int[] numbers) {
		for (int num : numbers) {
			if (num != numbers[0]) {
				return false;
			}
		}
		
		return true;
	}
	
	// 9 Take an array of 10 elements. Split it into middle and store the elements in two different arrays
	public void splitArray(int[] a) {
		int n = a.length / 2;
		int[] a1 = new int[n];
		int[] a2 = new int[a.length - n];
		
		for (int i = 0; i < a1.length; i++) {
			a1[i] = a[i];
		}
		
		for (int i = 0; i < a2.length; i++) {
			a2[i] = a[n + i];
		}
		
		System.out.println(java.util.Arrays.toString(a1));
		System.out.println(java.util.Arrays.toString(a2));
	}
	
	// 10 Consider an integer array, the number of elements in which is determined by the user. The elements are
	//also taken as input from the user. Write a program to find those pair of elements that has the maximum and
	//minimum difference among all element pairs.
	public void maxDifference() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[] numbers;
		String[] numbersStrs;
		
		System.out.print("Enter numbers seperated by space: ");
		numbersStrs = in.nextLine().split(" ");
		numbers = new int[numbersStrs.length];
		
		for (int i = 0; i < numbersStrs.length; i++) {
			// add to int array
			numbers[i] = Integer.parseInt(numbersStrs[i]);
			
			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
	
	// 11 If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your program should be able to find that the
	//subarray lies between the indexes 3 and 8.
	// MIGHT BE WRONG
	
	public int[] subArray(int[] numbers) {
		int[] subNumbers = new int[6];
		
		if (numbers.length >= 8) {
			
			for (int i = 0; i < subNumbers.length; i++) {
				subNumbers[i] = numbers[i+3];
			}
			
			return subNumbers;
		}
		
		return new int[] {-1};
	}
	
	
	public static void main(String[] args) {
		Arrays a = new Arrays();
		
		System.out.println(java.util.Arrays.toString(a.subArray(new int[]{10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60})));
	}
}
