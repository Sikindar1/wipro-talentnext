package java_fundamentals;

import java.util.*;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the values");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		int sum2 = 0;
		boolean h = false;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (a[i] == 6) {
				h = true;
			}
			if (h) {
				sum2 += a[i];
			}
			if (a[i] == 7) {
				h = false;
			}

		}
		if (h) {
			System.out.println(sum);
		} else {
			System.out.println(sum - sum2);
		}
	}
}
