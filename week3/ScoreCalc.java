package week3;

public class ScoreSCalc {

	public static void main(String[] args) {
		// 실습
		int score = 50;
		System.out.println("초기 점수:\t\t\t" +score);
		score += 10;
		System.out.println("정답 보너스(+10):\t\t" + score);
		score -= 5;
		System.out.println("오답 감점(-5):\t\t" + score);
		score *= 2;
		System.out.println("보너스 문제 정답(*2):\t" + score);
		score++;
		System.out.println("추가 점수(+1):\t\t" + score);
		score--;
		System.out.println("감점(-1):\t\t\t" + score);
		System.out.println("최종 점수:\t\t\t" + score);
		
	}

}
