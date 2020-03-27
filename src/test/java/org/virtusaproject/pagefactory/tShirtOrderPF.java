package org.virtusaproject.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.virtusaproject.utils.BaseClass;

public class tShirtOrderPF extends BaseClass {

	public tShirtOrderPF(){
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

	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tShirtBtn;
	
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement selectTShirt;
	
	@FindBy(xpath="//a[@title='Add to cart']")
	private WebElement mOverAddtoCard;
	
	@FindBy(xpath="//a[@class='button ajax_add_to_cart_button btn btn-default']")
	private WebElement addToCart;
	
	@FindBy(xpath="(//div[@id='layer_cart']//div[@class='layer_cart_cart col-xs-12 col-md-6']//a[@title='Proceed to checkout'])")
	private WebElement checkOut1;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkOut2;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement checkOut3;
	
	@FindBy(id="cgv")
	private WebElement terms;
	
	@FindBy(name="processCarrier")
	private WebElement checkOut4;

	@FindBy(xpath="//a[@class='cheque']")
	private WebElement payByCheck;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmOrder;
	
	@FindBy(xpath="(//div[@class='box order-confirmation']//br)[3]")
	private WebElement orderNumber;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement backToOrders;
	
	public WebElement getBackToOrders() {
		return backToOrders;
	}

	public WebElement getOrderNumber() {
		return orderNumber;
	}

	public WebElement getPayByCheck() {
		return payByCheck;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

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

	public WebElement gettShirtBtn() {
		return tShirtBtn;
	}
	

	public WebElement getSelectTShirt() {
		return selectTShirt;
	}

	public WebElement getmOverAddtoCard() {
		return mOverAddtoCard;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getCheckOut1() {
		return checkOut1;
	}

	public WebElement getCheckOut2() {
		return checkOut2;
	}

	public WebElement getCheckOut3() {
		return checkOut3;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getCheckOut4() {
		return checkOut4;
	}
	
	
	
	
	
}
