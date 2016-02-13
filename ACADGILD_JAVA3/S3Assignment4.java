package Newpackage;

import java.util.Scanner;

public class S3Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double input1,input2,result;
		S3Assignment4 obj1=new S3Assignment4();	
		Scanner cal=new Scanner(System.in);
		
		System.out.print("Enter your first value : ");
		input1=cal.nextDouble();
		
		System.out.print("Enter your second value : ");
		input2=cal.nextDouble();
		
		result=obj1.addition(input1, input2);
		System.out.println("Addition of given numbers: "+result);
		
		result=obj1.Subtraction(input1, input2);
		System.out.println("Subtraction of given numbers: "+result);
		
		result=obj1.Multiplication(input1, input2);
		System.out.println("Multiplication of given numbers: "+result);
		
		result=obj1.division(input1, input2);
		System.out.println("Division of given numbers: "+result);
		
	}
		
	
		double addition(double val1,double val2){
		double res;	
		res=val1+val2;
		return res;
		}
		
		double Subtraction(double val1,double val2){
			double res;	
			res=val1-val2;
			return res;
		}
		
					
		double Multiplication(double val1,double val2){
			double res;	
			res=val1*val2;
			return res;
		}
		
		double division(double val1,double val2){
			double res;	
			res=val1%val2;
			return res;
		}
					
	}


