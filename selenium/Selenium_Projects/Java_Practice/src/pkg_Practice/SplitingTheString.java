package pkg_Practice;

public class SplitingTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "I am a JAVA trainer";

		String[] container = inputString.split("A");

		for (int i = 0; i <container.length; i++) {

			System.out.println("Printing the Seperated String : " + container[i]);

		}
	}
}
