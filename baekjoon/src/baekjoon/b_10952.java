package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10952 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num1, num2;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(true) {
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			if(num1 == 0 && num2 ==0)
				break;
			sb.append(num1+num2).append("\n");
			st = new StringTokenizer(br.readLine());
		}
		System.out.print(sb);
	}
}
