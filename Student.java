package Task_two;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Subject_marks=0;
		int i;
		int Total_marks=0;//initialize to add the subjects
		System.out.println("enter the number of subjects");
		int n=sc.nextInt();
		for( i=1;i<=n;i++) {
			System.out.println("enter the marks of "+i+"st subject  out of 100");
			Subject_marks =sc.nextInt();
		 if(Subject_marks>0 && Subject_marks <=100) {
			 
		 Total_marks =Total_marks+Subject_marks;
		}
		 else {
			 System.out.println("marks are not valide enter correct marks");
			 break;
		 }
		 
		
	}
		
		//1.Calculate Total Marks: Sum up the marks obtained in all subjects. 
		System.out.println("sumation of all suject are =" + Total_marks);
		
		//2.Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
		float avg_percentage= (float)(Total_marks/n);
		System.out.println("average percentage of student is = "+avg_percentage+"%");
	
		
		//3.Grade Calculation: Assign grades based on the average percentage achieved.
		if(avg_percentage>=0&&avg_percentage<35) {
			System.out.println("Grade of student is : F");
		}
		else if(avg_percentage>=36&&avg_percentage<=60) {
			System.out.println("Grade of student is : B");
		}
		else if(avg_percentage>=61&&avg_percentage<=70) {
			System.out.println("Grade of student is : B++");
		}
		else if(avg_percentage>=71&&avg_percentage<=80) {
			System.out.println("Grade of student is : A");
			
		}
		else if(avg_percentage>=81&&avg_percentage<=90) {
			System.out.println("Grade of student is : A++");
		}
		else if(avg_percentage>=91&&avg_percentage<=100) {
			System.out.println("Grade of student is : O");
		}
		else {
			System.out.println("plaese uppend right grade");
		}
		}
	
	
	}
		
	


