package algorithm_Java;

import java.util.Scanner;

public class BAEK2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 100 x 100 �迭 ����
		int[][] arr = new int[100][100];
		
		int cnt = 0;
		
		for (int i = 0; i < N; i++) { 
			int x = sc.nextInt();
			int y = sc.nextInt();
			// �ش� ��ǥ�κ��� x��ǥ + 10, y��ǥ  + 10���� ���� 1 ����
			for (int a=x; a<x+10; a++) for (int b = y; b < y+10; b++) arr[a][b] =1;
		}
		
		// �迭 �� ���Ұ� 1�� �κ� ���� count
		for (int i = 0; i<100; i++) for(int j = 0; j<100; j++) if(arr[i][j]==1) cnt++; 
		
		System.out.println(cnt);
	}
}
