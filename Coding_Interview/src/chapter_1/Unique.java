package chapter_1;

import java.util.HashSet;
import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = sc.nextLine();
		boolean uniqu = Determin(str);
		if (uniqu == true) {
			System.out.println("The entered string has all characters unique.");
		} else {
			System.out
					.println("The entered string doesn't have unique characters.");
		}
		sc.close();

	}

	static boolean Determin(String str) {
		boolean resul = false;
		int length = str.length();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < length; i++) {
			if (set.add(str.charAt(i))) {
				resul = true;
			}
			else{
				resul = false;
			}
		}
		//System.out.println(set);
		return resul;
	}
	static boolean Determ(String str)
	{
		boolean result = true;
		int length = str.length();
		//char[] arr = str.toCharArray();
		for(int i = 0;i<length;i++)
		{
			for(int j = i+1;j<length;j++)
			{
				if(str.charAt(i) == (str.charAt(j)))
				{
					result = false;
					//System.out.println("hi");
				}
				
			}
		}
		return result;
	}

}
