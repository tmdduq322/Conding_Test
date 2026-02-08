package Practice;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack <Integer>stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		boolean rst = true;
		int N = sc.nextInt();
		int [] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		int s = 1;
		for (int i = 0; i < N; i++) {
			if(s <= num[i]) {
				while(s <= num[i]) {
					stack.push(s++);
					sb.append("+\n");
				}
			stack.pop();
			sb.append("-\n");
			}
			else {
				int n = stack.pop();
				if (n > num[i]) {
					System.out.println("NO");
					rst = false;
					break;
				}
				else {
					sb.append("-\n");
				}
			}
		}
		if (rst) {System.out.println(sb);}
		sc.close();
	}
}
