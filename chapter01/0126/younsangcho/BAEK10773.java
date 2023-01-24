package algorithm_Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BAEK10773 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[K];
        int idx = 0; int sum = 0;
        
        for(int i = 0; i < K; i++) {
        	int e = Integer.parseInt(br.readLine());
        	// 0�� �Է����� ��, ���տ��� �迭�� ������ �� ���� �� �迭���� ������ �� 0���� reset
        	if (e == 0) {
        		sum -= arr[--idx];
        		arr[idx] = 0;
        	// 0 �̿��� �ٸ� ���� �Է����� ��, �迭�� �߰� �� ���տ� ����
        	} else {
        		arr[idx] = e;
        		sum += arr[idx];
        		idx++;
        	}
        }
        System.out.println(sum);
	}
}
