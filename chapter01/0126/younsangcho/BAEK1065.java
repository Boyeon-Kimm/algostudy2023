package algorithm_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEK1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        
        int result = 0;
        // 100�̸� ���ڴ� �Ѽ��� ������ N�� ����
        if (N < 100) {
        	result = N;
        // 1000�� �� (4�ڸ� ������ ��)
        } else if (N == 1000) {
        	result = 144;
        // (101 ~ 1000�� ��)
        } else {
        	// �⺻������ �Ѽ��� 99��
        	result = 99;
        	// 100�� �ڸ� ���� ����
        	int hund = Character.getNumericValue(str.charAt(0));
        	
        	for (int j = 1; j <= hund; j++) {
        		// 100�� �ڸ�, 10�� �ڸ�, 1�� �ڸ��� �� ���� �� (ex. 222)
        		if (j*100+j*10+j <= N) result++;
        		
        		// ���� ��� ���� ���� �� (ex. 210)
        		for (int i = 1; j - 2*i >= 0; i++) {
        			if ( (j*100)+((j-i)*10)+(j-2*i) <= N ) result++;
        		}
        		// ���� ��캸�� Ŭ �� (ex. 234, 246, 258)
        		for (int i = 1; j + 2*i < 10; i++) {
        			if ( (j*100)+((j+i)*10)+(j+2*i) <= N ) result++;
        		}
        	}
        }
        System.out.println(result);
    }


}
