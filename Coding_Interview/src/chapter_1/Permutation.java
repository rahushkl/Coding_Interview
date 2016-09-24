package chapter_1;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first string: ");
		String str = sc.nextLine();
		System.out.println("Please enter second string: ");
		String str2 = sc.nextLine();
		int len1 = str.length();
		int len2 = str2.length();
		String[] st = str.split(" ");
		String[] st2 = str2.split(" ");
		int length = st.length;
		Arrays.sort(st);
		Arrays.sort(st2);
		boolean result = false;
		System.out.println(len1);
		System.out.println(length);
		if(len1==len2)
		{
			for(int i = 0;i<length;i++)
			{
				if(st[i].equals(st2[i]))
				{
					result = true;
				}
				else
				{
					result = false;
				}
			}
		}
		else
		{
			System.out.println("The strings are different.");
		}
		sc.close();
		if(result == true)
		{
			System.out.println("String 2: "+str2+" is permutation of String 1: "+str);
		}
		else
		{
			System.out.println("String 2: "+str2+" is not a permutation of String 1: "+str);
		}

	}

}
