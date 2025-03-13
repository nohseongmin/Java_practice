package week2;

public class Print1 {
	public static void main(String[] args) {
		//단축키와 주석
		//main 메소드 단축키 : main + ctrl + spacebar
		//main 메소드는 필수(JVM이 이걸 실행하기떄문 = 시작점)
		//출력 단축키 : sysout + ctrl + spacebar
		//주석 토글 : ctrl + // 
		System.out.println("객체지향 프로그래밍");
		/* 여러줄 주석처리
		System.out.println("객체");
		System.out.println("지향");
		System.out.println("프로그래밍");
		*/
		
		//숫자 출력시 주의 : 
		System.out.println(17+35); // 52
		System.out.println("17 + 35 =" + 17+35); // 17+35=1735 >>>문자열이 됨
		System.out.println("17 + 35 =" + (17+35)); // 17+35=52 >>>괄호로 처리
		
		
		//출력 포맷 다양성
		//printf 또한 사용가능
		//%s : 문자열
		//%d : 정수
		//%f : 실수 ( \n 내장 X )
		// C언어와 똑같음
		System.out.printf("이름 : %s\n", "홍길동"); //printf에서는 ,로 대입, 줄바꿈 없음
		System.out.printf("나이 : %d세\n", 25);
		System.out.printf("과목 : %s %s %s\n", "객체", "지향", "프로그래밍", "언어"); //필요 개수 이상으로 있어도 상관없음,적으면 X
		
	}
}
