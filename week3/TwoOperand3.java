package week3;

public class TwoOperand3 {

	public static void main(String[] args) {
		// 비트연산자 &(and) |(or) ^(hat)
		byte num1 = 45;
		byte num2 = 25;
		int result = num1 & num2;

		
		// & 연산자
		System.out.println("======= AND연산 =======");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(result);
		System.out.printf("num1:     %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2:     %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result:   %6s\n", Integer.toBinaryString(result));
		//결과
		//num1:     101101
		//num2:      11001  ==> 겹치는 부분(&)만 1로 받아 출력
		//result:     1001
		
		// | 연산자
		result = num1 | num2;
		System.out.println("======= OR 연산 =======");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(result);
		System.out.printf("num1:     %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2:     %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result:   %6s\n", Integer.toBinaryString(result));
		
		//^(XOR) 연산자 두 값이 다르면 1 같으면 0 ( 0 ^ 1 = 1 )
		result = num1 ^ num2;
		System.out.println("======= hat연산 =======");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(result);
		System.out.printf("num1:     %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2:     %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result:   %6s\n", Integer.toBinaryString(result));
		
		

	}

}
