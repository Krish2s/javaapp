package com.krish.company;

import java.util.Scanner;

public class grades {

	public static void main(String[] args) {

		// Write your code here
		char grade;
		int score=74;
		if (score>=90){
				grade = 'A';
		}
		else if (score>=80) {
				grade ='B';}
		else if (score>=70) {
			grade= 'C'; }
		else if (score>=60){
			grade= 'D';}
		else if (score>=40){
			grade= 'E';}
		else {
			grade= 'F'; }
		System.out.println("Your grade is : " + grade);

		switch (grade)
		{
			case'A':
				System.out.println("Outstanding!!!");
				break;
			case 'B':
				System.out.println("Excellent!!!");
				break;
			case 'C':
				System.out.println("Good!!!");
				break;
			case 'D':
				System.out.println("Average!!!");
				break;
			case 'E':
				System.out.println("Need Improvements!!!");
				break;
			case 'f':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Invalid!!!");
		}
		}

	}
