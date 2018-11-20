package com.basics.exercises;

public class Inheritance {

	public static void main(String[] args) {
		System.out.println("Inheritance example");
		
		GrandChild ref = new GrandChild();
		System.err.println("haritha : " + ref.display());
		
		
	}

}

class Parent {
	
//	@Override
	public String display() {
		return "Parent";
	}
	
}

class Child extends Parent {

//	@Override
//	public String display() {
//		return "Child";
//	}

	public String displayChild() {
		return "Child Display";
	}

}


class GrandChild extends Child {

//	@Override
//	public String display() {
//		return "Grand Child";
//	}
	
	public String displayGrandChild() {
		return "Grand Child Display";
	}
	
}

interface WebDriver {
	WebElement findById();
	void sendKeys(String keys);
}

interface WebElement { 
}

class RemoteWebDriver implements WebDriver {
	@Override
	public WebElement findById() {
		//common logic which work for all browsers except IE
		return null;
	}

	@Override
	public void sendKeys(String keys) {
		throw new UnsupportedOperationException("this method is no suported yet, do not use");
	}
}

class IEWebDriver extends RemoteWebDriver {
	@Override
	public WebElement findById() {
		//IE specific
		return null;
	}
}

class FireFoxWebDriver extends RemoteWebDriver {
}

class ChromeWebDriver extends RemoteWebDriver {
}
