package week3;

public class OneOperand2 {
	public static void main(String[] args) {
		//단항연산 中 ++, --(증감연산자)
		//++ = 값에 1더함
		//-- = 값에 1뺌
		
		int x=10;
		int y=10;
		int z;
		
		//++이 변수 앞에있으면 명령문 전에 증가
		//		   뒤에있으면 명령문 후에 증가(그 라인이 끝나고 증가한다고 보먼됨(맨마지막에)
		System.out.println("++x:" + (++x));
		System.out.println("x++:" + (x++));
		System.out.println("x:" + x);
		
		//System.out.println("--y:" + (--y));
		//System.out.println("y--:" + (y--));
		//System.out.println("y:" + y);
		
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		z = ++x + y--;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	
				
	}
}
