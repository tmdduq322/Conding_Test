package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12891 {
	static int[] arr = new int[4];
	static int[] subarr = new int[4];
	static int Checkcnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int cnt = 0;
		char[] DNA = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] == 0) {
				Checkcnt ++;
			}
		}
		for (int i = 0; i < P; i++) {
			Add(DNA[i]);
		}
		if (Checkcnt == 4) {
			cnt ++;
		}
		for (int i = P; i < S ; i++) {
			int j = i - P;
			Add(DNA[i]);
			Remove(DNA[j]);
			if (Checkcnt == 4) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
	public static void Add(char c) {
		switch(c) {
		case 'A':
			subarr[0] ++;
			if (subarr[0] == arr[0]) {
				Checkcnt ++;
			}
			break;
		case 'C':
			subarr[1] ++;
			if (subarr[1] == arr[1]) {
				Checkcnt ++;
			}
			break;
		case 'G':
			subarr[2] ++;
			if (subarr[2] == arr[2]) {
				Checkcnt ++;
			}
			break;
		case 'T':
			subarr[3] ++;
			if (subarr[3] == arr[3]) {
				Checkcnt ++;
			}
			break;
		default:
			break;
		}
	}
	
	public static void Remove(char c) {
		switch(c) {
		case 'A':
			if (subarr[0] == arr[0]) {
				Checkcnt --;
			}
			subarr[0] --;

			break;
		case 'C':
			if (subarr[1] == arr[1]) {
				Checkcnt --;
			}
			subarr[1] --;
			
			break;
		case 'G':
			if (subarr[2] == arr[2]) {
				Checkcnt --;
			}
			subarr[2] --;
			
			break;
		case 'T':
			if (subarr[3] == arr[3]) {
				Checkcnt --;
			}
			subarr[3] --;
			break;
		default:
			break;
		}
	}
}
