package bsicProgramInjava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter first Number");
		int num1=s.nextInt();
		System.out.println("Enter second Number");
		int num2=s.nextInt();
		System.out.println("select your choice");
		int choice=s.nextInt();
		 int res=0;
		// int choice=0;
		switch (choice) {
		             case 1 : res=num1+num2;
		             System.out.println(res);
		             break;
		             
		             case 2 : res=num1-num2;
		             System.out.println(res);
		             break;
		             
		             case 3 : res=num1*num2;
		             System.out.println(res);
		             break;
		             
		             case 4 : res=num1/num2;
		             System.out.println(res);
		             break;
			
			         
                      default: System.out.println("Invalid input");
                      break;
		}
		
	}

}
