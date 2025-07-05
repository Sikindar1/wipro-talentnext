package java_fundamentals;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the values");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Set<Integer> s = new LinkedHashSet<>();
		for (int i : a) {
			s.add(i);
		}
		System.out.println(s);
	}

}
