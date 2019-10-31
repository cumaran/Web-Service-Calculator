package com.cgi.ws;

import javax.xml.ws.Endpoint;
// to publish calculator
public class MyCalcPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://192.168.43.50:9099/WSCalculator/calc", new MyCalculator());
		System.out.println("Calculator service running...");
	}

}
