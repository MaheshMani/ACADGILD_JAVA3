import java.util.Scanner;

class S2Assignment4 {

public static void main(String[] args){

//String [] month={Jan,Feb,Mar,Apr,May,June,July,Aug,Sep,Oct,Nov,Dec};

//int [] days={31,28,31,30,31,30,31,31,30,31,30,31};

System.out.println("                 _______________");
System.out.println("                 |1.January    |"); 
System.out.println("                 |2.February   |");
System.out.println("                 |3.March      |");
System.out.println("                 |4.April      |");
System.out.println("                 |5.May        |");
System.out.println("                 |6.June       |");
System.out.println("                 |7.July       |");
System.out.println("                 |8.August     |");
System.out.println("                 |9.September  |");
System.out.println("                 |10.October   |");
System.out.println("                 |11.November  |");
System.out.println("                 |12.December  |");
System.out.println("                 _______________");

System.out.print(" Please choose the month (enter the serial no) :  ");

Scanner obj1=new Scanner(System.in);
int month=obj1.nextInt();

switch(month){

case(1):
     System.out.println("Days for the month of January=31.");
     break;		

case(2):
     System.out.println("Days for the month of February=28.");
     break;

case(3):
     System.out.println("Days for the month of March=31.");
     break;

case(4):
     System.out.println("Days for the month of April=30.");
     break;

case(5):
     System.out.println("Days for the month of May=31.");
     break;

case(6):
     System.out.println("Days for the month of June=30.");
     break;

case(7):
     System.out.println("Days for the month of July=31.");
     break;

case(8):
     System.out.println("Days for the month of August=31.");
     break;

case(9):
     System.out.println("Days for the month of September=30.");
     break;

case(10):
     System.out.println("Days for the month of October=31.");
     break;

case(11):
     System.out.println("Days for the month of November=30.");
     break; 
case(12):
     System.out.println("Days for the month of December=31.");

}

}
}

 
