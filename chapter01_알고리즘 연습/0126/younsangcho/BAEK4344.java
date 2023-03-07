package algorithm_Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BAEK4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int C = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < C; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] arr = new int[1000];
        	int num = Integer.parseInt(st.nextToken()); // �л� ��
        	int sum = 0; // ���� ����
        	// �л� ���� �Է�
        	for (int j = 0; j < num; j++) {
        		arr[j] = Integer.parseInt(st.nextToken());
        		sum += arr[j];
        	}
        	
        	double aver = sum / num; // ���
        	int cnt = 0; // ��� ������ ���� �л� ��
        	
        	for (int j = 0; j < num; j++) {
        		if (arr[j] > aver) cnt++;
        	}
        	
        	double pp = (cnt / (double) num) * 100; // ����� ���� �л� ����
        	System.out.println(String.format("%.3f%%", pp));
        }
	}
}