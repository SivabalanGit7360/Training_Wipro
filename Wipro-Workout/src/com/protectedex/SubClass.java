package com.protectedex;

public class SubClass extends SuperClass{
	
	public void accessProtected() {
		
		//subclass can access protected members of its superclass
		
		protectedField = 10;
		protectedMethod();
	}

}
