package com.steven.interview;

public class Sington {
	
	public static void main(String[] args) {
		Sington sington1= Sington.getSington();
		Sington sington2 = Sington.getSington();
		if(sington1 == sington2) {
			System.out.print("This is Sington");
		} 
		else {
			System.out.print("This is not Sington");
		}
	}
	private static Sington instance = null;

	private Sington() {
		
	}
	
	public static Sington getSington() {
		
		if(null == instance) {
			
			synchronized (Sington.class) {
				if(null==instance) {
					instance=new Sington();
					
				}
				
			}
		}
		return instance;
	}

}
