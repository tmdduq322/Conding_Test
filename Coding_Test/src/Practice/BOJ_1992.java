package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1992 {
static int arr[][];
static StringBuilder sb = new StringBuilder();
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	arr = new int[N][N];
	for (int i = 0; i < N; i++) {
		String s = br.readLine();
		for (int j = 0; j < N; j++) {
			arr[i][j] = s.charAt(j) - '0';
		}
	}
	find(0,0,N);
	System.out.println(sb);
}
public static void find(int row, int col, int n) {
	if(check(row,col,n)) {
		if (arr[col][row] == 1) {
			sb.append("1");
			return;
		}
		else {
			sb.append("0");
			return;
		}
	}
	sb.append("(");
	int newn = n/2;
	find(row,col,newn);
	find(row+newn,col,newn);
	find(row,col+newn,newn);
	find(row+newn,col+newn,newn);
	sb.append(")");
}

public static boolean check(int row, int col, int n){
	int a = arr[col][row];
	for (int i = col; i < col + n; i++) {
		for (int j = row; j < row + n; j++) {
			if(a != arr[i][j]) {
				return false;
			}
		}
	}
	return true;
}
}
