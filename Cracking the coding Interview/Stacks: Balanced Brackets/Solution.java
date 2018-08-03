import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static boolean isMatchingPair(char c1, char c2) {
		if (c1 == '{' && c2 == '}')
			return true;
		else if (c1 == '(' && c2 == ')')
			return true;
		else if (c1 == '[' && c2 == ']')
			return true;
		else
			return false;

	}

	static boolean isBalanced(String xpression) {

		Deque<Character> stack = new ArrayDeque<Character>();

		int i;
		int len = xpression.length();

		for (i = 0; i < len; i++) {

			if (xpression.charAt(i) == '{' || xpression.charAt(i) == '[' || xpression.charAt(i) == '(')
				stack.addFirst(xpression.charAt(i));

			if (xpression.charAt(i) == '}' || xpression.charAt(i) == ']' || xpression.charAt(i) == ')') {
				if (stack.isEmpty())
					return false;

				else if (!isMatchingPair(stack.removeFirst(), xpression.charAt(i)))
					return false;

			}

		}

		if (stack.isEmpty())
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			boolean answer = isBalanced(expression);
			if (answer)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

