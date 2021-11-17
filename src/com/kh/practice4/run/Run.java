package com.kh.practice4.run;

import com.kh.practice4.func.Car;
import com.kh.practice4.func.Dog;
import com.kh.practice4.func.Phone;

public class Run {
	
	public static void main(String[] args) {
		
		// Car 클래스 객체 tayo, poly
		
		Car tayo = new Car();
		Car poly = new Car();
		
		tayo.company = "현대";
		tayo.color = "파랑색";
		tayo.speed = 60;
		
		poly.company = "기아";
		poly.color = "흰색, 남색";
		poly.speed = 80;
		
		System.out.println("타요는 초속 " + tayo.run(30, 1000)+"로 달립니다.");
		System.out.println("폴리는 초속 " + tayo.run(10, 500)+"로 달립니다.");
		
		System.out.println("브레이크 밟기 전 타요 : " + tayo.speed);
		System.out.println("브레이크 밟은 후 폴리 : " + poly.speed);
		
		tayo.stop(30);
		poly.stop(50);
		
		System.out.println("브레이크 밟기 전 타요 : " + tayo.speed);
		System.out.println("브레이크 밟은 후 폴리 : " + poly.speed);
		
		
		// Phone 클래스 객체 ph1, ph2
		
		Phone ph1 = new Phone();
		Phone ph2 = new Phone();
		
		ph1.company = "apple";
		ph1.model = "iphone 11 pro";
		ph1.color = "silver";
		ph1.battery = 3;
		
		ph2.company = "samsung";
		ph2.model = "galaxy note 10";
		ph2.color = "black";
		ph2.battery = 90;
		
		ph1.address_save();
		System.out.println(ph2.recharge());
		
		
		// Dog 클래스 객체 mary, dury
		
		Dog dury = new Dog();
		Dog ssen = new Dog();
		
		dury.variety = "maltiz";
		dury.age = 3;
		dury.weight = 1.0;
		
		ssen.variety = "welsicogy";
		ssen.age = 5;
		ssen.weight = 2.5;
		
		System.out.println("두리의 몸무게 변화 (전) :" + dury.weight);
		dury.bark();
		dury.bark();
		System.out.println("두리의 몸무게 변화 (후) :" + dury.weight);
		
		System.out.println("쎈의 몸무게 변화 (전) :" + ssen.weight);
		ssen.eat();
		ssen.eat();
		System.out.println("쎈의 몸무게 변화 (후) :" + ssen.weight);
		
	}

}
