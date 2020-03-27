package org.virtusaproject.stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.virtusaproject.pagefactory.tShirtOrderPF;
import org.virtusaproject.utils.BaseClass;

import cucumber.api.java.en.*;

public class tShirtOrderExe extends BaseClass {

	String OrderNumber;
	tShirtOrderPF order = new tShirtOrderPF();
	
	
	
	@Given("user launches browser and pass url")
	public void user_launches_browser_and_pass_url() {
		
		Hook.driver.get("http://automationpractice.com/index.php");
	
	}

	@When("user clicks signIn link")
	public void user_clicks_signIn_link() {
		
		click(order.getSignIn());
	
	}

	@When("user enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> list = dataTable.asList();
		input(order.getEmailID(), list.get(0));
		input(order.getPassword(), list.get(1));
	}

	@When("users clicks signIn button")
	public void users_clicks_signIn_button() {
		click(order.getSubmit());
		
	}

	@When("user clicks on tShirt button")
	public void user_clicks_on_tShirt_button() {
		iWait1();
		click(order.gettShirtBtn());
	
	}

	@When("user clicks on AddToCard button")
	public void user_clicks_on_AddToCard_button() {
		iWait1();
		mouseOver(order.getSelectTShirt());
		iWait1();
		click(order.getAddToCart());
		
	}

	@When("user clicks on ProceedToCheckOut button")
	public void user_clicks_on_ProceedToCheckOut_button() throws InterruptedException {
		Thread.sleep(3000);
		click(order.getCheckOut1());
	}

	@When("user to check the order and clicks submit")
	public void user_to_check_the_order_and_clicks_submit() {
		iWait1();
		click(order.getCheckOut2());
	}

	@When("user submit Address Confirmation")
	public void user_submit_Address_Confirmation() {
		iWait1();
		click(order.getCheckOut3());
	}

	@When("user checks terms service and clicks submit")
	public void user_checks_terms_service_and_clicks_submit() {
		iWait1();
		click(order.getTerms());
		click(order.getCheckOut4());
	}

	@When("user clicks pay by check")
	public void user_clicks_pay_by_check() {
		iWait1();
		click(order.getPayByCheck());
	
	}

	@When("user clicks on confirm my order")
	public void user_clicks_on_confirm_my_order() {
		iWait1();
		click(order.getConfirmOrder());
		
	}
	
	@Then("user verifies order in order history")
	public void user_verifies_order_in_order_history() {
		String brs = driver.findElements(By.tagName("div")).get(49).getAttribute("innerText");
		String[] split = brs.split(" ");
		int count=0;
		List<String> li = new ArrayList<String>();
		for (String string : split) {
			li.add(string);
			count = count+1;
		}
		String OrderNumber1 = li.get(24).replace(".", "");
		OrderNumber = OrderNumber1.replace("-", "").trim();
		click(order.getBackToOrders());
		WebElement webElement = driver.findElements(By.tagName("tr")).get(1);
		String Order = webElement.findElements(By.tagName("td")).get(0).getText();
		Assert.assertEquals("Order Not Matched",OrderNumber, Order);
	}

	
}
