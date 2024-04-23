package com;

import java.util.Scanner;

class AreaRectangle{

	void Rectangle(double l, double b){
	
    double area = l * b;
    System.out.println("The area of rectangle is  "+ area);
	
}
}
public class AreaOfRectangle {

	public static void main(String[] args) {
		
		double length;
		double breadth;
		
		AreaRectangle obj = new AreaRectangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length : ");
		length = sc.nextDouble();
		System.out.println("Enter the Breadth : ");
		breadth = sc.nextDouble();
		
		
		
		obj.Rectangle(length,breadth);
		

	}

}
