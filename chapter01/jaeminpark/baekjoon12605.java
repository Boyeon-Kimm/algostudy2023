package baekjoonPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon12605 {	//�ܾ� ���� ������ ����(��)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // test_case ���� �ޱ�
		ArrayList<String> list = new ArrayList<>(); // ��� case�� �޾ƿ� ArrayList
		String sentence; // list �� ������ case ���� �޾ƿ� ����
		sc.nextLine(); // ���� ������ �� �ؿ� ������ ���� ���°� ���� ���ϰ� ®�ٰ� �Ӹ� �߰ſ��� �ڵ� ����(�ּ�ó��)
		for (int i = 0; i < N; i++) {
			list.add(sc.nextLine()); // test_case��ŭ ���� ���� list�� �߰�
		}
		// System.out.println("list�� ������: " + list.size());
		for (int i = 0; i < list.size(); i++) {
			// System.out.println("list.get()�� ��: " + list.get(i));
			sentence = list.get(i); // sentence ������ list�� i��°�� �ش��ϴ� ����(case) ����
			String[] sArr = sentence.split(" "); // sentence ������ ����� ������ ������⸦ �������� �и��Ͽ� sArr �迭�� ����
			// System.out.println("sArr: " + Arrays.toString(sArr));
			System.out.print("Case #" + (i + 1) + ":"); // case ����
			for (int j = sArr.length - 1; j >= 0; j--) {
				System.out.print(" " + sArr[j]);
			} // for�� ��(�� ���̽� �� ���)
			System.out.println();
		}

//		for (int test_case = 1; test_case <= N; test_case++) {
//			String sentence = sc.nextLine(); // ������ sentence ������ ����
//			sc.nextLine();
//			String[] sArr = sentence.split(" ");// sentence ������ ������ִ� ���� �������� �и��ؼ� sArr �迭�� ����
//			ArrayList<String> reverseArr = new ArrayList<>();// sArr �迭�� ���� �ٲ㼭 ���� ArrayList
//			System.out.print("Case #" + test_case + ":");
//			if (sArr.length != 1) {
//				for (int i = sArr.length - 1; i >= 0; i--) {
//					reverseArr.add(sArr[i]);
//				} // for�� �� (sArr �ڿ������� reverseArr�� �߰�)
//				for (int i = 0; i < reverseArr.size(); i++) {
//					sc.nextLine();
//					System.out.print(" " + reverseArr.get(i));
//				} // for�� �� (reverseArr ���)
//			} else {
//				System.out.print(" " + sArr[0]);
//			}
//		} // test_case for�� ��
	}
}
