package Intermediate;

public class IfElse {
	
	// 1 isLeapYear
	public boolean isLeapYear(int year) {
		
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		}
		
		return year % 4 == 0;
	}
	
	// 3 reverseDigits
	public int reverseDigits(int num) {
		double number = num;
		double newNumber = 0;
		double digit;
		
		while (number > 0) {
			digit = (number % 10);
			newNumber = (newNumber + digit) * 10;
			number = (number - digit) / 10;
		}
		
		return (int) newNumber / 10;
	}
	
	
	
	
	public static void main(String[] args) {
		IfElse i = new IfElse();
		int n = 123;
		System.out.println(i.reverseDigits(n));
		System.out.println(n);
		
	}
}
