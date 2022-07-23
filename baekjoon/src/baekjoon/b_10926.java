package baekjoon;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b_10926 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer id = new StringBuffer(br.readLine());
		id.append("??!");
		System.out.print(id);
	}
}
