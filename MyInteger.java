
public class MyInteger {
	private int value;
	
	public MyInteger(int num) {
		this.value = num;
	}
	
	public MyInteger(String num) {
		this.value = parseInt(num);
	}
	
	public MyInteger(char[] numList) {
		this.value = parseInt(numList);
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int num) {
		this.value = num;
	}
	
	public void setValue(String num) {
		this.value = parseInt(num);
	}
	
	public void setValue(char[] num) {
		this.value = parseInt(num);
	}
	
	public boolean isEven() {
		return this.value % 2 == 0;
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public static boolean isEven(MyInteger num) {
		return num.value % 2 == 0;
	}
	
	public boolean isOdd() {
		System.out.print(this.value % 2 != 0);
		return this.value % 2 != 0;
	}

	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}

	public static boolean isOdd(MyInteger num) {
		return num.value % 2 == 1;
	} 
	
	public boolean isPrime() {
		int value = this.value;
		for (int i = 2; i < 10; i ++) {
			if (value == i ) continue;
			if (value % i == 0) return false;
		}
		return true;
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i < 10; i ++) {
			if (num == i ) continue;
			if (num % i == 0) return false;
		}
		return true;
	}

	public static boolean isPrime(MyInteger num) {
		int value = num.value;
		
		for (int i = 2; i < 10; i ++) {
			if (value == i ) continue;
			if (value % i == 0) return false;
		}
		return true;
	}
	
//	Done
	public boolean equals(int num) {
		return this.value == num;
	}
	
//	Done
	public boolean equals(MyInteger num) {
		return this.value == num.value;
	}
	
	public static int parseInt(char[] numList) {
		int num = 0;
		
		for (int i = 0; i < numList.length; i++) {
			num = num * 10 + numList[i];
		}
		System.out.println(num);
		return num;
	}
	
//	Done
	public static int parseInt(String numStr) {
		int num = 0;
		
		for (int i = 0; i < numStr.length(); i++) {
			num = num * 10 + ((int)numStr.charAt(i) - 48);
		}
	
		return num;
	}
	
	public static void main(String[] args) {	
	}

}
