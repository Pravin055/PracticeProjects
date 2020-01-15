package interview_programs;

public class RevesrseStringWithoutUsingPreDefineMethods {

	public static String reverseStringMethod(String inputstr) {

		try {
			if (inputstr.isEmpty() || inputstr.length() < 2) {

				System.out.println("Given string is either empty or having only one character i.e : " + inputstr);
				throw new NullPointerException(inputstr + " is either null or less than one character");

			} else {
				String desiredString = "";

				char[] tempString = inputstr.toCharArray();

				for (int i = tempString.length - 1; i >= 0; i--) {

					desiredString = desiredString + tempString[i];

				}
				inputstr = desiredString;

			}

		}

		catch (NullPointerException e) {
			e.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return inputstr;

	}

}
