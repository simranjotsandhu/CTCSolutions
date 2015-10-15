package c1;

/**
 * @author Simranjot
 *
 */

public class P4{
    public static void main(String args[]) {
	P4 obj = new P4();
	char[] toCheckCTC = "s i m p y\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0".toCharArray();
	long start = System.nanoTime();
	System.out.println(obj.replace("s i m p y"));
	long end = System.nanoTime();
	System.out.println(end - start);
	long start1 = System.nanoTime();
	System.out.println(obj.replaceSpaces(toCheckCTC, 9));
	long end1 = System.nanoTime();
	System.out.println(end1 - start1);
    }

    public String replace(String str) {
	// Objective: to replace all the spaces in a string with "%20"
	// char[] strArray = str.toCharArray();
	// char c;
	
	String[] splits = str.split(" ");
	// String subString;
	StringBuilder builder = new StringBuilder();
	for (String subString : splits) {
	    builder.append(subString).append("%20");
	}
	return builder.toString().substring(0, builder.toString().length()-3);
    }
    
   public char[] replaceSpaces(char[] str, int length) {
	int spaceCount = 0, index, i = 0;
	for (i = 0; i < length; i++) {
		if (str[i] == ' ') {
			spaceCount++;
		}
	}
	index = length + spaceCount * 2;
	str[index] = '\0';
	for (i = length - 1; i >= 0; i--) {
		if (str[i] == ' ') {
			str[index - 1] = '0';
			str[index - 2] = '2';
			str[index - 3] = '%';
			index = index - 3;
		} else {
			str[index - 1] = str[i];
			index--;
		}
	}
	return str;
   }
}
