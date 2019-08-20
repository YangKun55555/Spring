package com.young.spring.ioc.constructor;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author YangKun
 * @version 1.0
 * @date 2019/8/20 3:31 PM
 */
public class Main {
	public static void main(String args[]){
		GenericApplicationContext applicationContext = new GenericApplicationContext();
		new XmlBeanDefinitionReader(applicationContext).loadBeanDefinitions("Beans.xml");
		applicationContext.refresh();
		Person person = applicationContext.getBean("person",Person.class);
		System.out.println(person.toString());
	}
}
