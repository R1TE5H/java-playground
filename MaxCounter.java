import java.util.Scanner;

public class MaxCounter {
	
	// Method to Get a String List of Numbers From the User
	// Returns an Int Array
	public static int[] parseValues(String input) {
		String[] temp = input.split(" ");
		int[] numList = new int[temp.length];
		
		for (int i = 0; i < temp.length; i++) {
			try {
			numList[i] = Integer.parseInt(temp[i]);
			}
			catch (Exception e) {
				continue;
			}
		}
		
		return numList;
	}
	
	// Method to Count the Number of Occurrences of the Greatest Number in an Array
	// Returns an Array with the Greatest Number and its Occurrences
	// Prints a Statement with the Greatest Number and its Occurrences
	public static int[] maxCounter(int[] values) {
		int greatest = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] > greatest) greatest = values[i];
		}			
		for (int i = 0; i < values.length; i++) {
			if (values[i] == greatest) count++;
		}	
		
		System.out.printf("[%d, %d] \n", greatest, count);
		System.out.printf("The largest number is %d \n", greatest);
		System.out.printf("The occurrence count of the largest number is %d", count);

		int [] finished = {greatest, count};
		return finished;
	}
	

	// Main Method to Run the Above Methods
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a List of Numbers separated by a space "
				+ "(1 2 3 4...):");
		String list = input.nextLine();
		input.close();
		
		maxCounter(parseValues(list));
		
	}
	
}
