package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setEmpNo(100);
		emp.setEmpName("홍길동");
		emp.setDept("영업부");
		emp.setJob("과장");
		emp.setAge(25);
		emp.setGender('남');
		emp.setSalary(2500000);
		emp.setBonusPoint(0.05);
		emp.setPhone("010-1234-5678");
		emp.setAddress("서울시 강남구");
		
		System.out.println(emp.getEmpNo());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getDept());
		System.out.println(emp.getJob());
		System.out.println(emp.getAge());
		System.out.println(emp.getGender());
		System.out.println(emp.getSalary());
		System.out.println(emp.getBonusPoint());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddress());
		
		
	}
}
