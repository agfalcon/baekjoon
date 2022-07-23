package baekjoon;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class b_18108 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		y-=543;
		System.out.println(y);
	}
}
