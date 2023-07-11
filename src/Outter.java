// 메소드 호출이 끝이 나면 메소드 소속의 매개변수나 지역변수는 스택 메모리에서 사라진다. 하지만 해당 메서드 내부의 로컬 지역 클래스 객체는 메소드 호출이 끝이 나도 메모리에 남아있다. 
// 로컬지역 내부 클래스에서 메소드의 매개변수나 지역변수를 복사를해 놓고 사용하다 보니 값 불일치 현상이 발생할 수 있다.
// 결국 로컬 지역 내부에서는 매개변수나 지역변수가 메모리에 남아 있어서 값을 변경하는 경우가 발생하면 값 불일치 현상이 발생하기 때문에 메소드 소속의 매개변수나 지역변수는 값 수정을 못하게 jdk 1.7이전에서는 final 상수로 선언해서 값 수정을 못하게하고
// jdk 1.8 이후로 부터는 final을 묵시적으로 생략해도 상수로 인식이되어서 값을 수정할 수가 없다.


public class Outter {
	// jdk 1.7 이전
	
	public void method01(final int arg) {
		final int localVariable = 1;
		
		// arg = 10;
		// localVariable = 100;
		
		class Inner{ //로컬 지역 내부 클래스 -> 외부클래스$1내붘ㄹ래스명.class(Outter$1Inner.class)
			public void method() {
				int result = arg + localVariable;
			}
			
		}
	} // method01()
	
	public void method02(int arg) { // int arg 매개변수 앞에 final이 생략된 상수로 인식
		int localVariable = 1; // final이 생략된 지역상수로 인식
		
		// arg = 100;
		// localVariable = 100;
		
		class Inner{
			public void pr() {
				int result = arg + localVariable;
			}
		}// 로컬 지역 내부 클래스 -> Outter$2Inner.class 
	}// method02()
}
