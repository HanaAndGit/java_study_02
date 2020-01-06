package kr.or.yi.java_study_02.ch07.Generic;

import java.util.ArrayList;

public interface DaoInterface<T> {
	
	public boolean insertStudent(T student);
	
	public boolean deleteStudent(T student);
	
	public ArrayList<T> listStudent();
	
	public boolean updateStudent(T student);
	
	public T searchStudent(T student);
	
}
