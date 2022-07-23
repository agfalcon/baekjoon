package baekjoon;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class b_2525 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int cook = Integer.parseInt(br.readLine());
		int cook_h = cook/60;
		int cook_m = cook%60;
		hour = hour + cook_h;
		min = min+cook_m;
		if(min >= 60) {
			min = min-60;
			hour++;
		}
		if(hour>=24) {
			hour%=24;
		}
		System.out.println(hour + " " + min);
	}
}
