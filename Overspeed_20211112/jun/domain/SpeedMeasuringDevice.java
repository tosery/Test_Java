package jun.domain;

public class SpeedMeasuringDevice {
	private String car;
	private String carNum;
	private int speed;
	private String date;
	
	public SpeedMeasuringDevice() {}
	
	public SpeedMeasuringDevice(String car, String carNum, int speed, String date) {
		this.car = car;
		this.carNum = carNum;
		this.speed = speed;
		this.date = date;
	}
	
	public String getCar() {
		return car;
	}

	public String getCarNum() {
		return carNum;
	}

	public int getSpeed() {
		return speed;
	}

	public String getDate() {
		return date;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String inform() {
		return "차종류: " + car + " / 차번호: " + carNum + " / 속력: " + speed + " / 날짜: " + date;		
	}

	@Override
	public String toString() {
		return "SpeedMeasuringDevice [car=" + car + ", carNum=" + carNum + ", speed=" + speed + ", date=" + date + "]";
	}
	
	
	

	
	
	
}
