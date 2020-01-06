package kr.or.yi.java_study_02.ch08.Chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//readEx01(); 
		//readEx02();
		
		//System.out.println(System.getProperty("user.dir"));
		
		String filePath = System.getProperty("user.dir") + "\\data\\department.txt";
		System.out.println(filePath);
		
		readFile("department.txt");
		readFile("employee.txt");
		
		readFileInputStream("department.txt");
		
		
		
	}

	private static void readFileInputStream(String fileName) {
		String filePath = System.getProperty("user.dir") + "\\data\\department.txt";
		File file = new File(filePath);
		try(FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, "UTF8")){
				int c;
				while((c = isr.read())!=-1) {
					System.out.print((char)c);
				}
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void readFile(String fileName) {
		String filePath = System.getProperty("user.dir") + "\\data\\" + fileName;
		File file = new File(filePath);
		
		
		//try-catch-resource => 자동으로 close 호출 (Closable interface 를 구현한 클래스만 가능)
		try (FileReader fr = new FileReader(file);){
			//char[] buf = new char[1024];
			int c;
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
			System.out.println("===Encoding : " + fr.getEncoding());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			//System.out.println("파일을 읽는 도중에 문제가 발생했습니다.");
		}
	}

	private static void readEx02() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("C:\\Windows\\system.ini");
		int c;
		while((c = fr.read()) != -1) {
			System.out.print((char)c);
		}
		fr.close();
	}

	private static void readEx01() {
		try {
			readEx02();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("해당 파일이 존재하지 않음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 읽는 도중에 문제가 발생했습니다.");
		}
	//Exception 상속관계 Exception <- IOExcetion <- FileNotFoundException
		//IOException 밑에 FileNotFoundException이 오면 에러발생 (상속 관계에서 하위에 있기 때문에)
		//모든 에러의 부모는 Exception 
	}

}
