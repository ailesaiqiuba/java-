package com.string;

import java.util.Properties;
import java.util.Set;

public class System_property {

	public static void main(String[] args) {
		Properties xtsj=System.getProperties();
		Set<String> sxm=xtsj.stringPropertyNames();
	for(String key:sxm) {
		String value=System.getProperty(key);
		System.out.println(key+"-->"+value);
	}

	}

}
