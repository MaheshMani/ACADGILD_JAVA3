
class S2Assignment2 {

public static void main(String[] args){

int a=1;
char print='N';
int b;
double res;

while(a<=100){

	if ((a==1)||(a==2)){
	print='Y';
	}
	else{
	
		for (b=2;b<a; b++){
			res=(a%b);

			if(res==0){
			print='N';
			//res = 0;
			break;
			}
			else{
			print = 'Y';
			}
		}
		
		
	}
	


if(print=='Y'){
System.out.print(" " +a);
}

a++;
}

}
}

 
