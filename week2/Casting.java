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
		
	}
}
