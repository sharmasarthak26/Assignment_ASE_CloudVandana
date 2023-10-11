package Java;

import java.util.Scanner;

public class Q2_RomanToInteger {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(RomanToInteger(str));
	}
	public static int RomanToInteger(String str) {
		int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            switch (c) {
                case 'I':
                    result += 1 * (result >= 5 ? -1 : 1);
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10 * (result >= 50 ? -1 : 1);
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100 * (result >= 500 ? -1 : 1);
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
         }

    return result;
    
	}

}
