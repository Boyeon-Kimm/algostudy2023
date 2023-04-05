package algorithm_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BAEK1516 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		int[] inDegree = new int[N+1];
		int[] second = new int[N+1];
		int[] newSec = new int[N+1];
		List<Integer>[] list = new List[N+1];
		for (int i = 0; i <= N; i++) {
			list[i] = new ArrayList<>();
        }
		for (int i = 1; i <= N; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < str.length - 1; j++) {
				if (j == 0) second[i] = Integer.parseInt(str[j]);
				else {
					list[Integer.parseInt(str[j])].add(i);
					inDegree[i]++;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			if (inDegree[i] == 0) {
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int node = q.poll();
			for (int i = 0; i < list[node].size(); i++) {
				// Queue에서 꺼낸 노드에서 나가는 간선을 그래프에서 제거
				inDegree[list[node].get(i)] -= 1;
				// 건물을 짓는데 제일 오래 걸린 시간을 계속해서 update 해준다.
				newSec[list[node].get(i)] = Math.max(newSec[list[node].get(i)], newSec[node] + second[node]);
				// 진입 차수가 0이 된 노드를 Queue에 삽입한다.
				if (inDegree[list[node].get(i)] == 0) q.add(list[node].get(i));
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.println(newSec[i]+second[i]);
		}
	}
}
