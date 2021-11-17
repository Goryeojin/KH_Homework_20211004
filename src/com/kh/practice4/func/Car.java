package com.kh.practice4.func;

public class Car {
	
	public String company;
	public String color;
	public int drive_sec;		// run메소드 실행 시 입력하기 때문에 굳이 public 접근제한자 붙일 필요 없다고 생각했습니다.
	public int drive_meter;	//  '' 이하동문
	public int speed;
	
	public String run(int drive_sec, int drive_meter) {
		
		double speed_per_sec = 0; 
		this.drive_sec = drive_sec;
		this.drive_meter = drive_meter;
		
		speed_per_sec = drive_meter / drive_sec;
		
		return (speed_per_sec+"m/s");
		
		
	}
	
	public void stop(int speed) {
		
		this.speed -= speed;
		
	}
	

}
