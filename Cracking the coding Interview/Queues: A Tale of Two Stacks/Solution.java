import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.addLast(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.removeFirst();
			} else if (operation == 3) { // print peek
				System.out.println(queue.peekFirst());
			}
		}
		scan.close();
	}
}

