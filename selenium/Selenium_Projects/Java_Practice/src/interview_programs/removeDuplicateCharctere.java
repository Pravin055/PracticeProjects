package interview_programs;

import java.util.Arrays;

public class removeDuplicateCharctere {

	public static String removeDuplicateMethod(String inputString) {
		int index = 0;
		char[] temp = null;
		try {
			if (inputString.isEmpty() || inputString.length() < 2) {
				throw new NullPointerException("Given String is not more than One Character");
			}

			else {
				int i, j;

				temp = inputString.toCharArray();
				for (i = 0; i < temp.length - 1; i++) {
					for (j = 0; j < temp.length - 1; j++) {
						if (temp[i] == temp[j]) {
							break;
						}
					}

					if (j == i) {
						temp[index++] = temp[i];
					}

				}
			}

		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return String.valueOf(Arrays.copyOf(temp, index));

	}
}
