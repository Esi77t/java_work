package ex01_innerClass;

// 인터페이스를 생성
interface buttonClickListener{
	// 추상 메서드를 생성
	abstract void click();
}

public class AnonymousExample {
	// 내부 클래스
	public class Button {
		// buttonClickListener 타입의 변수를 가진다
		// 인터페이스의 구현체를 가진다
		private buttonClickListener listener;
		
		// 멤버 변수는 private으로 지정하는 일이 많기 때문에 직접 접근하는 것이 불가능
		// public으로 된 메서드를 통해서 접근을 하는 일이 많다
		// setter & getter
		public void setListner(buttonClickListener listener) {
			this.listener = listener;
		}
		
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {
		// 외부 클래스의 객채
		AnonymousExample exam = new AnonymousExample();
		// 내부 클래스의 객체 (외부 클래스의 객체로부터 생성)
		// button.listener에 접근할 수 없다
		AnonymousExample.Button button = exam.new Button();
		
		// 익명 클래스
		// 인터페이스를 통해서 생성하고
		button.setListner(new buttonClickListener() {
			@Override
			public void click() {
				System.out.println("버튼 클릭됨");	
			}
		});
		button.click();
	}
}
