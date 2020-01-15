package pkg_Practice;

public class array_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int numbers_colletion[] = {2,5,8,9,10};

		for (int i = 0; i < numbers_colletion.length; i++) {
			
			sum = sum + numbers_colletion[i];
			
			System.out.println("inside loop Value of Sum: " +sum );

		}		
		System.out.println("Outside loop Value of Sum: " +sum );
	}
}
