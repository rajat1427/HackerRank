import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int coins[] = new int[m];
		for (int i = 0; i < m; i++) {
			coins[i] = in.nextInt();
		}

		int money = n;

		long[] DP = new long[money + 1];
		DP[0] = (long) 1;
		for (int coin : coins) {
			for (int j = coin; j < DP.length; j++) {
				DP[j] += DP[j - coin];
			}
		}
		System.out.println(DP[money]);

	}
}

