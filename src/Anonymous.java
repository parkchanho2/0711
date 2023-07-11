// 익명 클래스 문법
public class Anonymous {
	
	// 필드 초기값 (멤버변수 초기값)으로 대입
	
	Person field = new Person() {
		void work() {
			
			System.out.println("출근 합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	}; // 첫번쨰  익명클래스 => Anonymous$1.class(외부클래스명$번호.class로 컴파일된다.) 
	
	void method01() {
		//로컬 지역변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책을 합니다.");
			
			}

			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		}; // 두번째 익명클래스 -> Anonymous$2.class
		
		localVar.wake();
	} // method01
		
		void method02(Person person) {
			person.wake(); 
		}
}
