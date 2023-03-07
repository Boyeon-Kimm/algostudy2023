package algorithm_Java;

import java.util.Scanner;

public class BAEK17608 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �Է� ���� ������ ����
		int N = sc.nextInt();
		
		// �Է� ���� ���� ũ���� �迭 ����
        int[] arr = new int[N];
        
        // �迭�� element ����
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		// �� �� ���� �⺻������ 1�� count
        int cnt = 1;
        // �� �ڿ� �ִ� stick�� ����
        int stick = arr[arr.length - 1];
        
        // �ڿ������� count
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > stick) {
				cnt++;
                stick = arr[i];
			}
		}
		System.out.print(cnt);
        sc.close();
	}
}
