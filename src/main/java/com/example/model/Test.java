package com.example.model;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotBlank;

public class Test {

	@NotBlank(message = "[test] is NULL")
	private String test;

	@DecimalMax(inclusive = true, value = "3")
	private int test1;

	public Test() {
		super();
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public int getTest1() {
		return test1;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

}
