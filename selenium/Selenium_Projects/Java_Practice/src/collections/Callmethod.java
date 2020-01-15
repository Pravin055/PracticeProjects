package collections;

import interview_programs.ShiftAllZerosToLeft;
import interview_programs.SortStringinAssecendingOrder;
import interview_programs.SortingAnArrayWithoutPredefineMethod;

public class Callmethod {
	
	public static int[] numbersList = {0,1,2,0,3,56,0,34,0,66,0,4,99,61,0,0,0};
	public static String[] givenString = {"ab","ed","gd","path","new","double","fine","file","access","aa"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayListPractice.arrayListMethod();
		
		//ReadStringFindthePositionOfsubString.readfullStringAndSeprateItWithSpaceandFindThePosiion();
		//System.out.println("numbersList" +numbersList);
		//ShiftAllZerosToLeft.shiftAllZerosToLeftMethod(numbersList);
		//System.out.println(ShiftAllZerosToLeft.shiftAllZerosToLeftMethod(numbersList));
		
		//SortStringinAssecendingOrder.SortStringMethod(givenString);
		
		SortingAnArrayWithoutPredefineMethod.methodSTringSort(givenString);

	}

}
