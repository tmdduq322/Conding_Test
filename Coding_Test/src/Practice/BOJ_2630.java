package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2630 {
	static int Bluecnt;
	static int Whitecnt;	
	static int arr[][];
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	arr = new int[N][N];
	for (int i = 0; i < N; i++) {
		st = new StringTokenizer(br.readLine());
		for (int j = 0; j < N; j++) {
			arr[i][j] = Integer.parseInt(st.nextToken());
		}
	}
	quarter(N,0,0);
	System.out.println(Whitecnt+"\n"+Bluecnt);
}
public static void quarter(int size, int row, int col) {
	if(check(size, row, col)) {
		return;
	}
	else {
		int newsize = size/2;
		quarter(newsize,row,col);
		quarter(newsize,row + newsize,col);
		quarter(newsize,row,col + newsize);
		quarter(newsize,row + newsize,col + newsize);
	}
}

public static boolean check(int size,int row, int col) {// 들어온 값의 arr위치 참색 사각형이 있다면 true 없다면 false
	int checkint = arr[row][col];
	for (int i = row; i < row + size; i++) {
		for (int j = col ; j < col + size; j++) {
			if (arr[i][j] != checkint) {
				return false;
			}
		}
	}
	if (checkint == 1) {
		Bluecnt ++;
		return true;
	}
	else if (checkint == 0) {
		Whitecnt ++;
		return true;
	}
	return false;
}
}
