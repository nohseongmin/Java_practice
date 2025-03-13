package week2;

public class ProductPrice {
	public static void main(String[] args) {
		//실습
		int A = 7;
		int B = 5700;
		double sum = (double)B/A;	//int를 int로 나누면 int이므로 하나를 double로 만들어 소수점 살리기
		//System.out.println("구매수량:" + A + "\n총 구매 금액:" + B + "\n상품 단가:" + sum);
		System.out.printf("구매수량:%d\n총 구매 금액:%d\n상품 단가:%.1f", A, B, sum);
	}
}
