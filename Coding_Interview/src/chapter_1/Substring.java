package chapter_1;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first string S1: ");
		String s1 = sc.nextLine();
		System.out.println("Please enter the second string S2: ");
		String s2 = sc.nextLine();
		boolean result = isString(s1, s2);
		if (result == true) {
			System.out.println("S2 is a rotated substring of S1.");
		} else {
			System.out.println("S2 is not a rotated substring of S1.");
		}
		sc.close();

	}

	static boolean isString(String str1, String str2) {
		boolean res = false;
		String X = new String();
		String Y = new String();
		for (int i = 0; i < str1.length(); i++) {
			X = str1.substring(0, i);
			Y = str1.substring(i, str1.length());
			String Str = Y + X;
			// System.out.println(Str);
			if (Str.equals(str2)) {
				res = true;
			}

		}
		return res;
	}

}
