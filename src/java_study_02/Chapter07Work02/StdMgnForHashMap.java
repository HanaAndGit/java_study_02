package java_study_02.Chapter07Work02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class StdMgnForHashMap implements StdManagerInterface {
	private HashMap<Integer, Student> stdMap;
	
	
	public StdMgnForHashMap() {
		this.stdMap = new HashMap<Integer, Student>();
	}

	/* put이 중복일 경우 value 값 리턴, 추가된 경우 null 리턴
	 * put할때 리턴타입 / (ex.  dic.put("baby", "아기"); ->sysout으로 출력하면 중복 값이 있을 경우 value, 없는 경우 null */
	@Override
	public boolean insertStudent(Student student) {
		Student res = stdMap.put(student.getStdNo(), student);
		return res==null; //중복 값이 없고 추가 되면  res == null; -> true / 중복 값이 있으면 res != null, value 값을 돌려주니까 false 
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Student> listStudent() {
		ArrayList<Student> stdlist = new ArrayList<Student>();
		Set<Integer> keys = stdMap.keySet();
		for(Integer stdNo : keys) {
			stdlist.add(stdMap.get(stdNo));
		}
		return stdlist;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student searchStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
