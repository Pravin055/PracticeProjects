package interview_programs;

import java.util.Scanner;

public class reversingTheString {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "JAVA is programming language";
		char[] temp = input.toCharArray();
		String reverse = "";

		for (int i = temp.length - 1; i >= 0; i--) {
			reverse = reverse + temp[i];
		}

		System.out.println("Reversed string is:");
		System.out.println(reverse);

	}

}
