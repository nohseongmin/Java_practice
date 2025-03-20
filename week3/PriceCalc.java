package week3;

public class PriceCalc {

	public static void main(String[] args) {
		//실습2
		int milk = 4500;
		int carrot = 1000;
		int snack = 1500;
		int count_milk = 1;
		int count_carrot = 3;
		int count_snack = 2;
		
		int total = (milk*count_milk)+(carrot*count_carrot)+(snack*count_snack);
		System.out.println("할인 전 상품 가격 :" + total + "원" );
		double discount = total*0.1;
		System.out.println("할인 금액:"+ discount + "원");
		double final_price = total - discount;
		System.out.println("최종금액:"+ final_price + "원");

	}

}
