package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2447 {
	static char [][] arr;
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int N = Integer.parseInt(br.readLine());
	arr = new char[N][N];
	star(N,0,0,false);
	for (int i = 0; i < N; i++) {
		bw.write(arr[i]);
		bw.write("\n");
	}
	bw.flush();
	bw.close();
	br.close();
}

public static void star(int N, int x, int y, boolean blank) {
	if(blank) {
		for (int i = x; i < x + N; i++) {
			for (int j = y; j < y + N; j++) {
				arr[i][j] = ' ';
			}
		}
		return;
	}
	if(N == 1) {
		arr[x][y] = '*';
		return;
	}
	int cnt = 0;
	int size = N /3;
	for (int i = x; i < x + N; i+= size) {
		for (int j = y; j < y + N; j+= size) {
			cnt ++;
			if (cnt == 5) {
				star(size,i,j,true);
			}
			else {
				star(size,i,j,false);
			}
		}
	}
}
}
