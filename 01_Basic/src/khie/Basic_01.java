package khie;

// java에서 한 줄 주석문

/*
 * java에서 두 줄 이상의 주석문
 * 
 * 내용 : java 기초
 * 작성자 : 고 강 찬
 * 작성일 : 2023.01.03
 */
/*
* 	java 프로그램 작성방법 
* 1.클래스 단위로 프로그램을 작성한다. => 클래스 이름 작성 시 첫 글자는 대문자로 작성한다.
* 2.하나의 문장은 반드시 세미콜론(;)으로 끝난다.
* 3.클래스의 이름은 첫글자를 대문자로 작성을 하고, 메서드의 이름은 첫글자르 소문자로 작성을 한다.
* 4.main() 메서드 : 프로그램의 시작 위치를 의미한다. 가장 먼저 실행이 된다. ==> JVM이 main() 메서드를 찾아서 메서드 안의 
* 내용을 순차적으로 실행을 한다.
* 
*/

/*
 * java 소스 코드의 실행 과정(4단계)
 * 1.java 소스 파일(.java) 작성
 * 2.소스 파일(.java)을 작성한 후 컴파일을 수행하면 자바가상머신(JVM)에서 동작하는 바이트 코드(.class)가 생성이 된다.
 * 이클립스 사용 시에는 소스 코드의 저장만으로도 컴파일이 자동으로 수행이 된다. 소스 파일과 바이트 코드는 각각의 프로젝트 내의 
 * src 폴더와 bin 폴더 안에 위치함.
 * 3.바이트 코드 (.class)를 실행을 하면 자바가상머신(JVM)은 운영체제에서 메모리를 할당을 받게 됨.
 * 4.자바가상머신(JVM)이 main()메서드를 실행을 함.
 */
public class Basic_01 { // Basic_01 클래스의 시작

	// 프로그램의 시작 위치를 의미함. 가장 먼저 실행이 되는 부분이다.
	public static void main(String[] args) {

		System.out.println("안녕하세요? 자바에 오신 여러분을 환영합니다.");

		System.out.println("Hello, JAVA!");

		System.out.print("D");

		System.out.println("강의실");

		System.out.println(); // 비어있는 줄을 출력함.

		System.out.println("자바 쉽죠?");
	} // main() 메서드의 끝
	/*
	 * - System.out 키워드 : 자바에서의 표준 출력장치를 의미함. 표준출력장치(모니터, 콘솔) //모니터나 콘솔로 출력 해주세요.
	 * 
	 * -println() 메소드 : 지정된 장치에 결과(" " 안의 내용)를 출력하는 메서드. ==> ln : line 이라는 뜻 ==> 출력을
	 * 해준 후 줄 바꿈을 하라는 의미를 가짐
	 * 
	 * -print() : 지정된 장치에 결과 (" " 안의 내용)를 출력하는 메서드 =>그러나 줄바꿈이 일어나지 않음 =>다음 줄로 이동하지
	 * 않고 다음에 출력될 내용을 옆(오른쪽)에 출력해주는 메서드.
	 */

	// - 이클립스 프로그램 사용 시 단축키
	// 1. Ctrl + S ==> 소스 파일을 저장하는 단축키.
	// 2. Ctrl + F11 ==> 프로그램을 실행하는 단축키.
	// 3.syso + ctrl + space bar ==> 출력문 코드 단축 키.
} // Basic_01 클래스의 끝
