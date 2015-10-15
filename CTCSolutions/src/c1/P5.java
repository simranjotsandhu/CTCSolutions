package c1;

public class P5 {
    public static void main(String args[]) {
	System.out.println(new P5().rotate("123456789".toCharArray()));
    }

    public char[] rotate(char[] imageNN) {
	int len = imageNN.length;
	int n = (int) Math.sqrt(len);
	char[] rotated = new char[len];
	for (int i = 0; i < len; i++) {
	    int k = i + 1;
	    int row = k / n;
	    int column = k % n;
	    if (column == 0) {
		column = n;
	    }
	    int index = (column) * n - row - 1;
	    System.out.println("value: " + imageNN[i] + " row: " + row + " column: " + column + " index: " + index);
	    rotated[index] = imageNN[i];
	}
	return rotated;
    }
}
