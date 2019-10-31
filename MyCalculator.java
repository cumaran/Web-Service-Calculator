package com.cgi.ws;

import javax.jws.WebService;

@WebService
public class MyCalculator {
	public int add(int first, int second) {
		System.out.println(first+" + "+second);
		return first + second;
	}
	public int subtract(int first, int second) {
		System.out.println(first+" - "+second);
		return first - second;
	}
}
