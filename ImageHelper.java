import java.util.Arrays;

public class ImageHelper {
	
	public static boolean validateMatrix(int[][] matrix) {
		int len = matrix.length;
		for (int[] row : matrix) {
			if (row.length != len) return false;
		}
		return true;
	}
	
	public static void flipVertical(int[][] matrix) {
		int[] temp;
		int len = matrix.length;
		
		if (len % 2 != 0) {
			for (int i = 0; i <= (int)(len/2); i++) {
				temp = matrix[i];
				matrix[i] = matrix[len - i -1];
				matrix[len - i - 1] = temp;
			}
		}
		else {
			for (int i = 0; i < (len/2); i++) {
				temp = matrix[i];
				matrix[i] = matrix[len - i -1];
				matrix[len - i - 1] = temp;
			}
		}
		
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		
		
	}
	
	public static void flipHorizontal(int[][] matrix) {
		int temp;
		int len = matrix.length;
		
		for(int[] row : matrix) {
			for (int i = 0; i < (int)(len/2); i++) {
				temp = row[i];
				row[i] = row[len - i - 1];
				row[len - i - 1] = temp;
			}
		}		
		
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	public static void rotateClockwise(int[][] matrix) {
		int len = matrix.length;
		int temp;
		
	    for (int i = 0; i < len; i++) {
	        for (int j = i + 1; j < len; j++) {
	            temp = matrix[i][j];
	            matrix[i][j] = matrix[j][i];
	            matrix[j][i] = temp;
	        }
	    }

	    for (int i = 0; i < len; i++) {
	        for (int j = 0; j < len / 2; j++) {
	            temp = matrix[i][j];
	            matrix[i][j] = matrix[i][len - j - 1];
	            matrix[i][len - j - 1] = temp;
	        }
	    }

	    for (int[] row : matrix) {
	        System.out.println(Arrays.toString(row));
	    }
	
	}

	public static void rotateCounterClockwise(int[][] matrix) {
		int len = matrix.length;
		int temp;

	    for (int i = 0; i < len; i++) {
	        for (int j = i + 1; j < len; j++) {
	            temp = matrix[i][j];
	            matrix[i][j] = matrix[j][i];
	            matrix[j][i] = temp;
	        }
	    }

	    for (int i = 0; i < len / 2; i++) {
	        for (int j = 0; j < len; j++) {
	            temp = matrix[i][j];
	            matrix[i][j] = matrix[len - i - 1][j];
	            matrix[len - i - 1][j] = temp;
	        }
	    }
	    
	    for (int[] row : matrix) {
	        System.out.println(Arrays.toString(row));
	    }
	}
	
	public static void main(String[] args) {
	}	
}
