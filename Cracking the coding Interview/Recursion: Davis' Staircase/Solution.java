import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static int ways(int n, int m) {
		int[] res = new int[n];
		res[0] = 1;
		res[1] = 1;

		for (int i = 2; i < n; i++) {
			res[i] = 0;
			for (int j = 1; j <= m && j <= i; j++)
				res[i] += res[i - j];
		}

		return res[n - 1];

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		for (int a0 = 0; a0 < s; a0++) {
			int n = in.nextInt();

			System.out.println(ways(n + 1, 3));

		}
	}
}

