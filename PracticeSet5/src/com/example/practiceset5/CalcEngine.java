package com.example.practiceset5;

public class CalcEngine {
	
	//Same as PS4
	//My calculate code for parameters
	

	public static double Calculate(double Amount,double Years,double Rate){
		double realrate = Rate/100;
		double Interest = Amount*(((Math.pow((1+realrate),Years)-1)));
		double Sum = Amount + Interest;
		return Sum;
	}
	
	/*
	 *Simple Tests to make sure I'm doing alright
	 * 
	public static void main(String[] args){
		System.out.println(Calculate(10000,3,3.25));
	}
	*/
}
