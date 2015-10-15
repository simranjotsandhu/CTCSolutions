package c1;

public class P8 {
	boolean isRotation(String s1, String s2){
	    if(s1.length()!=s2.length()){
	        return false;
	    }
	    s1 = s1.concat(s1);
	    return isSubstring(s1, s2);
	}
	boolean isSubstring(String s1, String s2){
		return false;
	}
}
