// 중첩인터페이스: 외부 클래스 내부에 선언되는 인터페이스를 말한다. 


public class Button {
	
	interface OnClickListener{
		void onClick(); // public abstract가 생략된 추상메서드 -> {}가 없고, 실행문장이없고, 호출 불가능
	}// 중첩 인터페이스
	
	OnClickListener listener; //중첩 인터페이스로 참조변수 선언
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); //오버라이팅한 메서드 호출
	}
}
