package khie;

// java에서 출력 양식
public class Basic_06 {

	public static void main(String[] args) {

		// System.out.println()
		// System.out.print()
		// System.out.printf // f는 format의 약자임.

		System.out.printf("%d + %d = %d\n", 10, 20, (10 + 20)); // c언어에서의 printf랑 같음.

		System.out.println("10 " + "+" + " 20 = " + (10 + 20));

		System.out.printf("%o\n", 10); // 8진수

		System.out.printf("%x", 15); // 16 진수 A = 10, B = 11, C = 12, D = 13, E = 14, F = 15

		System.out.printf("%f\n", 3.2582);
		System.out.printf("%.2f\n", 3.2582); // 소숫점이하 2자리까지만 출력해주세요.
		System.out.printf("%.2f\n", 3.252); // 반올림을 해주기 때문에 값이 달라짐

		// Q...버림은요....? 올림은요...?
		
		/*
		 * 형식("%.소수점자리수f") =>정수는 그대로 출력이되고 소숫점 아래는 소숫점 자리수까지만 출력이됨.
		 */

		System.out.printf("%.2f\n", 123324.2585); // 반올림을 해주기 때문에 값이 달라짐
		
		System.out.printf("%d\n", 1000000000);
		System.out.printf("%,d\n", 1000000000); // 콤마를 표시해줌

	}

}
