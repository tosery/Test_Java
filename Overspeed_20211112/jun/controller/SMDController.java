package jun.controller;

import jun.domain.SpeedMeasuringDevice;

public class SMDController {
	
	public static final int LimitedSpeed = 100;
//	private SpeedMeasuringDevice SMD = new SpeedMeasuringDevice();
	private SpeedMeasuringDevice [] smdList = new SpeedMeasuringDevice[15];
	
	public SMDController(){
		smdList[0] = new SpeedMeasuringDevice("������", "13��1920",120,"2021/03/21");
		smdList[1] = new SpeedMeasuringDevice("BMW", "35��1420",120,"2021/12/21");
		smdList[2] = new SpeedMeasuringDevice("Audi", "23��1320",120,"2021/10/21");
		smdList[3] = new SpeedMeasuringDevice("Benz", "43��1620",120,"2021/11/21");
	}
	
	public SpeedMeasuringDevice[] printSMD() {
		return smdList;
	}
	
}
