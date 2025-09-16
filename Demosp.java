package ass10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Demosp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new FileReader("D:\\java\\ass10\\sample.txt"));
		String str;
		int max = 0;
		int count = 0;
		while((str=br.readLine())!=null) {
			count = str.length();
			if(count>max) {
				max = count;
			}
		}
		br.close();
		
		br = new BufferedReader(new FileReader("D:\\java\\ass10\\sample.txt"));
		
		int diff;
		while((str =br.readLine())!=null) {
			count = str.length();
			diff = max-str.length();
			for(int i = 0;i<diff;i++) {
				System.out.print("-");
			}
			System.out.println(str);
		}
		
		br.close();
		

	}

}
