package com.steven.pattern.singleton;

public class EnumSingleton {
	private EnumSingleton() {
		
	}
	public static EnumSingleton getInstance() {
		return Singleton.INSTANCE.getInstance();
	}
	public static enum Singleton {
		INSTANCE;
		
		private  EnumSingleton instance =null;
		private Singleton() {
			instance=new EnumSingleton();
		}
		public EnumSingleton getInstance() {
			return instance;
		}
	}

}
