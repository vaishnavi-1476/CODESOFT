package Task_foure;
import java.util.*;
public class Currency {
public static void main(String[] args) {
	Currency obj=new Currency();
	obj.Currency_convetor();
	 }
	
	 
	 public void Currency_convetor() {
		 Scanner sc=new Scanner(System.in);
			float targetcurrent;//in ruppes
			System.out.println("choose option from following ");
			System.out.println("1.India to Rasia");
			System.out.println("2.Rasia to India");
			System.out.println("3.America to India");
			System.out.println("4.Brazil to india");
			System.out.println("4. india to Brazil ");
			int choice =sc.nextInt();
			 
			 System.out.println("enter the amount ");
			 float exchange=sc.nextFloat();
			 if(exchange>0) {
			 switch (choice) {
			 case 1:
				 System.out.println("currency converted INR TO  RUB "+ exchange*1.052212 +"RUB");
				 break;
			 case 2:
				 System.out.println("currency converted RUB TO INR "+ exchange*0.95+"INR");
			 break;
			 
			 case 3:
				 System.out.println("currency converted  USD TO INR "+exchange*87.46275+" INR");
		break;
			 case 4:
				 System.out.println("currency converted BRL TO INR "+exchange*14.775136+ " INR");
		   
				 break;
			 case 5:
				 System.out.println("currency converted INR TO USD "+exchange*0.06708 +" BRL");
				 
				 break;
				 default:
					 System.out.println("please enter valide number");
					 Currency_convetor();
				 
			 }  
			 }
			 else {
					System.out.println("amount should be positive");
					Currency_convetor();
					
			 
	 }
}
}
