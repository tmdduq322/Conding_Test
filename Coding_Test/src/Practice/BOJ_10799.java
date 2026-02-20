package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10799 {
public static void main(String[] args) throws IOException {
	Stack<Character> stack = new Stack<Character>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String cmd = br.readLine();
	String recmd = cmd.replace("()", "*");
	int cnt = 0;
	for (int i = 0; i < recmd.length(); i++) {
		char c = recmd.charAt(i);
		switch(c) {
		case '(':
			stack.push(c);
			break;
		case ')':
			stack.pop();
			cnt ++;
			break;
		case '*':
			cnt += stack.size();
			break;
		}
	}
	System.out.println(cnt);
	br.close();
	
}
}
