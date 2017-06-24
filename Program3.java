//Submitted by Venkata Krishna kanth Musunuru.
/** Write a program to take the inputs in the following order and display the result as shown below.
Your program should use Student Object to store the Student details(id,name …) 
and store them in Array of Student type.
number of students, id as int, name as string, fee as double and section as char
***** User inputs *****
Number of students :
Enter student 1 Id :
Enter student 1 name:
Enter student 1 fee :
Enter student 1 section :
(repeat until number of students)

****** Result*********
Id Name Fee Section
1 ds 10.50 c
2 sd 11.43 e */

import java.util.Scanner;
class Student{
	
	 private int id;
	 private String name;
	 private double fee;
	 private char section;
	 
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public void display(){
		System.out.println(id+"\t"+name+"\t"+fee+"\t"+section);
	}
	
}


public class Program3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("***** User Inputs*****");
		System.out.println("Enter Number of students:");
		int numOfStudents=s.nextInt();
		
		Student[] rollcall = new Student[numOfStudents];
		
		for(int i=0; i<numOfStudents;i++){
			rollcall[i]= new Student();
			System.out.println("Enter Student "+(i+1)+" id:");
			rollcall[i].setId(s.nextInt());
			System.out.println("Enter Student "+(i+1)+" name:");
			s.nextLine();// to consume the \n (new line) leftover by s.nextInt() method.
			rollcall[i].setName(s.nextLine());
			System.out.println("Enter Student "+(i+1)+" fee:");
			rollcall[i].setFee(s.nextDouble());
			System.out.println("Enter Student "+(i+1)+" section:");
			rollcall[i].setSection(s.next().charAt(0));
		}
		
		System.out.println("\n\n********* Result *****************");
		System.out.println("id\tname\tfee\tsection");
		for(int i=0; i<rollcall.length;i++){
			rollcall[i].display();
		}

	}

}
