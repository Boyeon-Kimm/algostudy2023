package algorithm_Java;

import java.util.Scanner;

public class BAEK12605 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			// ���� �������� ���� �迭 ����
			String[] strArr = str.split(" ");
			System.out.printf("Case #%d:", i+1);
			// �ں��� ���
			for (int j = strArr.length - 1; j >= 0; j--) {
				System.out.printf(" %s", strArr[j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
