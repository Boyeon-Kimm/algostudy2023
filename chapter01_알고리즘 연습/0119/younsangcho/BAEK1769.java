package algorithm_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEK1769 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // �Է�
		String str = br.readLine();
        int cnt = 0;
        String answer;
        // �� �ڸ��� �� ������ �ݺ�
        while (str.length() != 1) {
        	int sum = 0;
        	// �� �ڸ� �� �ջ�
	        for (int i = 0; i < str.length(); i++) {
	        	sum += Character.getNumericValue(str.charAt(i));
	        }
	        // �ջ�� ���ڿ�
	        str = Integer.toString(sum);
	        cnt++;
        }
        System.out.println(cnt);
        // 3�� ����̸� YES, �ƴϸ� NO ���
        answer = (Integer.parseInt(str) % 3 == 0) ? "YES" : "NO";
        System.out.print(answer);
    }
}
