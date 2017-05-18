package stack;

import java.math.BigInteger;
import java.util.Scanner;

public class ArrayStack {
	public static BigInteger[] arr = new BigInteger[2000020];
	public static int top = 0;

	public static boolean isEmpty() {
		return top == -1;
	}

	public static void push(BigInteger i) {
		arr[top++] = i;
	}

	public static BigInteger pop() {
		if (isEmpty()) {
			//System.out.println("No element to pop");
		}
		top--;
		return arr[top];
	}

	public static BigInteger peek() {
		if (isEmpty()) {
			//System.out.println("No element to pop");
		}
//		System.out.println(arr[top]);
		int peekItem=top-1;
		return arr[peekItem];
	}

	public static int depth() {
		System.out.println(top);
		return top;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the flow: ");

		while (sc.hasNext()) {
			String s = sc.next();
			if (s.trim().matches("-?[1-9]\\d*|0")) {
				BigInteger i = new BigInteger(s);
				ArrayStack.push(i);
				ArrayStack.depth();

			} else if (s.equals("-")) {
				System.out.println(ArrayStack.pop());
			}

			else if (s.equals("?")) {
				//ArrayStack.peek();
				System.out.println(ArrayStack.peek());
			}

			else if (s.equals("#")) {
				ArrayStack.depth();
			}

			else
				System.out.println(s + " is Invalid character");
			
		}

	}
}
