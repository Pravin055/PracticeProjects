package pkg_Practice;

public class NestedForLoopBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outer: for (int i = 0; i < 4; i++) {

			// this is the inner loop
			for (int j = 0; j < 4; j++) {

				// condition to break from nested loop
				if (i * j > 5) {
					System.out.println("Breaking from nested loop");
					break outer;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("exited");
	}
}
