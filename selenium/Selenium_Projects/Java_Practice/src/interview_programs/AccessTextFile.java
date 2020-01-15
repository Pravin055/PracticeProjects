package interview_programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class AccessTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File(".//src//interview_programs//userDetails.txt");
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		List<String> userlist = new LinkedList<String>();
		while ((st = br.readLine()) != null) {
			userlist.add(st);

		}
		System.out.println(userlist);
	}

}
