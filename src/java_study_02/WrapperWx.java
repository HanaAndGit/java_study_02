package java_study_02;

public class WrapperWx {

	public static void main(String[] args) {
//		doWrapper();
		System.out.println(Character.toLowerCase('A'));
		
		char c1 = '4';
		char c2 = 'F';
		
		
		
		
		if(Character.isDigit(c1)){
			System.out.println(c1+"는 숫자");
		}
		
		//알파벳화  API 
		if(Character.isAlphabetic(c2)){
			System.out.println(c2+"는 영문자");
		}
		//API 사용x
		
		if(c2 >= 'a' && c2<= 'z' || c2 >= 'A' && c2 <= 'Z') {
			System.out.println(c2+"는 영문자");
		}
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));

	}

	private static void doWrapper() {
		Integer i = 31;//auto boxing
		Integer i2 = Integer.valueOf(31);
		Integer i3 = new Integer(31);
		Integer i4 = Integer.valueOf("31");
		
		System.out.printf("%d %d %d %d %n", i, i2, i3, i4);
		System.out.println(Integer.bitCount(10));//31을 2진수로 변환 후 1 의 갯수 반환 = 5개
		System.out.println(i.toHexString(31));//31을 16진수로 변환 문자열 리턴
		System.out.println(Integer.toBinaryString(31));
		
		
		//싷수형으로 반환 
		System.out.println(i2.floatValue());
		System.out.println(i2.doubleValue());
		
		//문자열로 반환
		String str = i2.toString();
		System.out.println(str);
	}

}
