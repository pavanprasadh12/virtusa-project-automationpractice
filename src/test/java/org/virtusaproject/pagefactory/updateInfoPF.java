package org.virtusaproject.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.virtusaproject.utils.BaseClass;

public class updateInfoPF extends BaseClass{

	public updateInfoPF() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;
	
	@FindBy(id="email")
	private WebElement emailID;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement submit;
	
	@FindBy(xpath="//a[@title='Manage my personal information']")
	private WebElement personalInfo;
	
	@FindBy(id="firstname")
	private WebElement fName;
	
	@FindBy(name="lastname")
	private WebElement lName;
	
	@FindBy(name="email")
	private WebElement emailCNF;
	
	@FindBy(name="old_passwd")
	private WebElement passwordCNF;
	
	@FindBy(name="submitIdentity")
	private WebElement saveUpdt;

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmailID() {
		return emailID;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getPersonalInfo() {
		return personalInfo;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getEmailCNF() {
		return emailCNF;
	}

	public WebElement getPasswordCNF() {
		return passwordCNF;
	}

	public WebElement getSaveUpdt() {
		return saveUpdt;
	}

	
	
}
