package com.service.test;

import javax.jws.WebService;

@WebService(name = "CalEPI", targetNamespace = "http://test.service.com/")
public interface CalEPI {

	public abstract int addition(int a, int b);

}