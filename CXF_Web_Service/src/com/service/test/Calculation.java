package com.service.test;

import javax.jws.WebService;



@WebService(targetNamespace = "http://test.service.com/", endpointInterface = "com.service.test.CalEPI", portName = "CalculationPort", serviceName = "CalculationService")
public class Calculation implements CalEPI {
	public int addition(int a, int b) {
		return a + b;
	}

}
