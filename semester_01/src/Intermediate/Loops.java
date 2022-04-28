package Intermediate;

public class Loops {
	
	// 1 sumOddEvenDigits
	public void sumOddEvenDigits(int number) {
		int sumOdd = 0;
		int sumEven = 0;
		int digit;
		
		while (number > 0) {
			digit = number % 10;
			
			if (digit % 2 == 0) {
				sumOdd += digit;
			} else {
				sumEven += digit;
			}
			
			number /= 10;
		}
		
		System.out.println("Sum of even: " + sumEven);
		System.out.println(" Sum of odd: " + sumOdd);
	}
	
	
	
	// 3 prime numbers to a limit
	public void primeLimit(int limit) {
		if (limit >= 2) {
			System.out.print("2 ");
		}
		
		for (int number = 2; number < limit + 1; number++) {
			for (int factor = 2; factor < number; factor++) {
				if (number % factor == 0) {
					break;
				} else if (factor == number - 1) {
					System.out.print(number + " ");
				}
				
			}
		}
		
	}
	
	// 4 armstrongNumber
	public boolean armstrongNumber(int number) {
		int d1 = number % 10;
		int d2 = (number / 10) % 10;
		int d3 = (number / 100) % 10;
		
		return number == (Math.pow(d1, 3) + Math.pow(d2, 3) + Math.pow(d3, 3));
	}
	
	public int digitSum(int number) {
		int sum = 0;
		
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		
		return sum;
	}
	
	// 5 simplestFraction
	public int[] simplestFraction(int[] fraction) {
		int numerator = fraction[0];    // top
		int denominator = fraction[1];  // bottom
		int min = Math.min(numerator, denominator);
		
		for (int i = min; i >= 2; i--) {
			if (numerator % i == 0 && denominator % i == 0) {
				return new int[]{(numerator / i), (denominator / i)};
			}
		}
		
		return new int[]{numerator, denominator};
	}
	
	
	public static void main(String[] args) {
		Loops l = new Loops();
		int[] x = {12, 11};
		l.sumOddEvenDigits(1122);
	}
}
