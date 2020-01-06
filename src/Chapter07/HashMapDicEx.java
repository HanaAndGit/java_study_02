package Chapter07;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		System.out.println(dic.put("baby", "아기"));
		System.out.println(dic.put("love", "사랑"));
		System.out.println(dic.put("apple", "사과"));
		System.out.println(dic.put("apple", "사과"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("찾고싶은 단어는?");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String kor = dic.get(eng);
			if(kor == null) {
				System.out.println(eng+"는 없는 단어입니다.");
			}
			else {
				System.out.println(dic.get(kor));
				
			}
			
		sc.close();
		}
		
	}

}
