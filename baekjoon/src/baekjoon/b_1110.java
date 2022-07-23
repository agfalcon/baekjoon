package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b_1110 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int i = 0;
		while(true) {
			temp = (temp/10 + temp%10)%10 + temp%10*10;
			i++;
			if(temp==num)
				break;
		}
		System.out.println(i);
	}
}
