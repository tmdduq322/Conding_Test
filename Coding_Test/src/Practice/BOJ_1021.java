package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_1021 {
public static void main(String[] args) throws IOException {
	LinkedList <Integer> deque = new LinkedList<Integer>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int N = Integer.parseInt(st.nextToken());
	for (int i = 1; i <= N; i++) {
		deque.add(i);
	}
	int num = Integer.parseInt(st.nextToken());
	int[] arr = new int[num];
	st = new StringTokenizer(br.readLine());
	int cnt = 0;
	for (int i = 0; i < num; i++) {
		arr[i] = Integer.parseInt(st.nextToken());
	}
	int index = 0;
	int halfindex = 0;
	for (int i = 0; i < num; i++) {
		index = deque.indexOf(arr[i]);
		if (deque.size() % 2 == 0) {
			halfindex = deque.size() / 2 -1;
		}
		else {
			halfindex = deque.size() / 2;
		}
		if (index <= halfindex) {
			int n = index;
			int tmp = 0;
			while(n-- > 0) {
			tmp = deque.poll();
			deque.addLast(tmp);
			cnt ++;
			}
			deque.poll();
		}
		else {
			int n = deque.size() - index;
			int tmp = 0;
			while(n-- > 0) {
			tmp = deque.pollLast();
			deque.addFirst(tmp);
			cnt ++;
			}
			deque.poll();
		}
	}
	System.out.println(cnt);
}
}
