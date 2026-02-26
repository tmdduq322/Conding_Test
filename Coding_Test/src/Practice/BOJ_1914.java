package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BOJ_1914 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	System.out.println(BigInteger.TWO.pow(N).subtract(BigInteger.ONE));
	
	if (N <= 20) {
		hanoi(N,1,2,3);
	}
	bw.flush();
	bw.close();
	br.close();
}

public static void hanoi(int N, int from, int tmp,int to) throws IOException {
	if (N == 1) {
		bw.write(from +" " + to + "\n");
	}
	else {
		hanoi(N-1,from,to,tmp);
		bw.write(from +" " + to + "\n");
		hanoi(N-1,tmp,from,to);
	}
}
}
