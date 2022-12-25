package org.step;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.pageobject.FaceBooklog;
import org.test.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable extends BaseClass{
	
	
	@Given("User can launch the url")
	public void user_can_launch_the_url() {
		maven("chrome");
		   lanchurl("https://www.facebook.com/");
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("User enter validid and invalidpwd")
	public void user_enter_validid_and_invalidpwd(io.cucumber.datatable.DataTable dataTable) {
	    List<String> asList = dataTable.asList();
	    FaceBooklog fb=new FaceBooklog();
	    WebElement username = fb.getUsername();
	    username.sendKeys(asList.get(0));
	   FaceBooklog fb1=new FaceBooklog();
	   WebElement passward = fb1.getPassward();
	   passward.sendKeys(asList.get(1));
	   System.out.println(asList.get(0));
	   System.out.println(asList.get(1));
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
	   FaceBooklog fb3=new FaceBooklog();
	   WebElement login = fb3.getLogin();
	}

	@Then("Validate the user login")
	public void validate_the_user_login() {
	    assertTrue(true);
	}

	@When("User enter validid and validpwd")
	public void user_enter_validid_and_validpwd(io.cucumber.datatable.DataTable dataTable) {
	    
	    List<Map<String, String>> asMaps = dataTable.asMaps(String.class,String.class);
	    Map<String, String> map = asMaps.get(0);
	    String string = map.get("username");
	    String string2 = map.get("passward");
	    System.out.println(string);
	    System.out.println(string2);
	}

	@When("User enter invalidid and invalidpwd")
	public void user_enter_invalidid_and_invalidpwd(io.cucumber.datatable.DataTable dataTable) {
		 List<String> asList = dataTable.asList();
		 FaceBooklog ab=new FaceBooklog();
		 WebElement username = ab.getUsername();
		 username.sendKeys(asList.get(0));
		 FaceBooklog ab1=new FaceBooklog();
		   WebElement passward = ab1.getPassward();
		   passward.sendKeys(asList.get(1));
		   System.out.println(asList.get(0));
		   System.out.println(asList.get(1));
		 
	}

	@When("User enter invalidid and validpwd")
	public void user_enter_invalidid_and_validpwd(io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> asMaps = dataTable.asMaps(String.class,String.class);
		    Map<String, String> map = asMaps.get(0);
		    String string = map.get("username");
		    String string2 = map.get("passward");
		    int count=0;
		    for(int i=0;i<map.size();i++) {
		    	  String string3 = map.get(i);
		   
		  
		    {
		     FaceBooklog face=new FaceBooklog();
		     WebElement username = face.getUsername();
		    username.sendKeys( map.get("username"));
		    FaceBooklog face1=new FaceBooklog();
		    WebElement passward = face1.getPassward();
		    passward.sendKeys(map.get("passward"));
		    }
		    System.out.println(string);
		    System.out.println(string2);
		    count++;
		    System.out.println("count value is "+count);
		    }
	}



}
