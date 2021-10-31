import java.io.BufferedReader;
import java.io.InputStreamReader;
class nameCompress{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		for(int i=0;i<str.length-1;i++)
			System.out.print(str[i].charAt(0)+".");
		System.out.print(str[str.length-1]);
	}
}