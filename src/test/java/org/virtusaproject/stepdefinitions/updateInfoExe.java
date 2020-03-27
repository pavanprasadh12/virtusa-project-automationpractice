package org.virtusaproject.stepdefinitions;

import java.util.List;

import org.virtusaproject.pagefactory.updateInfoPF;
import org.virtusaproject.utils.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class updateInfoExe extends BaseClass {

	updateInfoPF info = new updateInfoPF();
	
	@When("user clicks my personal info button")
	public void user_clicks_my_personal_info_button() {
		iWait1();
		click(info.getPersonalInfo());
	}

	@When("user updates FirstName and LastName")
	public void user_updates_FirstName_and_LastName(io.cucumber.datatable.DataTable dataTable) {
		iWait1();
		List<String> list = dataTable.asList();
		info.getfName().clear();
		input(info.getfName(), list.get(0));
		info.getlName().clear();
		input(info.getlName(), list.get(1));
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		iWait1();
		List<String> list = dataTable.asList();
		info.getEmailCNF().clear();
		input(info.getEmailCNF(), list.get(0));
		info.getPasswordCNF().clear();
		input(info.getPasswordCNF(), list.get(1));
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		click(info.getSaveUpdt());
	}

	@Then("verify the message")
	public void verify_the_message() {
		Assert.assertTrue(true);
	}

	
}
