package Practice;

import java.util.Scanner;

public class BOJ_2947 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 4; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
					for (int k = 0; k < arr.length; k++) {
						sb.append(arr[k]+" ");
					}
					sb.append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
