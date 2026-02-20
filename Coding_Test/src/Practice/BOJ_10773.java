package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10773 {
	public static int Stack [];
	public static int index ;
	
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	Stack = new int[n];
	index = 0;
	while (n-- > 0) {
		int cmd = Integer.parseInt(br.readLine());
		if (cmd == 0) {
			index --;
			Stack[index] = 0;
		}
		else {
			Stack[index] = cmd;
			index ++;
		}
	}
	int sum = 0;
	for (int i = 0; i < Stack.length; i++) {
		sum += Stack[i];
	}
	System.out.println(sum);
}
}
