// Submitted by Venkata Krishna Kanth Musunuru

/**Write a program to take the inputs in the following order and display the result as shown below.
Your program should use primitive arrays and control stmts to get this work.
number of students, id as int, name as string, fee as double and section as char
***** User inputs *****
Number of students :
Enter student 1 Id :
Enter student 1 name:
Enter student 1 fee :
Enter student 1 section :
(repeat until number of students)

Enter section that you want to see the result :
e
****** Result*********
Id Name Fee Section
2 sd 11.43 e*/

import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("***** User Inputs*****");
		System.out.println("Enter Number of students:");
		int numOfStudents=s.nextInt();
		
		int[] id = new int[numOfStudents];
		String[] name = new String[numOfStudents];
		double[] fee = new double[numOfStudents];
		char[] section = new char[numOfStudents];
		storeData(numOfStudents,0,id,name,fee,section);
		System.out.println("\n\n********* Result *****************");
		System.out.println("id\tname\tfee\tsection");
		display(numOfStudents,0,id,name,fee,section);		
			
	}
	
	private static void storeData(int numofstudents, int i, int[]id, String[] name, double[] fee, char[] section){
		Scanner s= new Scanner(System.in);
		if(i<numofstudents){
			System.out.println("Enter Student "+(i+1)+" id:");
			id[i]=s.nextInt();
			System.out.println("Enter Student "+(i+1)+" name:");
			s.nextLine(); // to consume the \n (new line) leftover by s.nextInt() method.
			name[i]=s.nextLine();
			System.out.println("Enter Student "+(i+1)+" fee:");
			fee[i]=s.nextDouble();
			System.out.println("Enter Student "+(i+1)+" section:");
			section[i]= s.next().charAt(0);
			i++;
			storeData(numofstudents,i,id,name,fee,section);
		}
	}
	private static void display(int numofstudents, int i, int[] id, String[] name, double[] fee, char[] section) {
		
		if(i<numofstudents){
			System.out.println(id[i]+"\t"+name[i]+"\t"+fee[i]+"\t"+section[i]);
			i++;
			display(numofstudents,i,id,name,fee,section);
		}
		
	}

}
