package khie;

/*
 * "두 번째 java 프로그램입니다. 콘솔 화면에 출력하고 있습니다."
 * 라는 문자열을 화면에 출력하는 방법
 */
public class Basic_02 {
	public static void main(String[] args) { // main 입력후 ctrl spacebar

		// 첫 번째 방법
		System.out.println("두 번째 java 프로그램입니다. 콘솔 화면에 출력하고 있습니다.");
		System.out.println(); // 공백 줄

		// 두 번째 방법

		System.out.print("두 번째 java 프로그램입니다.");
		System.out.println(" 콘솔 화면에 출력하고 있습니다.");
		System.out.println();

		//세 번째 방법
		System.out.println("두 번째 java 프로그램입니다." + " 콘솔 화면에 출력하고 있습니다.");
		System.out.println();
		
		String str = "두 번째 java 프로그램입니다. 콘솔 화면에 출력하고 있습니다.";
		System.out.println(str);
	}
}
