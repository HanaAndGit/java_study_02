package kr.or.yi.java_study_02.ch07.Work;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		
		//3개의 Point 객체 삽입 
		v.add(new Point(2,3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1);
		
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		
		//해결하시오
		System.out.println(v.contains(new Point(30, -8)));
		System.out.println(v.indexOf(new Point(30, -8)));

	}

}
