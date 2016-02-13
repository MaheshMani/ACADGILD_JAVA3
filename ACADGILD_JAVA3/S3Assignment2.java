package Newpackage;

import java.util.Scanner;

public class S3Assignment2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double input;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Value for Prime Check: ");
		input=scan.nextDouble();
		
		S3Assignment2 obj1=new S3Assignment2();
		obj1.primenumber(input);
		
		
}
		
	void primenumber(double val){
		double i,res;
		char flag='Y';
		
		for(i=2;i<val;i++){
			res=(val%i);
			
			if (res==0){
				flag='N';
				break;
			}
			else if (res!=0){
				flag='Y';
			}
		}	
		
			//System.out.println(flag);
		if(flag =='N'){
			System.out.println("The given number is not a prime number.");
		}
		else if(flag=='Y'){
			System.out.println("The given number is a prime number.");
	
				
		}
	}
		
}
		
