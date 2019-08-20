package com.young.spring.ioc.constructor;

/**
 * @author YangKun
 * @version 1.0
 * @date 2019/8/20 3:19 PM
 */
public class Person {
	public Person(String name,int age,HomeAddress homeAddress){
		this.name=name;
		this.age=age;
		this.homeAddress=homeAddress;
	}

	private String name;
	private int age;
	private HomeAddress homeAddress;

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", homeAddress=" + homeAddress +
				'}';
	}
}
