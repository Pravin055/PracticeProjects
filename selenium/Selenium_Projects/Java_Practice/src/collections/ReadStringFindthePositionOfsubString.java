package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ReadStringFindthePositionOfsubString {

	public static void readfullStringAndSeprateItWithSpaceandFindThePosiion() {

		String inputString = "India canada India";

		String[] subStringList = inputString.split(" ");

		List<String> list = Arrays.asList(subStringList);
		
		int indexByIndexOff = 0;
		int index =0;
		for(int i=0; i<list.size();i++)
		{
			if(list.get(i).equals("India"))
			{
				indexByIndexOff = list.indexOf("India");
				index=i;

				//break;				
				
			}
		}
		System.out.println("indexByIndexOff :  "+indexByIndexOff);
		
		System.out.println("index :  "+index);

		// List<String> wordList = Arrays.asList(subStringList);

	}

}
