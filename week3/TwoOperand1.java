package week3;

public class TwoOperand1 {
	public static void main(String[] args) {
		//이항연산자 : 문자열의 '+'
		
		String str1 = "jdk" + 6.0;
		String str2 = str1 + "특징";
		System.out.println("str2 = " + str2);
		
		String str3 = 6.0 + "jdk";
		System.out.println("str3 = " + str3);
	}
}
