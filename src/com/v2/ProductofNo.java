package com.v2;

import java.util.Scanner;

public class ProductofNo {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);{
		System.out.println("Enter the Multipilication table : ");
		int  n= sc.nextInt();
		
		for(int i =1; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
			
		}		
			
			
			sc.close();
		}

	}

}
