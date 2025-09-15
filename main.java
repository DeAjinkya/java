package filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter q to quit");
			int i;
			int cnt = 0;
			while((i = br.read())!= 'q')
				if(Character.isAlphabetic(i))
					cnt++;
			System.out.println("count = "+cnt);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}
