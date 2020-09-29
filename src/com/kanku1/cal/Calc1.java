package com.kanku1.cal;


import java.io.*;
import java.util.Scanner;

public class Calc1 {
	
	public long first;
	public long second;
	
	public Calc1(long first, long second) {
		this.first = first;
		this.second = second;
	}
	
	public long getFirst() {
		return first;
	}

	public long getSecond() {
		return second;
	}

public long addFucn(long first, long second){
		
		return first+second;
	}
	
	public long subFucn(long first, long second){
		
		return second-first;
	}
	
	public long mulFucn(long first, long second){
		
		return first*second;
	}

		public static void main(String[] args) {
		
			Console c=System.console();
			
			Scanner se=new Scanner(System.in); //type casting
					
			System.out.println("Enter first value"); 
			long first = se.nextLong();  //type casting
			System.out.println("Enter second value");
			long second = se.nextLong();  //type casting
			
			
		Calc1 cal = new Calc1(first,second);
		
		String output = String.format("\n*** Your Results ***\n\nFirst: %d\nSecond: %d\n\nSum : %d\nDifference : %d\nProduct : %d\n\n", cal.first, cal.second, cal.addFucn(first, second), cal.subFucn(first, second), cal.mulFucn(first, second));
		System.out.println(output);
	}
}
