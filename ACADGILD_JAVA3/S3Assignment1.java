package Newpackage;

import java.util.Scanner;

public class S3Assignment1 {
	
	public static void main(String[] args) {

		double input;
		SqRtCbRt obj1=new SqRtCbRt();

		Scanner scan=new Scanner(System.in);

		System.out.print("Enter your value: ");
		input=scan.nextDouble();

		obj1.SqRt(input);
		obj1.CbRt(input);

			}

		void SqRt(double val){
		System.out.println("SquareRoot of " + val +" = " +Math.sqrt(val));
			
		}

		void CbRt(double val1){
		System.out.println("CubeRoot of " + val1 +" = " +Math.cbrt(val1));
		}

		}



