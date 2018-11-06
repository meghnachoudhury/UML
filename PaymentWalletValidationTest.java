package com.cg.wallet.test;

import com.cg.payment.service.PaymentWalletValidation;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PaymentWalletValidationTest extends TestCase {

	PaymentWalletValidation validate = new PaymentWalletValidation();
	
	public void testValidateAadharNo() {
		
		Assert.assertEquals(true, validate.validateAadharNo("123456789011"));
		Assert.assertEquals(false, validate.validateAadharNo("98765"));
		
	}

	public void testValidateCustomerName() {
		
		Assert.assertEquals(true, validate.validateCustomerName("Meghna Choudhury"));
		Assert.assertEquals(false, validate.validateCustomerName("Mili"));
		
	}

	public void testValidateGender() {
		
		Assert.assertEquals(true, validate.validateGender("Male"));
		Assert.assertEquals(true, validate.validateGender("Female"));
		Assert.assertEquals(false, validate.validateGender("Blue"));
		
	}

	public void testValidateUserName() {
	
		Assert.assertEquals(true, validate.validateUserName("meghnachoudhury"));
		Assert.assertEquals(false, validate.validateUserName("meghnachoudhury"));
		
		
	}

	public void testValidateMobileNo() {
		
		Assert.assertEquals(true, validate.validateMobileNo("9176284639"));
		Assert.assertEquals(false, validate.validateMobileNo("mili1995"));
		
	}

	public void testValidateCustInitBal() {
		
		Assert.assertEquals(true , validate.validateCustInitBal(10000));
		Assert.assertEquals(false, validate.validateCustInitBal(100));
	
	}

	public void testValidateUserPassword() {
		
		Assert.assertEquals(true , validate.validateUserPassword("12345678"));
		Assert.assertEquals(false, validate.validateUserPassword("abc12345"));
	
	}

	public void testValidateEmailId() {
		
		Assert.assertEquals(true, validate.validateEmailId("meghnachoudhury1995s@gmail.com"));
		Assert.assertEquals(false, validate.validateEmailId("def"));
	
	}

}
