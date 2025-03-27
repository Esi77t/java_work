package exam01;

public class HybridWaterCar extends HybridCar{
	
	int waterGauge;

	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();	// 잔여 가스량, 잔여 전기량
		System.out.println("잔여 물의 양 : " + waterGauge);
	}
	
}
