
public class AnonymousExample2 {
	public static void main(String[] args) {
		
		Anonymous2 an2 = new Anonymous2();
		
		an2.field.turnOn();
		an2.method01();
		
		an2.method02(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트 TV on");
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트 TV off");
			}
		}); //익명클래스 문법
	}
}
