package week2;

public class DataType3 {
	public static void main(String[] args) {
		byte bData = (byte)128;				//바이트는 -128~127까지임
		char cData = (char)-90;				//char은 음수 없음
		float fData = 3.14f;				//float은 뒤에 f
		long lData = 100000000000l;			//정수 기본은 int형이므로 끝에 l을 붙여 long형으로 변경 
		boolean boolD = true;				//true or false 만 가능
		
		System.out.println("bData :" + bData);
		System.out.println("cData :" + cData);
		System.out.println("fData :" + fData);
		System.out.println("lData :" + lData);
		System.out.println("boolD :" + boolD);

	}
}
