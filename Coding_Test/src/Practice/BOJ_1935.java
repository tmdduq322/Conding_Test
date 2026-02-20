package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1935{
public static void main(String[] args) throws IOException {
	Stack<Double> stack = new Stack<Double>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int N = Integer.parseInt(br.readLine());
	int[] arr = new int[N];
	String cmd = br.readLine();
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = Integer.parseInt(br.readLine());
	}
	
	for(int c : cmd.toCharArray()) {
		if (65 <= c && c <= 90) {
			stack.push((double) arr[c-65]);
		}
		if (c == 42 || c == 43 || c == 45 || c == 47) {
			switch(c) {
			case 42 : // *
				double a1 = stack.pop();
				double rst1 = stack.pop() * a1;
				stack.push(rst1);
				break;
			case 43 : // +
				double a2 = stack.pop();
				double rst2 = stack.pop() + a2;
				stack.push(rst2);
				break;
			case 45 : // -
				double a3 = stack.pop();
				double rst3 = stack.pop() - a3;
				stack.push(rst3);
				break;
			case 47 : // /
				double a4 = stack.pop();
				double rst4 = stack.pop() / a4;
				stack.push(rst4);
				break;
			}
		}
	}
	System.out.printf("%.2f",stack.pop());
}

}
