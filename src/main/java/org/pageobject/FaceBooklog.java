package org.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class FaceBooklog extends BaseClass {
	public FaceBooklog() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement passward;
	@FindBy(xpath="//button[@name=\"login\"]")
	private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassward() {
		return passward;
	}
	public void setPassward(WebElement passward) {
		this.passward = passward;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}

	
	

}
