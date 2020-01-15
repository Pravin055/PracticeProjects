package interview_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShiftAllZerosToLeft {

	public static Integer[] shiftAllZerosToLeftMethod(int[] listArray) {

		Integer[] outpurArray;
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();

		for (int i = 0; i < listArray.length; i++) {
			newArrayList.add(listArray[i]);
		}
		Collections.sort(newArrayList);

		outpurArray = new Integer[newArrayList.size()];
		outpurArray = newArrayList.toArray(outpurArray);

		return outpurArray;
	}

}
