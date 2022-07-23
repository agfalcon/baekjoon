package baekjoon;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class b_2480 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int prize=0;
		
		int dice[] = new int[7];
		for(int i=0;i<3;i++) {
			dice[Integer.parseInt(st.nextToken())]++;
		}
		for(int i=1;i<7;i++) {
			if(dice[i]==3) {
				prize = 10000 + i*1000;
				break;
			}
			if(dice[i]==2) {
				prize = 1000 + i*100;
				break;
			}
			if(dice[i]==1) {
				prize = 100 * i;
			}
		}
		System.out.println(prize);
	}
}
