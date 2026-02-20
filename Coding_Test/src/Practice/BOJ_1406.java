package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1406 {
	public static Stack<Character> stackL = new Stack<Character>();
	public static Stack<Character> stackR = new Stack<Character>();

    
public static void main(String[] args) throws IOException {
    StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String sen = br.readLine();
	for (int i = 0; i < sen.length(); i++) {
		stackL.push(sen.charAt(i));
	}
	int cnt = Integer.parseInt(br.readLine());
	while(cnt -- > 0) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		switch(st.nextToken().charAt(0)) {
		case 'L':
			L();
			break;
		case 'D':
			D();
			break;
		case 'B':
			B();
			break;
		case 'P':
			P(st.nextToken().charAt(0));
			break;
		}

	}
	while (!stackL.isEmpty()) {
	    L();
	}
	while (!stackR.isEmpty()) {
	    sb.append(stackR.pop());	
	}
	System.out.println(sb);
}

public static void L() {
	if (stackL.isEmpty()) {
		return;
	}
	char tmp = stackL.pop();
	stackR.push(tmp);
}

public static void D() {
	if (stackR.isEmpty()) {
		return;
	}
	char tmp = stackR.pop();
	stackL.push(tmp);
}
public static void B() {
	if (stackL.isEmpty()) {
		return;
	}
	stackL.pop();
	
}

public static void P(char c) {
	stackL.push(c);
}
}
