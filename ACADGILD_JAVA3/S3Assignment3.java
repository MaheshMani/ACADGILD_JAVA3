package Newpackage;

import java.util.Random;
import java.util.Scanner;

public class S3Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int input;
	
	Scanner num=new Scanner(System.in);	
	
	System.out.print("Enter the number range for random numbers: ");
	input=num.nextInt();
	
	S3Assignment3 obj1=new S3Assignment3();
	obj1.random_num(input); 
	}

	void random_num(int val){
		
		Random obj2=new Random();
		System.out.println("Random number is generating");
		for(int i=1;i<=10;i++){			
			System.out.println("Random number: "+i +" = " +obj2.nextInt(val));
	
		}
		System.out.println("Random numbers had been generated");
		
		
		
	}
	
}
