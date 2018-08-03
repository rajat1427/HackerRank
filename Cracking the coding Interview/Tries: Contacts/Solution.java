import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static class TrieNode {
		int count;
		HashMap<Character, TrieNode> children;

		public TrieNode() {
			count = 1;
			children = new HashMap<Character, TrieNode>();
		}
	}

	public static class Trie {
		TrieNode root;

		public Trie() {
			root = new TrieNode();
		}

		public void add(String s) {
			TrieNode current = root;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (current.children.containsKey(ch)) {
					current = current.children.get(ch);
					current.count++;
				} else {
					TrieNode node = new TrieNode();
					current.children.put(ch, node);
					current = node;
				}

			}
		}

		public int find(String s) {
			TrieNode current = root;
			for (int i = 0; i < s.length(); i++) {
				if (!current.children.containsKey(s.charAt(i))) {
					return 0; // Key not found
				} else {
					current = current.children.get(s.charAt(i));
				}
			}
			return current.count;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Trie trie = new Trie();
		for (int a0 = 0; a0 < n; a0++) {
			String op = in.next();
			String contact = in.next();

			if (op.equals("add")) {
				trie.add(contact);
			} else {
				System.out.println(trie.find(contact));
			}

		}
	}
}

