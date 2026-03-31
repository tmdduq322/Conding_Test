package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_2448 {
static char arr[][];
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int N = Integer.parseInt(br.readLine());
	arr = new char[N][2*N-1];
	for (int i = 0; i < arr.length; i++) {
		Arrays.fill(arr[i], ' ');
	}
	star(N,0,N-1);
	for (int i = 0; i < arr.length; i++) {
		bw.write(arr[i]);
		bw.write("\n");
	}
	bw.flush();
	bw.close();
}

public static void star(int n ,int y,int x) {
	if(n == 3) {
		arr[y][x] = '*';
		arr[y+1][x-1] = arr[y+1][x+1] = '*';
		for (int i = x-2; i <= x+2; i++) {
			arr[y+2][i] = '*';
		}
		return;
	}
	int size = n/2;
	star(size,y,x);
	star(size,y+size,x-size);
	star(size,y+size,x+size);
}
}
