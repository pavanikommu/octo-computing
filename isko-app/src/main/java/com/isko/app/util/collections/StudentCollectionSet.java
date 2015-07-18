/**
 * 
 */
package com.isko.app.util.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author srinivas_kommu
 *
 */
public class StudentCollectionSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> sstudentNames = new HashSet<String>();
		System.out.println("total no of students attended concert "+sstudentNames.size());

		
		System.out.println("Student Colleciton Software");
		Scanner input = new Scanner(System.in);
		String name = "";
		String isStudentsAvailable;

		do {
			System.out.println("Enter Name of Student");
			name = input.next();
			sstudentNames.add(name);
			System.out.println("Did you find any more students..??? enter 'y'..");
			isStudentsAvailable = input.next();
			
		}while(isStudentsAvailable.equalsIgnoreCase("Y"));
		
		
		System.out.println("total no of students attended concert "+sstudentNames.size());
		System.out.println("student names as follows ");
		
		
		//enhanced for loop-->
		for(String studentName: sstudentNames)
		{
			System.out.println(studentName);
		}

	}

}
