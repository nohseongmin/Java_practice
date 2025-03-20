package week3;

public class TwoOperand2 {

	public static void main(String[] args) {
		//비교연산자 ( < > <= >= == != )
		//논리연산자 (&& ||)
		int charCode1 = 'A';
		if (charCode1 >= 65 && charCode1 <= 90) {
			//false가 하나라도 있으면 fal
			//65~90 ( 알파벳 대문자 )
			System.out.println((char)charCode1 + "는 대문자");
		}

		int charCode2 = 'b';
		if (charCode2>=97&&charCode2<122) {
			System.out.println((char)charCode2 + "는 소문자");
		}
		
		char charCode3 = '9';
		if ( !((char)charCode3 < 48) && !((char)charCode3 > 57) ) {
			System.out.println(charCode3 + "는 0~9 사이 수");
		}
		
		int iVal = 4;
		if ( iVal % 2 == 0) {
			System.out.println("iVal은 2의 배수");
		}		
		if ( iVal % 2 == 0  || iVal % 3 == 0) {
			System.out.println("iVal은 2또는 3의 배수");
		}
	}
}
