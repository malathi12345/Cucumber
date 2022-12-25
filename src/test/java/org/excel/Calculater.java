package org.excel;

import java.util.concurrent.TimeUnit;

import org.test.BaseClass;

public class Calculater extends BaseClass {
  public static void main(String[] args) {
	maven("chome");
lanchurl("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
}
}
