package week2;

public class DataType2 {
	public static void main(String[] args) {
		//char 데이터 타입 =>정수값 저장
		//char은 음수가 없음
		char cData1 = 'A';			
		char cData2 = 65;			//10진수 
		char cData3 = '\u0041';		//16진수
		System.out.println("cData1 : " + cData1);
		System.out.println("cData2 : " + cData2);
		System.out.println("cData3 : " + cData3);

		
		char cData4 = '가';			//문자 리터럴
		char cData5 = 44032;		//10진수
		char cData6 = '\uac00';		//16진수
		System.out.println("cData4 : " + cData4);
		System.out.println("cData5 : " + cData5);
		System.out.println("cData6 : " + cData6);
		
		int cData7 = 'B';			//char을 int에 저장가능
		int cData8 = '하';
		int cData9 = '&';
		System.out.println("cData7 : " + cData7);
		System.out.println("cData8 : " + cData8);
		System.out.println("cData9 : " + cData9);
		
		//char타입 변수의 유니코드값 뽑을때 사용(int에 char 넣기)
		int cData10 = cData7 + cData9;
		char cData11 = (char)(cData7 + cData9);		//데이터타입이 큰데서 작은데로는 불가 ->(char)(값)으로 강제
		System.out.println("cData10 : " + cData10);
		System.out.println("cData11 : " + cData11);
		
	}
}
