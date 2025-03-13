package week2;

public class DataType1 {
	public static void main(String[] args) {
		//실수 데이터타입
		//실수 리터럴 저장
		float fValue = 3.14f; //f필수
		double dValue = 3.14d; //d생략가능 ( 실수 리터럴은 기본이 double )
		System.out.println("fValue:" + fValue);
		System.out.println("dValue:" + dValue);
		
		//실수의 정밀도 테스트
		fValue = 0.1234567890123456789f;
		dValue = 0.1234567890123456789;
		System.out.println("fValue:" + fValue); //float은 데이터손실이 있음
		System.out.println("dValue:" + dValue); //double도 없는건아님
		
		//e 사용
		int iData = 4500000;
		float fData = 3e7f;       //e7 = 10^7
		double dData1 = 3e7;
		double dData2 = 3e-7;
		System.out.println("iData :" + iData);
		System.out.println("fData :" + fData);
		System.out.println("dData1 :" + dData1);
		System.out.println("dData2 :" + dData2);
		
		System.out.printf("iData : %d\n", iData);
		System.out.printf("fData : %f\n", fData);  //뒤에가 짤림
		System.out.printf("dData1 : %f\n", dData1);
		System.out.printf("dData2 : %f\n", dData2); //그건나도마찬가지
		
		System.out.printf("fData : %.4f\n", fData); //%.과 f사이 몇자리까지 볼지 표현
		System.out.printf("dData1 : %.2f\n", dData1); //2자리
		System.out.printf("dData2 : %10.8f\n", dData2); //전체 10자리.중 소수점 8자리까지

		
		
	}
}
