package kr.or.yi.java_study_02.ch07.Generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ScholarEx {

	public static void main(String[] args) {
		HashMap<String, Double> schMng = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		System.out.println("미래장학금 관리 시스템 입니다.");
		do {
			System.out.println("이름과 학점 >> ");
			String name = sc.next();
			Double grade = sc.nextDouble();
		
			schMng.put(name, grade);
			i++;
		}while(i<5);
		
		System.out.println("장학생 선발 학점 기준 입력 >> ");
		Double standard = sc.nextDouble();
		
		Set<String> keys = schMng.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			Double grade = schMng.get(name);
			
			if(grade>=standard) {
				System.out.print(name + " ");
			}
			
			
		}
		
	}

}








