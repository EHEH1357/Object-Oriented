package week3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class P1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File(args[0]));
			PrintWriter pw = new PrintWriter(args[1]);
			while(scanner.hasNext()) {
				String name = scanner.nextLine();
				pw.println(name);
			}
			pw.close();
		}
		catch(Exception e) {
			System.out.println("Exception occurred!");
		} finally {
			if(scanner!=null) {
				scanner.close();
			}
		}
	}

}
