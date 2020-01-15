package interview_programs;

import java.util.Arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] arrrayMultiData = new String[2][4];
		
		arrrayMultiData[0][0] = "4122";
		arrrayMultiData[0][1]="Pravin";
		arrrayMultiData[0][2]="Linganwar";
		arrrayMultiData[0][3]="27";
		arrrayMultiData[0][0] ="4123";
		arrrayMultiData[1][0]="4121";
		arrrayMultiData[1][1]="Rahul";
		arrrayMultiData[1][2]="Linganwar";
		arrrayMultiData[1][3]="25";
		
		String[][] temp =new String[2][4];
		temp=arrrayMultiData.clone();
		System.out.println(Arrays.equals(arrrayMultiData,arrrayMultiData));

	}

}
