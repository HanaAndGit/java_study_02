package Chapter07;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_01 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		ArrayList<Integer> kyo = new ArrayList<>(); //교집합
		ArrayList<Integer> cha = new ArrayList<>(); //차집합
		ArrayList<Integer> hap = new ArrayList<>(); //합집합
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
//		for(int i=0; i<list1.size(); i++) {	
//			if(list2.contains(list1.get(i))) {
//				continue;
//			}
//			else {
//				cha.add(list1.get(i));
//				hap.add(list1.get(i));
//			}
//		}
		
		
//		for(int i=0; i<list1.size(); i++) {	
//			if(list1.contains(list2.get(i))) {
//				kyo.add(list2.get(i));
//				hap.add(list2.get(i));
//			}
//			else {
//				hap.add(list2.get(i));
//			}
//		
		
		kyo.addAll(list1); //lit1의 모든 요소를 kyo 에 저장 
		kyo.retainAll(list2); //list2와 kyo의 공통 요소만 남기고 삭제
		
		cha.addAll(list1);
		cha.removeAll(list2); //cha에서 list2와 공통된 요소들을 모두 삭제
		
		hap.addAll(list1);
		hap.removeAll(kyo); //hap에서 kyo와 공통된 모든 요소를 삭제
		hap.addAll(list2); 
			
		
		System.out.println("list1 = " + list1);
		
		System.out.println("list2 = " + list2);
		System.out.println("kyo = " + kyo);
		System.out.println("cha = " + cha);
		System.out.println("hap = " + hap);
	}

}
