package week3;

public class OneOperand1 {
	public static void main(String[] args) {
		//단항 연산자 : +, -, ++, --, !, ~, 
		int iValue1 = 100;
		int iValue2 = -100;
		double dValue1 = 3.14;
		double dValue2 = -10.5;
		
		int result1 = +iValue1;
		int result2 = -iValue2;
		System.out.println("result1 = "+result1);
		System.out.println("result2 = "+result2);
		
		//int보다 작은 데이터타입연산은 결과가 int임
		short sValue = 100;
		//short sResult = -sValue; 잘못된 코드
		int sResult = sValue;
		System.out.println("sResult = "+sResult);
		
		//큰건 가능
		long lValue = 100;
		long lResult = -100;
		System.out.println(lResult);
		
		
		
	}
}
