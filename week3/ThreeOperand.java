package week3;

public class ThreeOperand1 {

	public static void main(String[] args) {
		// 삼항연산 ( 조건식) ? True일떄 실행문 : False일때 실행문
		//모든 구조는 필수
		
		int num1 = 35;
		int num2 = 47;
		String result;
		
		
		result = (num1>num2) ? "num1이 더큼" : "num2가 더큼";
		System.out.println(result);
		
		boolean bResult;
		bResult = (num1>num2) ? true : false;
		System.out.println(bResult);
		
		System.out.println();
		int score = 85;
		String sResult;
		sResult = (score>=90)? "우수" : ((score>=80) ? "보통" : "미달") ;
		System.out.println(sResult);

	}

}
