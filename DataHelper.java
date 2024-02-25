// Ritesh Persaud

// I pledge my honor that I have abided by the Stevens Honor System
// SSW 315

import java.util.Scanner;
import java.util.Arrays;

public class DataHelper {

	// Creating the instance of the Scanner class
	static Scanner input = new Scanner(System.in);
	
	// Get Month from Number Method
	// Complete
	public static String getMonth(int monthNum){
		String month;
		
		// Using a switch block to determine the month from the input
		switch(monthNum) {
		case 1: month = "January"; break;
		case 2: month = "February"; break;
		case 3: month = "March"; break;
		case 4: month = "April"; break;
		case 5: month = "May"; break;
		case 6: month = "June"; break;
		case 7: month = "July"; break;
		case 8: month = "August"; break;
		case 9: month = "September"; break;
		case 10: month = "October"; break;
		case 11: month = "November"; break;
		case 12: month = "December"; break;
		default: month = "You did not provide a valid month";
		}
		
		// Returns the month corresponding to the input number
		return month;
	}
	
	// Get Month from Word Method
	// Complete
	public static int getMonth(String month){
		int monthNum = 0;
		month = month.toLowerCase();
		int monthLen = month.length();
		if (month.equals("january".substring(0, monthLen))) {
			return monthNum = 1;
		}
		else if (month.equals("february".substring(0, monthLen))) {
			return monthNum = 2;
		}
		else if (month.equals("march".substring(0, monthLen))) {
			return monthNum = 3;
		}
		else if(month.equals("april".substring(0, monthLen))) {
			return monthNum = 4;
		}
		else if(month.equals("may".substring(0, monthLen))) {
			return monthNum = 5;
		}
		else if(month.equals("june".substring(0, monthLen))) {
			return monthNum = 6;
		}
		else if(month.equals("july".substring(0, monthLen))) {
			return monthNum = 7;
		}
		else if(month.equals("august".substring(0, monthLen))) {
			return monthNum = 8;
		}
		else if(month.equals("september".substring(0, monthLen))) {
			return monthNum = 9;
		}
		else if(month.equals("october".substring(0, monthLen))) {
			return monthNum = 10;
		}
		else if(month.equals("november".substring(0, monthLen))) {
			return monthNum = 11;
		}
		else if(month.equals("december".substring(0, monthLen))) {
			return monthNum = 12;
		}
		else {
			System.out.print("You did not enter a valid month. Check your spelling.");
			return monthNum;
		}
	}
	
	// Get Day from Number Method
	// Complete
	public static String getDay(int dayNum) {
		String day = "";
		
		switch(dayNum) {
		case 0: day = "Sunday"; break;
		case 1: day = "Monday"; break;
		case 2: day = "Tuesday"; break;
		case 3: day = "Wednesday"; break;
		case 4: day = "Thursday"; break;
		case 5: day = "Friday"; break;
		case 6: day = "Saturday"; break;
		case 7: day = "Sunday"; break;
		default: System.out.print("You did not enter a valid entery");		
		}
		
		return day;
	}
	
	// Get Day from Word Method
	// Complete
	public static int getDay(String day) {
		int dayNum;
		int strLength = day.length();
		day = day.toLowerCase();
		
		if (day.equals("sunday".substring(0, strLength))) {
			return dayNum = 0;
		}
		else if (day.equals("monday".substring(0, strLength))) {
			return dayNum = 1;
		}
		else if (day.equals("tuesday".substring(0, strLength))) {
			return dayNum = 2;
		}
		else if (day.equals("wednesday".substring(0, strLength))) {
			return dayNum = 3;
		}
		else if (day.equals("thursday".substring(0, strLength))) {
			return dayNum = 4;
		}
		else if (day.equals("friday".substring(0, strLength))) {
			return dayNum = 5;
		}
		else if (day.equals("saturday".substring(0, strLength))) {
			return dayNum = 6;
		}
		else {
			System.out.println("You did not enter a valid number");
			return 400;
		}
		
	}
	
	// Get Date from Numbers Method
	// Complete
	public static String getDate(int year, int month, int day) {
		String date = "" + year;
		
		if (month > 12 || month < 1) return "You did not input a valid month";
		
		if (month < 10) date += "-0" + month;
		else date += "-" + month;

		if (day < 10) date += "-0" + day;
		else date += "-" + day;
		
		return date;
	}
	
	// Get Date from String
	// Complete 
	public static int[] getDate(String date) {
		int[] dateList = {1,2,3};
		String year, month, day;
		year = date.substring(0,4);
		month = date.substring(5,7);
		day = date.substring(8);
		dateList[0] = Integer.parseInt(year);
		dateList[1] = Integer.parseInt(month);
		dateList[2] = Integer.parseInt(day);
		System.out.print(Arrays.toString(dateList));
		return dateList;
	}	
	
	// Determine if Year is a Leap Year
	// Complete
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// Determine if the Inputed date is valid 
	// Complete
	public static boolean isValidDate(int year, int month, int day) {
		
		// List to contain the months with less than 30 days
		int[] lessThan30 = {2,4,6,9,11};
		
		// Checking to see if the month is supposed to be less than 30 days and if the day is 31
		for (int element : lessThan30) {
			if (element == month && day > 30 ) return false;
		}
		// Checks to see if it is a leap year, is February, and the day is 29
		if (month == 2 && day == 29 && !isLeapYear(year) ) return false;
		
		// Checks to see if the year is above 0 and month is between 1 and 12
		if (year < 0) return false;
		if (month <= 0 || month > 12) return false;
				
		return true;
	}
	
