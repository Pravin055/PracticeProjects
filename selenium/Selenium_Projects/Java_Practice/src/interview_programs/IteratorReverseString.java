package interview_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IteratorReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Program is contains logic";

		char[] temp = input.toLowerCase().toCharArray();

		List<String> list = new ArrayList<String>();

		for (int i = 0; i <= temp.length - 1; i++) {
			list.add(Character.toString(temp[i]));
		}

		Arrays.sort(temp);

		System.out.println("temp : " + temp);

		String reverse = "";

		for (int i = list.size() - 1; i >= 0; i--) {
			reverse = reverse + list.get(i);
		}

		System.out.println("reverse : " + reverse);

	}

}
