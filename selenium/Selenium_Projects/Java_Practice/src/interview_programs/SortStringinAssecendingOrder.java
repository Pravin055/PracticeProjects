package interview_programs;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringinAssecendingOrder {
	static ArrayList<String> tempList;

	public static String[] SortStringMethod(String[] sampleString) {
		try {
			tempList = new ArrayList<String>();

			for (int i = 0; i < sampleString.length; i++) {
				tempList.add(sampleString[i]);
			}

			Collections.sort(tempList);
		}

		catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		String[] outputString = new String[tempList.size()];
		outputString = tempList.toArray(outputString);

		System.out.println("Alphabetically sorted list : " + tempList);

		return outputString;

	}

}
