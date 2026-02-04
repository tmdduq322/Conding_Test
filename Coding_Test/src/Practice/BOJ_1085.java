package Practice;

import java.util.Scanner;

public class BOJ_1085 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int w = sc.nextInt();
	int h = sc.nextInt();
	sc.close();
	int [] a = {x,w-x,y,h-y};
	int min = 1000;
	for (int i = 0; i < a.length; i++) {
		if (a[i]<min){
			min = a[i];
		}
	}
	System.out.println(min);
}
}
