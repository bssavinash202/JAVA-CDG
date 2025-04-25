package collections;

import java.util.Scanner;
import java.util.Stack;

public class ReverseDemo {

	public void reverseText() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word to reverse: ");

		String word = sc.nextLine();
		char[] wordArr = word.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (char ch : wordArr) {
			stack.push(ch);
		}

		// pop characters from the stack and build a reversed String

		StringBuilder reversed = new StringBuilder();
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		System.out.println("Reversed String is: " + reversed);
		sc.close();

	}

	public static void main(String[] args) {
		ReverseDemo r = new ReverseDemo();
		r.reverseText();
	}
}
