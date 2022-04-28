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
		System.out.print("Enter numbers seperated by space: ");
		String[] textNumbers = in.nextLine().split(" ");
		
		System.out.print("what number: ");
		String number = in.nextLine();
		
		int[] numbers = new int[textNumbers.length];
		
		for (String num:textNumbers) {
			if (num.equals(number)) {
				System.out.println(number + " is there");
				break;
			}
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Arrays a = new Arrays();
		a.printNumbers();
	
	}
}
