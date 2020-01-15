package interview_programs;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 33, 34, 55, 67, 66, 01 };

		for (int i = 0; i <= 5; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("*******************************************************");
		int[] array2 = new int[5];
		
		array2[0] =23;
		array2[1]=24;
		array2[3]=26;
		
		for(int i=0; i<array2.length;i++)
		{
			System.out.println(array2[i]);
		}

	}

}
