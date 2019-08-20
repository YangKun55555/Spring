package com.young.spring.ioc.constructor;

/**
 * @author YangKun
 * @version 1.0
 * @date 2019/8/20 3:21 PM
 */
public class HomeAddress {
	public HomeAddress(String province, String city, String street) {
		this.province = province;
		this.city = city;
		this.street = street;
	}

	private String province;
	private String city;
	private String street;

	@Override
	public String toString() {
		return "HomeAddress{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				", street='" + street + '\'' +
				'}';
	}
}
