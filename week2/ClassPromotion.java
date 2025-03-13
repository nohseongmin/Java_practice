package week2;

public class CkassPromotion {
	public static void main(String[] args) {
		//자동 타입 변환
		byte bVal = 25;	//byte -> int
		int iVal = bVal;
		System.out.println(iVal);
		
		char cVal = '가'; // char -> int
		iVal = cVal;
		System.out.println(cVal);
		
		long lVal = iVal;
		System.out.println(lVal);
		
		double dVal =iVal;
		System.out.println(dVal);
	}
}
