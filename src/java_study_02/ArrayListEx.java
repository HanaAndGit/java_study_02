package java_study_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

//		ArrayList arr = new ArrayList(); // -> 단순히 Object화 한것 (<> 제네릭 타입 없음)
		
		
		List<Integer> arList = new ArrayList<>();
		arList.add(5);
		arList.add(3);
		arList.add(4);
		arList.add(1);
//		arList.add("a"); 숫자만 됨 <Integer>
		
		for(int i=0; i<arList.size(); i++) {
			System.out.println(arList.get(i));
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("이상원");//IndexOf로 검색
		strList.add("황태원");
		strList.add("권수진");
		strList.add("이상원");// list 중복허용 (lastIndexOf 로 검색)
		
		String[] a = new String[strList.size()];
		System.out.println(Arrays.toString(a));
		strList.toArray(a);
		System.out.println(Arrays.toString(a));
		
		
		
		
	/*	for(String name : strList) {
			System.out.println(name);
		}
		
		if(strList.contains("황태원")) {
			System.out.println("포함");
		}else {
			System.out.println("포함x");
		}
		
		
		int findIdx = strList.indexOf("권수진");
		System.out.println(findIdx + " 인덱스 번호");
		
		System.out.println("empty? "+strList.isEmpty());
		
		
		strList.remove(0);//0번 삭제 (index번호 또는 내용 ex. strList.remove("권수진");)
		System.out.println(strList);
		
		
		strList.clear();
		System.out.println(strList);
		System.out.println("empty? " + strList.isEmpty());*/
		/*
		 * addList(arList);
		 * 
		 * for(int i=0; i<arList.size(); i++) { int a= arList.get(i);
		 * System.out.println(a); }
		 */

	}

	private static void addList(List<Integer> arList) {
		System.out.println(arList.size());
		
		arList.add(5);
		System.out.println(arList.size());
		for(int i=0; i<10; i++) {
			arList.add(i);
		}
		System.out.println(arList.size());
		System.out.println(arList);
		//길이 자동증가
		arList.add(1,10);
		System.out.println(arList);
		
		ArrayList<Integer> subList = new ArrayList<Integer>();
		subList.add(20);
		subList.add(21);
		subList.add(22);
		
		arList.addAll(subList);
		System.out.println(arList);
	}

}
