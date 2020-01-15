package pkg_Practice;

public class StringSeperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strMain = "Hellooo";
		String[] arrSplit = strMain.split("o");

		System.out.println(arrSplit.toString());

		System.out.println("Printing the Array values ony by one By iterating through array: ");
		for (int i = 0; i < arrSplit.length; i++) {
			System.out.println(arrSplit[i]);
		}
		

	}

}
