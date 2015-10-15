package c1;

public class P7 {
	void setRCToZero(int[][] matrix) {
		boolean[] r = new boolean[matrix.length];
		boolean[] c = new boolean[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					r[i] = true;
					c[j] = true;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			if (r[i]) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			} else {
				for (int j = 0; j < matrix[0].length; j++) {
					if (c[j]) {
						matrix[i][j] = 0;
					}
				}
			}
		}
	}
}