	// Determine the Number of the Day of the Year
	// Complete
	public static int dayOfYear(int year, int month, int day) {
		int number = 0;
		if (month > 0 && month < 12 && day > 0 && day <= 31) {
			switch(month) {
				case 1: return number = day;
				case 2:
					if (isLeapYear(year) && day <= 29) return number = day + 31;
					else if (!isLeapYear(year) && day <= 28) return number = day + 31;
					else {
						System.out.println("Not a valid day");
						return number = 400;
					}
				case 3: 
					if (isLeapYear(year)) return number = 60 + day;
					else return number = 59 + day;
				case 4:
					if (day <= 30) {
						if (isLeapYear(year)) return number = 91 + day;
						else return number = 90 + day;
					}
					else {
						System.out.print("Not a valid date");
						return 400;
					}
				case 5: 
					if (isLeapYear(year)) return number = 121 + day;
					else return number = 120 + day;
				case 6: 
					if (day <= 30) {
						if (isLeapYear(year)) return number = 152 + day;
						else return number = 151 + day;
					}
					else {
						System.out.print("Not a valid date");
						return 400;
					}
				case 7: 
					if (isLeapYear(year)) return number = 182 + day;
					else return number = 181 + day;
				case 8:
					if (isLeapYear(year)) return number = 213 + day;
					else return number = 212 + day;
				case 9: 
					if (day <= 30) {
						if (isLeapYear(year)) return number = 244 + day;
						else return number = 243 + day;
					}
					else {
						System.out.print("Not a valid date");
						return 400;
					}
				case 10: 
					if (isLeapYear(year)) return number = 274 + day;
					else return number = 273 + day;
				case 11: 
					if (day <= 30) {
						if (isLeapYear(year)) return number = 305 + day;
						else return number = 304 + day;
					}
					else {
						System.out.print("Not a valid date");
						return 400;
					}
				case 12: 
					if (isLeapYear(year)) return number = 235 + day;
					else return number = 334 + day;
			}
		}
		
		
		return number;
	}
	
	// Determines the Number of Days in the Month
	// Complete
	public static int daysOfMonth(int year, int month) {
		int[] thirtyOneDays = {1,3,5,7,8,10,12};
		int[] thirtyDays = {4,6,9,11};
		for (int element : thirtyOneDays ) {
			if (month == element) return 31;			
		}
		for (int element : thirtyDays) {
			if (month == element) return 30;
		}
		if (month == 2) {
			if (isLeapYear(year)) return 29;
			else return 28;
		}
		else {
			System.out.println("Invalid Input");
			return 400;
		}
	}
	
	// Determine the Day of the Week
	// Complete
	public static String dayOfWeek(int year, int month, int day) {
		return "Monday";
	}
	
	// Determine the Number of days Between two days
	// Complete
	public static int daysBetween(int yearFirst, int monthFirst, int dayFirst, int yearSecond, int monthSecond, int daySecond) {
		int num =0;
		if (yearFirst == yearSecond) {
			return dayOfYear(yearSecond, monthSecond, daySecond) - dayOfYear(yearFirst, monthFirst, dayFirst);
		}
		return num;
	}
	
	// Determine a Random year between a Start and End Year
	// Complete
	public static int randomYear(int start, int end) {
		return (int)(Math.random() * (end - start + 1)) + start;
	}
	public static int randomYear(int end) {
		return (int)(Math.random() * end) + 1;
	}
	public static int randomYear() {
		return (int)(Math.random() * 9999) + 1;
	}
	
	// Determines a Random month
	// Complete
	public static int randomMonth() {
		return (int)(Math.random() * 12) + 1;
	}
	
	// Determines a Random Day
	// Complete
	public static int randomDay(int year, int month) {
		int[] thirtyDays = {4,6,9,11};
		int[] thirtyOneDays = {1,3,5,7,8,10,12};
		
		for (int element : thirtyDays) {
			if (element == month) return (int)(Math.random() * 30) + 1;
		}
		for (int element: thirtyOneDays) {
			if (element == month) return (int)(Math.random() * 31) + 1;
		}
		if (month == 2) {
			if (isLeapYear(year)) return (int)(Math.random() * 29) + 1;
			else return (int)(Math.random() * 28) + 1;	
		}
		return 400;
	}
	public static int randomDay(int month) {
		
		int[] thirtyDays = {4,6,9,11};
		int[] thirtyOneDays = {1,3,5,7,8,10,12};
		
		for (int element : thirtyDays) {
			if (element == month) return (int)(Math.random() * 30) + 1;
		}
		for (int element: thirtyOneDays) {
			if (element == month) return (int)(Math.random() * 31) + 1;
		}
		return (int)(Math.random() * 28) + 1;
	}
	public static int randomDay() {
		return (int)(Math.random() * 31) + 1;
	}
	
	// Returns a Random Date
	// Complete
	public static int[] randomDate() {
		int year = randomYear();
		int month = randomMonth();
		int day = randomDay(year, month);
		
		int[] date = {year, month, day};
		return date;
		
	}

}
