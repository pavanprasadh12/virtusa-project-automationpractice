package org.virtusaproject.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.virtusaproject.utils.BaseClass;

public class tShirtPF extends BaseClass {
	
	public tShirtPF() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tShirtBtn;
	
	@FindBy(xpath="(//a[@title='Add to cart'])")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkOut1;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkOut2;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement checkOut3;
	
	@FindBy(id="cgv")
	private WebElement terms;
	
	@FindBy(name="processCarrier")
	private WebElement checkOut4;
	
	

}
