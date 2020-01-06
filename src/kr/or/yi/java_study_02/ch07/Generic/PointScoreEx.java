package kr.or.yi.java_study_02.ch07.Generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PointScoreEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> pointMng = new HashMap<String, Integer>();
		System.out.println("포인트 관리 프로그램 입니다.");
		String[] names = {"이재문", "황기태", "김남윤"};
		int[] points = { 40, 50, 60};

		for(int i=0; i<names.length; i++) {
			pointMng.put(names[i], points[i]);
		}
		Set<String> keys = pointMng.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			Integer point = pointMng.get(name);
			
			
		   System.out.print(name + " " + point);
			
			
			
		}

	}

}
