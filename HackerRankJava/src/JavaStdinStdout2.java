/* Sample Input:
42
3.1415
Welcome to HackerRank's Java tutorials! 

Sample Output:
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
*/

import java.util.Scanner;
public class JavaStdinStdout2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine(); //skips the /n line at the end of the double var line
		String s = scan.nextLine();

		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}


}