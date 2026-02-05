package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2164 {
	public static void main(String[] args) {
		Queue <Integer> q = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		while(q.size()!= 1) {
			q.remove();
			int tmp = q.poll();
			q.add(tmp);
		}
		System.out.println(q.poll());
		sc.close();
	}
}
