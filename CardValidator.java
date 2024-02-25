import java.util.Scanner;

public class CardValidator {

	static Scanner input = new Scanner(System.in);
	
	public static long getNumber() {
		System.out.println("Please Enter the Credit Card Number:");
		long number = input.nextLong();
		return number;
	}
	
	public static int sumEvenFromRight(String number) {
		int temp;
		int sum = 0;
		
		for (int i = number.length() - 2; i >= 0; i -= 2) {
			temp = Integer.parseInt(String.valueOf(number.charAt(i)));
			int value = temp * 2;
			if(value == 0) continue;
			else if (value / 10 < 1) {
				sum += value;
			}
			else {				
				sum += 1;
				sum += value % 10;
			}
		}
		return sum;
	}
	
	public static int sumOddFromRight(String number) {
		int sum = 0;
		for (int i = number.length() - 1; i > 0; i -= 2 ) {
			sum += Integer.parseInt(String.valueOf(number.charAt(i)));
		}
		return sum;
	}
	
	public static boolean isValid(long number) {
		
		String str_num = String.valueOf(number);
		
		int sum_one = sumEvenFromRight(str_num);
		int sum_two = sumOddFromRight(str_num);
		
		int validation_sum = sum_one + sum_two;
		
		if (validation_sum % 10 == 0) return true;
		else return false;

	}
	
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
