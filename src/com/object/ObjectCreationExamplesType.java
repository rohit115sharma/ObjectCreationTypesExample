package com.object;

public class ObjectCreationExamplesType {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
		
		//creating object through new keyword
		Test test=new Test();
		System.out.println("through new keyword"+test);
		
		
		//Through reflection
		
		Class ref=Class.forName("com.object.Test");
		Object object1= ref.newInstance();
		System.out.println("through reflection"+object1);
		
		//using clone method
		//we can create copy of already created object
		//we have to implement clonable interface and override the clone method
		Test te=(Test) test.clone();
		System.out.println("through cloning " +te);
		
		//using class loader
		ObjectCreationExamplesType ob=(ObjectCreationExamplesType) new ObjectCreationExamplesType().getClass().getClassLoader().loadClass("com.object.Test").newInstance();		
		System.out.println(""+ob);
		

	}

}

class Test implements Cloneable{
	public int a =10;
	public Test() {
	System.out.println("object breated and memory allocated");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

