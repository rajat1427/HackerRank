import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer x, Integer y) {
				if (x < y)
					return 1;
				if (x > y)
					return -1;

				return 0;

			}
		});

		System.out.println((double) a[0]);
		System.out.println((double) (a[0] + a[1]) / 2);

		pq1.add(Math.max(a[0], a[1]));
		pq2.add(Math.min(a[0], a[1]));

		for (int i = 2; i < n; i++) {
			if (a[i] < pq2.peek())
				pq2.add(a[i]);
			else
				pq1.add(a[i]);

			if (Math.abs(pq2.size() - pq1.size()) > 1) {
				if (pq1.size() > pq2.size())
					pq2.add(pq1.poll());
				else
					pq1.add(pq2.poll());

			}

			if (pq1.size() > pq2.size())
				System.out.println((double) pq1.peek());
			else if (pq1.size() < pq2.size())
				System.out.println((double) pq2.peek());
			else
				System.out.println((double) (pq1.peek() + pq2.peek()) / 2);

		}

	}
}

