package STUDENT_GRADE_CALCULATOR;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Subject :");
		int numSubjects = sc.nextInt();
		
		if(numSubjects <=0) {
			System.out.println("Please Enter a Valid Of The Subject :");
			return;
		}
		int totalMarks = 0;
		int maxMarksPerSubject = 100;
		
		for(int i=1;i<=numSubjects;i++) {
			System.out.println("Enter Marks Obtained in subject"+i+"(out of 100):");
			int marks = sc.nextInt();
			
			if(marks<0 || marks > maxMarksPerSubject) {
				System.out.println("Marks should be in the range of 0 to 100. please enter valid marks...");
				i--;
			}else {
				totalMarks +=marks;
			}
		}
		double averagePercentage = (double) totalMarks / (numSubjects * maxMarksPerSubject)*100;
		System.out.println("Total Marks:"+totalMarks);
		System.out.println("Average Percentage:"+averagePercentage +"%");
		
		String grade;
		
		if(averagePercentage >= 90) {
			grade ="A+";
		}
		else if (averagePercentage >= 80) {
			grade ="A";
		}
		else if(averagePercentage >=70) {
			grade ="B+";
		}
		else if(averagePercentage >=60) {
			grade ="B";
		}
		else if(averagePercentage >=50) {
			grade ="C";
		}
		else if(averagePercentage >=40) {
			grade ="D";
		}
		else if(averagePercentage >=30) {
			grade ="E";
		}
		else {
			grade ="F";
		}
		System.out.println("Grade: "+grade);





	}

}
