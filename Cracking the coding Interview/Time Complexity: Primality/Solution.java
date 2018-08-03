import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static String isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return "Not prime";
		}

		return "Prime";

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		for (int a0 = 0; a0 < p; a0++) {
			int n = in.nextInt();
			if (n == 1)
				System.out.println("Not prime");
			else
				System.out.println(isPrime(n));
		}
	}
}

