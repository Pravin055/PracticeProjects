package collections;

import java.util.ArrayList;

public class ArrayListPractice {
	ArrayList<String> list;

	public static void arrayListMethod() {
		String tempString = "Selenium";

		char[] templist = tempString.toCharArray();

		ArrayList<String> list = new ArrayList<String>();
		list.add("User1");
		list.add("xyz");
		list.add(2, "User4");
		list.add("User3");
		list.add("xyz");
		list.add("User3");

		System.out.println("list before for loop : " + list);

		for (int i = 0; i <= templist.length - 1; i++) {

			String value = String.valueOf(templist[i]);
			list.add(value);

		}
		System.out.println("list after for loop : " + list);

		/*
		 * list.remove("User3");
		 * System.out.println("list after deleting User3 by object : " + list);
		 * list.remove(3); System.out.println("list after deleting User3 by index: " +
		 * list);
		 */

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).equals("xyz")) {
				list.remove(i);
			}
		}
		
		System.out.println("list after deleting xyz : " + list);
		

	}

}
