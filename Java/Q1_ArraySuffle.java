package Java;

import java.util.*;
public class Q1_ArraySuffle {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7};
		System.out.println("Before Suffle");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Suffle(arr);
		System.out.println("After Suffle");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Suffle(int []arr) {
		Random rand=new Random();
		for(int i=0;i<arr.length;i++) {
			int index=rand.nextInt(arr.length);
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		
	}

}