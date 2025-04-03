package week5;
import java.util.Scanner;

public class UpNdown {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100+1);
		Scanner sc = new Scanner(System.in);
		int guess;
		while(true) {
			System.out.println("숫자 맞혀보시오 : ");
			guess = sc.nextInt();
			if(guess>100) {System.out.println("1-100 사이 값을 입력하세요");}
			else if(guess>answer) {System.out.println("숫자가 너무 큽니다.");}
			else if(guess<answer) {System.out.println("숫자가 너무 작습니다.");}
			else if(guess<=0) {System.out.println("1-100사이 값을 입력하세요");}
			else {
				System.out.println("정답");
				break;
			};
			System.out.println("종료");
		}
	}
}
