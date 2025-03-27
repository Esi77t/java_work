package exam01;

class FountainPen extends Pen {	// 만년필
    private String color; //볼펜의 색
    
    public String getColor() {
    	return color;
    }
    public void setColor(String color) {
    	this.color = color;
    }
    public void refill(int n) {
    	setAmount(n);
    }
}