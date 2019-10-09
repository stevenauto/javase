package com.steven.pattern.singleton;

public class MySingtonTest {
	public static MySingtonTest getInstance() {
		return test.INSTANCE.getInstance();
	}

	
	private MySingtonTest() {
		
	}
	
	public static enum test {
		INSTANCE;
		private MySingtonTest instance=null;
		private test() {
			instance=new MySingtonTest();
		}
		public MySingtonTest getInstance() {
			return instance;
		}
		
	}
	
	public static void main(String[] args) {
		
		MySingtonTest instance1=MySingtonTest.getInstance();
		MySingtonTest instance2=MySingtonTest.getInstance();
		System.out.println(instance1==instance2);

	}

}
