package ex01_Thread;

public class QuizMain {
//	QuizMain클래스를 만들고 이 메인 클래스에서는
//	QuizThread qt = new QuizThread();
//	qt.start();//스레드 구동
//	qt.startGame();//문제풀이 함수
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
	}
}
