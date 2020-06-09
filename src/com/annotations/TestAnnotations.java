package com.annotations;

import org.testng.annotations.Test;

public class TestAnnotations {
	@Test(priority=0)
	public void Login() {
	System.out.println("Login");
	}
	

	@Test(priority=1)
	public void AccountEnquiry() {
	System.out.println("AccountEnquiry");
	}
	

	@Test(priority=2)
	public void FundTransfer() {
	System.out.println("FundTransfer")	;
	}
	

}
