package exam01;

public class HybridCar extends Car{
	
	int electricGauge;

	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		// TODO Auto-generated method stub
		super.showCurrentGauge();	// 잔여 가스량 출력
		System.out.println("잔여 전기량 : " + electricGauge);
	}
}
