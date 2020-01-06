package java_study_02;

import java.util.Arrays;


class Product{
	private String code;
	private String name;
	
	public Product(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" +code + "," + name + "]";
	}

}

class Sale{
	 //no, code, price, saleCnt, marginRate
	private String no;
	private String code;
	private String price;
	private String saleCnt;
	
	public Sale(String no, String code, String price, String saleCnt) {
		super();
		this.no = no;
		this.code = code;
		this.price = price;
		this.saleCnt = saleCnt;
	}

	@Override
	public String toString() {
		return "[no=" + no + ", code=" + code + ", price=" + price + ", saleCnt=" + saleCnt + "]";
	}
	
	
	
}

public class Exam {

	public static void main(String[] args) {
	
		exam01();
		
	}

	private static void exam01() {
		String[] productArr = {
				"A001,아메리카노", //code, name Product p = new Product(code, name)
				"A002,카푸치노", 
				"A003,헤이즐넛",
				"A004,에스프레소",
				"B001,딸기쉐이크",
				"B002,후르츠와인",
				"B003,팥빙수", 
				"B004,아이스초코"};
	//	System.out.print(Arrays.toString(productArr));
		String[] saleArr = {
				"1,A001,4500,150,10", //no, code, price, saleCnt, marginRate
				"2,A002,3800,140,15", 
				"3,B001,5200,250,12", 
				"4,B001,4300,110,11",
				};
		//위의 문장을 이용하여 Product클래스와 Sale클래스를 정의하고 
		//Product[] pdtArrs와 Sale[] saleArrs로 변경하시오.
		Product[] pdtArrs = convert_to_Product(productArr);
		//System.out.println(Arrays.toString(pdtArrs));
		prn1(pdtArrs);
		Sale[] saleArrs = convert_to_Sale(saleArr);
		prn2(saleArrs);
	}
	
	private static void prn1(Product[] pdtArrs) {

		for(int i=0;i<pdtArrs.length; i++) {
			System.out.println(pdtArrs[i]);
		}
	}
	
	private static void prn2(Sale[] saleArrs) {

		for(int i=0;i< saleArrs.length; i++) {
			System.out.println(saleArrs[i]);
		}
	}

	private static Sale[] convert_to_Sale(String[] saleArr) {
		
		Sale[] saleArray = new Sale[saleArr.length];
		for(int i=0; i<saleArr.length; i++) {
			String sale01 = saleArr[i];
			String[] strArr = sale01.split(",");
			
			Sale sale = new Sale(strArr[0],strArr[1],strArr[2],strArr[3]);
			saleArray[i] = sale;
		}
		return saleArray;
	}

	private static Product[] convert_to_Product(String[] productArr) {
		
		Product[] proArr = new Product[productArr.length];
		for(int i=0; i<productArr.length; i++) {

			String pdt01 = productArr[i];
			String[] pdtArr = pdt01.split(",");
			Product pdt = new Product(pdtArr[0], pdtArr[1]);
			proArr[i] = pdt;
		}
		
		return proArr;
	}

}
