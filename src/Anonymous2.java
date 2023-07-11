// 익명클래스 생성

public class Anonymous2 {
	
	//필드 즉 멤버변수 초긱밧으로 설정하는 익명 문법
	RemoteControl field = new RemoteControl() {		
		@Override
		public void turnOn() {
			
			System.out.println("Tv on");
		}
		
		@Override
		public void turnOff() {
			System.out.println("Tv off");
			
		}
	}; // 첫번째 익명클래스 문법 -> Anonymous2$1.class 
	
	void method01() {
		//로컬 지역변수 값으로 설정하는 익명클래스 문법
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("유튜브 켠다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("유튜브 끈다");
			}
		};// 두번째 익명클래스 문법 -> Anonymous2$2.class
		
		localVar.turnOn();
	}// method01()
	
	void method02(RemoteControl rc) {
		rc.turnOn();
		
	}
}
























