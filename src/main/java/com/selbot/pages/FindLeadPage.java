package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class FindLeadPage extends Annotations{
	
	public FindLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@name='firstName'])[3]") WebElement eleFirstName;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a") WebElement eleClickFirstRec;
	@FindBy(how = How.LINK_TEXT, using = "Find Leads") WebElement eleFindLead;
	
	public FindLeadPage enterFirstName(String firstName) {
		eleFirstName.clear();
		eleFirstName.sendKeys(firstName);
		return this;
	}
	
	public FindLeadPage clickFindLead() {
		eleFindLead.click();
		return this;
	}
	
	public ViewLeadPage clickFirstRecord() {
		eleClickFirstRec.click();
		return new ViewLeadPage();
	}

}
