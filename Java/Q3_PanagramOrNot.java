package Java;
import java.util.*;

public class Q3_PanagramOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
//		String str="The quick brown fox jumps over the lazy dog";
		System.out.println(Panagram(str.toLowerCase()));
	}
	
    public static boolean Panagram(String str) {
    	if(str.length()<26) {
		   return false;
    	}
	    else {
	    	for(char ch='a';ch<='z';ch++) {
	    		if(str.indexOf(ch)<0) {
	    			return false;
	    		}
			}
	    }
    	return true;
    }
}

