package Basic;

public class StringAndChar {
	
	// 6 Write a program to find the first and the last occurrence of the letter 'o' and character ',' in "Hello, World".
	public int[] firstLastOccurrence(String str, char c) {
		int first = -1;
		int last = -1;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				first = i;
				break;
			}
		}
		
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == c) {
				last = i;
				break;
			}
		}
		
		return new int[]{first, last};
	}
	
	// 7 Write a program that takes your full name as input and displays the abbreviations of the first and middle names
	// except the last name which is displayed as it is. For example, if your name is Robert Brett Roser,
	// then the output should be R.B.Roser.
	public void abbreviations(String name) {
		String[] names = name.split(" ");
		
		for (int idx = 0; idx < names.length; idx++) {
			if (idx != names.length - 1) {
				System.out.print(names[idx].charAt(0) + ".");
			} else {
				System.out.println(names[idx]);
			}
			
		}
		
	}
	
	// 8 Write a program to find the number of vowels, consonants, digits and white space characters in a string.
	public void numVowelsConsonantsDigitsSpace(String str) {
		String strLower = str.toLowerCase();
		int vowels = 0;
		int consonents = 0;
		int digits = 0;
		int space = 0;
		char c;
		
		for (int i = 0; i < str.length(); i++) {
			c = strLower.charAt(i);
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			} else if (c >= 'a' && c <= 'z') {
				consonents++;
			} else if (c >= '0' && c <= '9') {
				digits++;
			} else if (c == ' ') {
				space++;
			}
			
		}
		
		System.out.println("    vowels: " + vowels);
		System.out.println("consonents: " + consonents);
		System.out.println("    digits: " + digits);
		System.out.println("     space: " + space);
	}
	
	// 9 Write a program to delete all consonants from the string "Hello, have a good day".
	public String deleteConsonants(String str) {
		char c;
		String strLower = str.toLowerCase();
		StringBuilder newStr = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			c = strLower.charAt(i);
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					newStr.append(str.charAt(i));
				}
			} else {
				newStr.append(str.charAt(i));
			}
			
		}
		
		return newStr.toString();
	}
	
	// 10 Input a string of alphabets. Find out the number of occurrence of all alphabets in that string.
	// Find out the alphabet with maximum occurrence.
	public char occurrenceLetters(String str) {
		int max = 0;
		String strUpper = str.toUpperCase();
		char c;
		int[] letters = new int[26];
		
		for (int i = 0; i < strUpper.length(); i++) {
			c = strUpper.charAt(i);
			if ((0 <= c - 65) && (c - 65 <= 25)) {
				letters[c - 65]++;
			}
		}
		
		for (int i = 0; i < letters.length; i++) {
			if (letters[max] < letters[i]) {
				max = i;
			}
		}
		
		return (char) (max + 65);
	}
	
	
	public static void main(String[] args) {
		StringAndChar s = new StringAndChar();
		// your code here
		s.occurrenceLetters("aBbbbc123");
		System.out.println((int) 'Z' - 65);
	}
}
