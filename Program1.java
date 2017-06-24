
/**Program 1: Write a program to take the inputs in the following order and 
 * display the result as shown below.
Your program should use primitive arrays and for loop to get this work.
number of students, id as int, name as string, fee as double and section as char
***** User inputs *****
Number of students :
Enter student 1 Id :
1
Enter student 1 name:
ds
Enter student 1 fee :
10.50
Enter student 1 section :
c
Enter student 2 Id :
2
Enter student 2 name:
sd
Enter student 2 fee :
11.43
Enter student 2 section :
e
(repeat until number of students)*/



import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("***** User Inputs*****");
		System.out.println("Enter Number of students:");
		int numOfStudents=s.nextInt();
		
		int[] id = new int[numOfStudents];
		String[] name = new String[numOfStudents];
		double[] fee = new double[numOfStudents];
		char[] section = new char[numOfStudents];
		
		for(int i=0;i<numOfStudents;i++)
		{
			System.out.println("Enter Student "+(i+1)+" id:");
			id[i]=s.nextInt();
			System.out.println("Enter Student "+(i+1)+" name:");
			s.nextLine(); // to consume the \n (new line) leftover by s.nextInt() method.
			name[i]=s.nextLine();
			System.out.println("Enter Student "+(i+1)+" fee:");
			fee[i]=s.nextDouble();
			System.out.println("Enter Student "+(i+1)+" section:");
			section[i]= s.next().charAt(0);
		}
		
		System.out.println("\n\n********* Result *****************");
		System.out.println("id\tname\tfee\tsection");
		
		for(int i=0;i<numOfStudents;i++)
		{
			System.out.println(id[i]+"\t"+name[i]+"\t"+fee[i]+"\t"+section[i]);
		}
		
	}

}

