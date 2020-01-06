package Chapter08;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		
		try {
			String filePath = System.getProperty("user.dir") + "\\data\\";
			fin= new FileReader(filePath + "test.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			
			new Scanner(System.in).nextLine();//엔터 키
			out.flush();
			fin.close();
			out.close();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
