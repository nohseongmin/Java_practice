package week2;

public class Casting {
	public static void main(String[] args) {
		int iData = 65;			//int(2) -> char(4) 일반적으로 불가, 강제로 변경
		char cData = (char)iData;
		System.out.println(cData);
		
		long lData = 500;
		iData = (int)lData;		//long(8) -> int(4) 불가, 강제로 변경
		System.out.println(iData);
		
		double dData = 3.14;
		iData = (int)dData;		//double(8) -> int(4) 불가, 캐스팅
		System.out.println(iData);
		
		//casting 전 데이터 손실 확인
		int iVal = 128;
		byte bVal = (byte)iVal;
		System.out.println(bVal); //-128 출력(데이터 손실)
		
		//Byte의 최대~최솟값에 ival이 들어갈 때만 casting 하는 조건문
		if (iVal >= Byte.MIN_VALUE && iVal <= Byte.MAX_VALUE) {
			bVal = (byte)iVal;
		}else {
			System.out.println("casting 할 변수값 범위를 확인하세요");
		}
		
		
	}
}
