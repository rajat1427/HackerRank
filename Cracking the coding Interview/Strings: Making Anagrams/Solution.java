import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {
	public static int numberNeeded(String first, String second) {

		int count = 0;
		int[] a = new int[26];
		for (int i = 0; i < first.length(); i++) {
			a[first.charAt(i) - 'a']++;
		}

		for (int i = 0; i < second.length(); i++) {
			a[second.charAt(i) - 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			count = count + Math.abs(a[i]);
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}

